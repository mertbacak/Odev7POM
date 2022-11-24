package pageobjectmodel.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjectmodel.PopularCategoryTest;

import java.util.HashMap;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    public static final Logger logger = LogManager.getLogger(PopularCategoryTest.class);
    public BasePage(WebDriver webDriver){
        this.driver=webDriver;
        wait=new WebDriverWait(webDriver,30);
        PageFactory.initElements(webDriver,this);
    }
    public void sendKeys(WebElement e,String value){
        wait.until(ExpectedConditions.visibilityOf(e)).sendKeys(value);
    }
    public void click(WebElement e){
        wait.until(ExpectedConditions.visibilityOf(e)).click();
    }
    public void select(WebElement e,int b){
        Select selectObj=new Select(e);
        selectObj.selectByIndex(b);
    }
    public String getText(WebElement e){
        wait.until(ExpectedConditions.visibilityOf(e)).getText();
        return e.getText();
    }
    public void  setWait(WebElement e){
        wait.until(ExpectedConditions.visibilityOf(e));
    }
    public void jsClick(WebElement e){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", e);
    }
    public void urlkarsilastirma(String e){
        Assertions.assertEquals(driver.getCurrentUrl(),e);
    }

}

