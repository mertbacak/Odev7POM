package pageobjectmodel.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageobjectmodel.PopularCategoryTest;

public class HomePage extends BasePage {

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(css="[title='Otomobil']")
    private WebElement otomobil;
    @FindBy(id = "onetrust-accept-btn-handler")
    private WebElement cerezkabul;

    @FindBy(css = ".login-text")
    private WebElement loginButton;
    @FindBy(id = "searchText")
    private WebElement searchText;
    @FindBy(css = "#searchSuggestionForm>button")
    private WebElement searchButton;

    public void clickOtomobil(){

        click(otomobil);
    }





    public void clickCerezKabul(){
        click(cerezkabul);
    }

    public WebElement xpahtScrollelemet(String a){
        WebElement elements=driver.findElement(By.xpath(a));
        return elements;
    }
    public String xpahtElementGetText(String a){
       String b=driver.findElement(By.xpath(a)).getText();
        return b;
    }
    public void xpathClick(String a){
       wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(a)))).click();
        logger.info(a+" Elementine click yapıldı.");
    }

    public void loginButtonClick(){
        click(loginButton);
        logger.info("Login butonuna tıklandı.");
    }
    public void searchTextSendKeys(String e){
        sendKeys(searchText,e);
        logger.info(e+" Kelimesi search alanına yazıldı.");
    }
    public void searchButtonClick(){
        click(searchButton);
        logger.info("Search butonuna tıklandı.");
    }



}
