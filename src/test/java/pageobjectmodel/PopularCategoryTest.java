package pageobjectmodel;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjectmodel.page.*;

import java.util.HashMap;

public class PopularCategoryTest extends BaseTest {


    HashMap<String, String> capitalCities = new HashMap<String, String>();
    public static final Logger logger = LogManager.getLogger(PopularCategoryTest.class);

    HomePage homePage;

    @BeforeEach
    public void before(){
        homePage=new HomePage(driver);

    }

    @ParameterizedTest
    @CsvFileSource(files ="src/main/resources/categoryelements.csv",numLinesToSkip = 1)
    public  void popularCategory(String popularSearchElement,String searchResultElement){
        homePage.clickCerezKabul();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", homePage.xpahtScrollelemet(popularSearchElement));
        logger.info("Popüler aramalar kategorisine scroll edildi.");
        logger.info(popularSearchElement+" elementinin getTexti alındı "+homePage.xpahtElementGetText(popularSearchElement));
        String homePageCategory=homePage.xpahtElementGetText(popularSearchElement);
        homePage.xpathClick(popularSearchElement);
        homePage.xpahtElementGetText(searchResultElement);
        logger.info(popularSearchElement+" elementinin getTexti alındı "+homePage.xpahtElementGetText(searchResultElement));
        String categoryName=homePage.xpahtElementGetText(searchResultElement);
        boolean categoryNameControl = homePageCategory.contains(categoryName);
        Assertions.assertTrue(categoryNameControl,"Tıklanan kategori ile Arama sonuçtaki kategori isimleri eşit.");
    }
}
