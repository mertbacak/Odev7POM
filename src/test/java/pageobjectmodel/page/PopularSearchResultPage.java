package pageobjectmodel.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PopularSearchResultPage extends BasePage{
    public PopularSearchResultPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(css = ".searchResultsRowClass>tr")
    private List<WebElement> searchListElement;
    @FindBy(xpath = "(//*[@class='searchResultsRowClass']//tr)[1]")
    private WebElement listFirstElement;
    @FindBy(css = ".searchResultsTitleValue .classifiedTitle")
    private List<WebElement> searchClassifiedTitle;
    @FindBy(css = ".searchResultsAttributeValue")
    private List<WebElement> searchClassifiedKilometer;
    @FindBy(css = ".searchResultsPriceValue span")
    private List<WebElement> searchClassifiedPrice;
    public void getClassifiedSize(){
       if (searchListElement.size()>0){
           logger.info("1 den fazla ilan yüklenmiştir.");
       }
       else {
           logger.info("İlan yüklenmemiştir.");
       }
    }

    public String getClassifiedTitle() {
        return  searchClassifiedTitle.get(0).getText();
    }

    public String getClassifiedKilometer(){
        return searchClassifiedKilometer.get(1).getText();
    }
    public String getClassifiedPrice(){
        return searchClassifiedPrice.get(0).getText();
    }
    public  void searchFirstElementClick()
    {
        click(listFirstElement);
    }

}
