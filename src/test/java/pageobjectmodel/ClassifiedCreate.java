package pageobjectmodel;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjectmodel.page.*;

public class ClassifiedCreate extends BaseTest{
    public static final Logger logger = LogManager.getLogger(PopularCategoryTest.class);
    LoginPage loginPage;
    HomePage homePage;
    ClassifiedCreatePreviewPage classifiedCreatePreviewPage;
    ClassifiedCreateDopingPage classifiedCreateDopingPage;

    ClassifiedCreateSuccesPage classifiedCreateSuccesPage;

    ClassifiedPage classifiedPage;
    @BeforeEach
    public void before(){
        loginPage=new LoginPage(driver);
        homePage=new HomePage(driver);
        classifiedPage=new ClassifiedPage(driver);
        classifiedCreatePreviewPage=new ClassifiedCreatePreviewPage(driver);
        classifiedCreateDopingPage=new ClassifiedCreateDopingPage(driver);
        classifiedCreateSuccesPage=new ClassifiedCreateSuccesPage(driver);
    }

    @Test
    public void vehicleClassifiedCreate() throws InterruptedException {
        homePage.clickCerezKabul();
        homePage.loginButtonClick();
        loginPage.setUsername("emlaknormalmagaza");
        loginPage.setPassword("password");
        loginPage.loginButtonClick();
        loginPage.loginSucces();
        classifiedPage.newClassifiedClick();
        Thread.sleep(3000);
        //classifiedPage.setRealestateCategoryClick();
        classifiedPage.ResidenceCategoryClick();
        classifiedPage.setEmlakKirilimClick();
        classifiedPage.ikinciEmlakKirilimClick();
        classifiedPage.CategorySelectedOKClick();
        classifiedPage.setclassifiedTitle("3+1 Bağcılar Merkezde Site içerisinde 130m2 ev");
        classifiedPage.setClassifiedcomment("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but");
        classifiedPage.setClassifiedPrice("120000");
        classifiedPage.setClassifiedMeter("130");
        classifiedPage.setClassifiedMeterNet("120");
        classifiedPage.roomsCountChecked();
        classifiedPage.setBuildingAgeChecked();
        classifiedPage.bulunduguKatChecked();
        classifiedPage.katSayisiChecked();
        classifiedPage.heatingChecked();
        classifiedPage.numbersofBathroomChecked();
        classifiedPage.balconyChecked();
        classifiedPage.usingStatusChecked();
        classifiedPage.setDues();
        classifiedPage.deedStatusChecked();
        classifiedPage.fromWhoChecked();
        classifiedPage.videoCallChecked();
        classifiedPage.barteredChecked();
        classifiedPage.selectCity();
        classifiedPage.selectTown();
        classifiedPage.selectQuarter();
        classifiedPage.selectSiteIcerisinde();
        classifiedPage.clickBuyut();
        classifiedPage.mapClick();
        classifiedPage.cepheSecim();
        classifiedPage.icOzelliklertabClick();
        classifiedPage.icOzelliklerSecimIstemiyorumClick();
        classifiedPage.disOzelliklertabClick();
        classifiedPage.disOzelliklerSecimYapmakIstemiyorumClick();
        classifiedPage.muhitTabClick();
        classifiedPage.muhitTabSecimYapmakIstemiyorumClick();
        classifiedPage.ulasimTabClick();
        classifiedPage.ulasimSecimYapmakIstemiyorumClick();
        classifiedPage.manzaraTabClick();
        classifiedPage.manzaSecimYapmakIstemiyoruClick();
        classifiedPage.konutTipiTab();
        classifiedPage.konutTipiSecimYapmakIstemiyorumClick();
        classifiedPage.engelliyeUygunTabClick();
        classifiedPage.engelliyeUygunSecimYapmakIstemiyorumClick();
        classifiedPage.ilanVermeKuralClick();
        classifiedPage.addClassifiedSubmitClick();
        classifiedCreatePreviewPage.previewContainerView();
        classifiedCreatePreviewPage.devamEtButtonClick();
        classifiedCreateDopingPage.dahaFazlaAliciMetniViewAssertion();
        classifiedCreateDopingPage.dopingsSize();
        classifiedCreateDopingPage.dopingDevamButtonClick();
        classifiedCreateSuccesPage.succesIconControl();
        classifiedCreateSuccesPage.successMessageAssert();
    }
}
