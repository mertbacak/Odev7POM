package pageobjectmodel.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pageobjectmodel.PopularCategoryTest;

import java.util.List;

public class ClassifiedPage extends BasePage{
    public ClassifiedPage(WebDriver webDriver) {
        super(webDriver);
    }
    public static final Logger logger = LogManager.getLogger(ClassifiedPage.class);
    @FindBy(css = ".new-classified.ng-binding")
    private WebElement newClassified;
    @FindBy(css = ".modern-category-item[icon-id='3518']")
    private WebElement realestateCategory;
    @FindBy(xpath= "(//*[@scrollbar='category_select_scrollbar1']/div//li)[1]")
    private WebElement categoryResidence;
    @FindBy(xpath = "(//*[@scrollbar='category_select_scrollbar2']/div//li)[1]")
    private WebElement emlakKirilim;
    @FindBy(xpath = "(//*[@scrollbar='category_select_scrollbar3']/div//li)[1]")
    private WebElement emlakikinciKirilim;
    @FindBy(css = ".process-done.animation-done-scroll")
    private WebElement categorySelectedOK;
    @FindBy(css = ".classified-from-text-input.ng-pristine")
    private WebElement classifiedTitle;
    @FindBy(css = "[name='Açıklama']")
    private WebElement classifiedcomment;

    @FindBy(id ="addClassifiedPrice")
    private WebElement classifiedPrice;
    @FindBy(css = "[name='a24']")
    private WebElement classifiedMeter;
    @FindBy(css = "[name='a107889']")
    private WebElement classifiedMeterNet;
    @FindBy(css = "[name='a20']")
    private WebElement roomscount;
    @FindBy(css="[name='a812']")
    private WebElement buildingAge;
    @FindBy(css="[name='a811']")
    private WebElement bulunduguKat;
    @FindBy(css="[name='a810']")
    private WebElement katSayisi;
    @FindBy(css="[name='a23']")
    private WebElement heating;
    @FindBy(css="[name='a22']")
    private WebElement numbersofBathroom;
    @FindBy(css="[name='a106960']")
    private WebElement balcony;
    @FindBy(css="[name='a98426']")
    private WebElement usingStatus;
    @FindBy(css = "[name='a104239']")
    private WebElement dues;
    @FindBy(css="[name='a115950']")
    private WebElement deedStatus;
    @FindBy(css = "[name='a27']")
    private WebElement fromWho;
    @FindBy(css = "[name='a111578']")
    private WebElement videoCall;
    @FindBy(css = "[name='exchange']")
    private WebElement bartered;
    @FindBy(css = "[name='city']")
    private WebElement city;
    @FindBy(css = "[name='town']")
    private WebElement town;
    @FindBy(css = "[name='quarter']")
    private WebElement quarter;
    @FindBy(css = ".map.ng-isolate-scope.active")
    private WebElement map;
    @FindBy(xpath = "//*[@class='gmnoprint']/div/button[@aria-label='Büyüt']")
    private WebElement mapBuyut;
    @FindBy(css="[name='inApartmentComplex']")
    private WebElement siteIcerisinde;
    @FindBy(css = "[for='dontSelect0']")
    private WebElement facade;
    @FindBy(css = "[for='attribute_1'].detail-attributes-title")
    private WebElement icOzelliklertab;
    @FindBy(css = "[for='dontSelect1']")
    private WebElement icOzelliklerSecimIstemiyorum;

    @FindBy(css = "[for='attribute_2'].detail-attributes-title")
    private WebElement disOzelliklertab;
    @FindBy(css = "[for='dontSelect2']")
    private WebElement disOzelliklerSecimIstemiyorum;

    @FindBy(css="[for='attribute_3'].detail-attributes-title")
    private WebElement muhitTab;
    @FindBy(css = "[for='dontSelect3']")
    private WebElement muhitTabSecimYapmakIstemiyorum;
    @FindBy(css="[for='attribute_4'].detail-attributes-title")
    private WebElement ulasimTab;
    @FindBy(css="[for='dontSelect4']")
    private WebElement ulasimSecimYapmakIstemiyorum;
    @FindBy(css = "[for='attribute_5'].detail-attributes-title")
    private WebElement manzaraTab;
    @FindBy(css = "[for='dontSelect5']")
    private WebElement manzaraSecimYapmakIstemiyorum;
    @FindBy(css="[for='attribute_6'].detail-attributes-title")
    private WebElement konutTipiTab;
    @FindBy(css ="[for='dontSelect6']" )
    private WebElement konutTipiSecimYapmakIstemiyorum;

    @FindBy(css="[for='attribute_7'].detail-attributes-title")
    private WebElement engelliyeUygunTab;
    @FindBy(css ="[for='dontSelect7']" )
    private WebElement engelliyeUygunSecimYapmakIstemiyorum;
    @FindBy(xpath = "(//*[@class='add-post-rules']/label)[1]")
    private WebElement ilanKuralcheckbox;
    @FindBy(css = ".add-classified-submit.btn.btn-strong")
    private WebElement addClassifiedSubmit;


    public void  newClassifiedClick(){
        click(newClassified);
    }
    public void setRealestateCategoryClick(){

        click(realestateCategory);
    }
    public void ResidenceCategoryClick(){
        click(categoryResidence);
    }
    public void setEmlakKirilimClick(){

        click(emlakKirilim);
    }
    public void ikinciEmlakKirilimClick(){
        click(emlakikinciKirilim);
    }
    public void CategorySelectedOKClick()
    {
        click(categorySelectedOK);
    }

    public void setclassifiedTitle(String title){

        sendKeys(classifiedTitle,title);
    }
    public void setClassifiedcomment(String comment){

        sendKeys(classifiedcomment,comment);
    }

    public void setClassifiedPrice(String price){

            sendKeys(classifiedPrice,price);
    }
    public void setClassifiedMeter(String meter)
    {
        sendKeys(classifiedMeter,meter);
    }
    public void setClassifiedMeterNet(String meternet){

        sendKeys(classifiedMeterNet,meternet);
    }
    public void roomsCountChecked(){
       select(roomscount,2);
        logger.info("Oda sayısı seçildi.");
    }
    public void setBuildingAgeChecked(){
        select(buildingAge,1);
        logger.info("Bina yaşı seçildi");
    }
    public void bulunduguKatChecked(){
        select(bulunduguKat,2);
        logger.info("Bulunduğu kat seçildi.");
    }
    public void katSayisiChecked(){
        select(katSayisi,1);
        logger.info("Kat sayısı seçildi");
    }
    public void heatingChecked(){
        select(heating,1);
        logger.info("Isıtma türü seçildi");
    }
    public void numbersofBathroomChecked(){
        select(numbersofBathroom,1);
        logger.info("Banya sayısı seçildi");
    }
    public void balconyChecked(){
        select(balcony,2);
        logger.info("Balkon sayısı seçildi.");
    }
    public void usingStatusChecked(){
        select(usingStatus,1);
        logger.info("Kullanım durumu seçildi.");
    }
    public void setDues(){
        sendKeys(dues,"1100");
        logger.info("Aidat Miktarı girildi.");
    }
    public void deedStatusChecked(){
        select(deedStatus,1);
        logger.info("Tapu durumu seçildi");
    }
    public void fromWhoChecked(){
        select(fromWho,1);
        logger.info("Kimden alanı seçildi");
    }
    public void videoCallChecked(){
        select(videoCall,1);
        logger.info("Video Arama ile gezilebilir seçildi");
    }
    public void barteredChecked(){
        select(bartered,1);
        logger.info("Takaslı alanı seçildi.");
    }

    public void selectCity() throws InterruptedException {
        Select select = new Select(city);
        Thread.sleep(2000);
        select.selectByVisibleText("İzmir");
        logger.info("Şehir Seçildi");
    }
    public void selectTown() throws InterruptedException {
        Select select = new Select(town);
        Thread.sleep(3000);
        select.selectByVisibleText("Bergama");
        logger.info("İlçe  seçildi.");
    }
    public void selectQuarter() throws InterruptedException {
        Select select = new Select(quarter);
        Thread.sleep(3000);
        select.selectByVisibleText("Ayaskent");
        logger.info("Mahalle  seçildi.");
    }
    public void selectSiteIcerisinde() throws InterruptedException {
        setWait(siteIcerisinde);
        Select select = new Select(siteIcerisinde);
        Thread.sleep(2000);
        select.selectByValue("0");
        logger.info("Şehir Seçildi");
    }
    public void clickBuyut(){
        click(mapBuyut);
        click(mapBuyut);
        click(mapBuyut);
        click(mapBuyut);
        click(mapBuyut);

    }
    public void mapClick(){
       click(map);
    }
    public void cepheSecim(){
        click(facade);
        logger.info("Cephe seçimi yapılmıştır.");
    }
    public void icOzelliklertabClick(){
        click(icOzelliklertab);
        logger.info("İçözellikler tabına tıklanmıştır.");
    }
    public void icOzelliklerSecimIstemiyorumClick(){
        click(icOzelliklerSecimIstemiyorum);
        logger.info("İçözellikler seçim istemiyorum  tıklanmıştır.");
    }
    public void disOzelliklertabClick(){
        click(disOzelliklertab);
        logger.info("Dış Özellikler tabına tıklanmıştır.");
    }
    public void disOzelliklerSecimYapmakIstemiyorumClick(){
        click(disOzelliklerSecimIstemiyorum);
        logger.info("Dış özellikler seçim istemiyorum seçilmiştir.");
    }
    public void muhitTabClick(){
        click(muhitTab);
        logger.info("Muhit tabına tıklanmıştır.");
    }
    public void muhitTabSecimYapmakIstemiyorumClick(){
        click(muhitTabSecimYapmakIstemiyorum);
        logger.info("Muhit  seçim yapmak istemiyorum seçilmiştir.");
    }
    public void ulasimTabClick(){
        click(ulasimTab);
        logger.info("Ulaşım tabına tıklanmıştır.");

    }
    public void ulasimSecimYapmakIstemiyorumClick(){
        click(ulasimSecimYapmakIstemiyorum);
        logger.info("Ulaşım seçim istemiyorum  tıklanmıştır.");
    }
    public void manzaraTabClick(){
        click(manzaraTab);
        logger.info("Manzara tabına tıklanmıştır.");
    }
    public void manzaSecimYapmakIstemiyoruClick(){
        click(manzaraSecimYapmakIstemiyorum);
        logger.info("Manzara seçim istemiyorum  tıklanmıştır.");
    }
    public void konutTipiTab(){
        click(konutTipiTab);
        logger.info("Konut tabına tıklanmıştır.");

    }
    public void konutTipiSecimYapmakIstemiyorumClick(){
        click(konutTipiSecimYapmakIstemiyorum);
        logger.info("Konut Tipi seçim istemiyorum  tıklanmıştır.");
    }
    public void engelliyeUygunTabClick(){
        click(engelliyeUygunTab);
        logger.info("Engelliye uygun tabına tıklanmıştır.");
    }
    public void engelliyeUygunSecimYapmakIstemiyorumClick(){
        click(engelliyeUygunSecimYapmakIstemiyorum);
        logger.info("Engelliye Uygun seçim istemiyorum  tıklanmıştır.");
    }
    public void ilanVermeKuralClick(){
        click(ilanKuralcheckbox);
        logger.info("İlan verme kuralları  checkboxı seçilmiştir.");
    }
    public void addClassifiedSubmitClick(){
        click(addClassifiedSubmit);
        logger.info("İlan ekleme 1. sayfada devam et butonuna  tıklanmıştır.");
    }


    public void scrollElement(WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }
}

