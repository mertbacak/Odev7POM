package pageobjectmodel.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjectmodel.SearchResult;

import java.util.List;

public class SearchResultPage extends BasePage{

    public SearchResultPage(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(css = ".result-text")
    private WebElement resulText;
    @FindBy(css = ".searchResultsItem")
    private List<WebElement> searhcResultItem;
    @FindBy(css = "[name='price_min']")
    private WebElement priceMintextbox;
    @FindBy(css = "[name='price_max']")
    private WebElement priceMaxTextbox;
    @FindBy(xpath="(//*[@class='btn btn-link js-manual-search-button'])[1]")
    private WebElement priceSearchButton;
    @FindBy(css = ".searchResultsPriceValue")
    private List<WebElement> searchResultItemPrice;
    @FindBy(css=".numeric-input-holder [name='a5_min']")
    private WebElement yearMin;
    @FindBy(css = ".numeric-input-holder [name='a5_max']")
    private WebElement yearMax;
    @FindBy(css = "#searchResultLeft-a5 .btn.btn-link.js-manual-search-button")
    private WebElement yearSearchButton;
    @FindBy(css="#currentSearchFilters [data-element='a5']")
    private WebElement yearEtiket;
    @FindBy(css="#currentSearchFilters [data-element='price']")
    private WebElement priceEtiket;
    @FindBy(xpath="(//*[@class='searchResultsAttributeValue'])")
    private List<WebElement> searhListItemYear;
    @FindBy(css = ".sort-order-menu ")
    private WebElement sortOrderMenuButton;
    @FindBy(xpath = "(//*[@class='sort-order-menu ']//li/a)[9]")
    private WebElement yillaraGöreEnEski;

    public void resultTextVisibility(){
        setWait(resulText);
        logger.info(resulText+" Elementi görüntülene kadar beklendi.");
    }
    public void searchResultItemSize(){
        int size=searhcResultItem.size();
        if (size>0)
        {
            logger.info("Listede ilan gelmiştir.İlan sayısı= "+size);
        }
        else{
            logger.error("Listede ilan gelmemiştir.İlan sayısı= "+size);
        }
    }
    public void priceMinTextboxSendKey(String priceMin){
        sendKeys(priceMintextbox,priceMin);
        logger.info("Fiyat Min TL alanına değer girildi.");
    }
    public void priceMaxTextboxSendey(String priceMax){
        sendKeys(priceMaxTextbox,priceMax);
        logger.info("Fiyat Max TL alanına değer girildi.");
    }
    public void priceSearchButtonClick(){
        click(priceSearchButton);
        logger.info("Fiyat Ara butonuna tıklandı.");
    }
    public void filterSearchItemPriceAssert(){

        for (WebElement price :searchResultItemPrice){
           String str=price.getText();
            String [] priceStr=str.split("TL",0);
            for (String a:priceStr){
                    float netPrice = Float.valueOf(a);
                    if (netPrice >= 100.0f && netPrice <= 250.0f) {
                        logger.info(a + " 100.000 TL'den yüksek 250.000'den düşüktür. Fiyat Filtresi doğru çalışmıştır.");
                    } else {
                        logger.error(a + " 100.000 TL ve 250.000 TL arasında değildir. Fiyat filtresi doğru çalışmamaktadır.");
                    }
                }
            }
        }
        public void yearMinSendKey(String yearMinn){
        sendKeys(yearMin,yearMinn);
        logger.info("Yıl min alanına yıl girildi.");
        }
        public void yearMaxSendKeys(String yearMaxx){
        sendKeys(yearMax,yearMaxx);
        logger.info("Yıl max alanına yıl girildi.");
        }
        public void yearSearchButtonClick(){
        click(yearSearchButton);
        logger.info("Yıl Ara butonuna tıklandı.");
        }
        public void yearEtiketVisibility(){
        setWait(yearEtiket);
        logger.info("Yıl etiketi görüldü.");
        }
        public void priceEtiketVisibility(){
            setWait(priceEtiket);
            logger.info("Yıl etiketi görüldü.");
        }
        public void searhListItemYearFilterControl() {
            int a=searhListItemYear.size();
            for (int i = 0; i <=a-1;  i+=3) {
              int s= Integer.valueOf(searhListItemYear.get(i).getText());
              if(s>=1990 && s<=2012){
                  logger.info(s+" Yıl alanı 1990'dan büyük 2012'den küçüktür ve yıl filtresi doğru çalışmıştır.");
              }
              else
              {
                  logger.error(s+"Yıl alanı 1990 ile 2021 aralığında değildir. Filtre alanı doğru ÇALIŞMAMAKTADIR.");
              }
            }
        }
        public void sortOrderMenuButtonClick(){
        click(sortOrderMenuButton);
        }
        public void siralamaYillaraGöreEnEskiClick(){
        click(yillaraGöreEnEski);
        logger.info("Sıralamada Yıllara göre En eski seçildi.");
        }
        public void yilaGöreEskisiralamaDegisikligiKontrol(){
            int b=1990;
            int a=searhListItemYear.size();
            for (int i = 0; i <=a-1;  i+=3) {
                int s = Integer.valueOf(searhListItemYear.get(i).getText());
                if (s>=b){
                    logger.info(s+" Büyüktür ya da eşittir "+b+"' den yıla göre en eski sıralama doğru çalışmaktadır.");
                }
                else {
                    logger.error(s+" Büyük değildir"+b+" 'den yıla göre en eski sıralama doğru ÇALIŞMAMAKTADIR.");
                }
                b=s;
            }
        }

}

