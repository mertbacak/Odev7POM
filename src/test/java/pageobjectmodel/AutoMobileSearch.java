package pageobjectmodel;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pageobjectmodel.page.*;


import java.util.HashMap;


public class AutoMobileSearch extends BaseTest{

    public static final Logger logger = LogManager.getLogger(AutoMobileSearch.class);
    HashMap<String, String> capitalCities = new HashMap<String, String>();


    HomePage homePage;
    CategoryAutomobilePage categoryAutomobilePage;

    PopularSearchResultPage popularSearchResultPage;

    ClassifiedDetail classifiedDetail;

    LoginPage loginPage;


        @BeforeEach
    public void before(){
        homePage=new HomePage(driver);
        categoryAutomobilePage=new CategoryAutomobilePage(driver);
        popularSearchResultPage =new PopularSearchResultPage(driver);
        classifiedDetail=new ClassifiedDetail(driver);
        loginPage=new LoginPage(driver);
    }

    @Test
    public void automobileSearchListClassifiedDetailAssert(){
        homePage.clickCerezKabul();
        homePage.clickOtomobil();
        categoryAutomobilePage.AllCategoryClassfieldAutomobileClick();
        popularSearchResultPage.getClassifiedSize();
        capitalCities.put("getClassifiedTitle", popularSearchResultPage.getClassifiedTitle());
        capitalCities.put("getClassifiedKilometer", popularSearchResultPage.getClassifiedKilometer());
        capitalCities.put("getClassifiedPrice", popularSearchResultPage.getClassifiedPrice());
        popularSearchResultPage.searchFirstElementClick();
        Assertions.assertEquals(capitalCities.get("getClassifiedTitle"),classifiedDetail.getclassifiedDetailTitle());
        Assertions.assertEquals(capitalCities.get("getClassifiedKilometer"),classifiedDetail.getclassifiedDetailKilometer());
        Assertions.assertEquals(capitalCities.get("getClassifiedPrice"),classifiedDetail.getclassifiedDetailPrice());
    }


}
