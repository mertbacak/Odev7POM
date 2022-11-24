package pageobjectmodel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pageobjectmodel.page.HomePage;
import pageobjectmodel.page.SearchResultPage;

import java.time.chrono.ThaiBuddhistEra;

public class SearchResult extends BaseTest{
    HomePage homePage;
    SearchResultPage searchResultPage;
    @BeforeEach
    public void before(){
        homePage=new HomePage(driver);
        searchResultPage=new SearchResultPage(driver);

    }
    @Test
    public void searcResultCarPriceFilter() throws InterruptedException {
        homePage.clickCerezKabul();
        homePage.searchTextSendKeys("bmw otomobil");
        homePage.searchButtonClick();
        searchResultPage.resultTextVisibility();
        searchResultPage.searchResultItemSize();
        searchResultPage.priceMinTextboxSendKey("100000");
        searchResultPage.priceMaxTextboxSendey("250000");
        searchResultPage.priceSearchButtonClick();
         searchResultPage.priceEtiketVisibility();
        searchResultPage.filterSearchItemPriceAssert();

    }

    @Test
    public void searcResultCarYearFilter() throws InterruptedException {
        homePage.clickCerezKabul();
        homePage.searchTextSendKeys("bmw otomobil");
        homePage.searchButtonClick();
        searchResultPage.resultTextVisibility();
        searchResultPage.searchResultItemSize();
        searchResultPage.yearMinSendKey("1990");
        searchResultPage.yearMaxSendKeys("2012");
        searchResultPage.yearSearchButtonClick();
        searchResultPage.yearEtiketVisibility();
        searchResultPage.searhListItemYearFilterControl();
    }

    @Test
    public void searcResultCarSortByYearOldest() throws InterruptedException {
        homePage.clickCerezKabul();
        homePage.searchTextSendKeys("bmw otomobil");
        homePage.searchButtonClick();
        searchResultPage.resultTextVisibility();
        searchResultPage.searchResultItemSize();
        searchResultPage.sortOrderMenuButtonClick();
        searchResultPage.siralamaYillaraGöreEnEskiClick();
        Thread.sleep(1000);
        searchResultPage.yilaGöreEskisiralamaDegisikligiKontrol();
    }

    @Test
    public void searcResultCarYearPriceSortingFilter() throws InterruptedException {
        homePage.clickCerezKabul();
        homePage.searchTextSendKeys("bmw otomobil");
        homePage.searchButtonClick();
        searchResultPage.resultTextVisibility();
        searchResultPage.searchResultItemSize();
        searchResultPage.priceMinTextboxSendKey("100000");
        searchResultPage.priceMaxTextboxSendey("250000");
        searchResultPage.priceSearchButtonClick();
        Thread.sleep(3000);
        searchResultPage.filterSearchItemPriceAssert();
        searchResultPage.yearMinSendKey("1990");
        searchResultPage.yearMaxSendKeys("2012");
        searchResultPage.yearSearchButtonClick();
        searchResultPage.yearEtiketVisibility();
        searchResultPage.searhListItemYearFilterControl();
        searchResultPage.sortOrderMenuButtonClick();
        searchResultPage.siralamaYillaraGöreEnEskiClick();
        Thread.sleep(2000);
        searchResultPage.yilaGöreEskisiralamaDegisikligiKontrol();
    }

}
