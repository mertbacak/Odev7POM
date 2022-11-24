package pageobjectmodel.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjectmodel.BaseTest;

public class ClassifiedDetail extends BasePage {
    public ClassifiedDetail(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(css = ".classifiedDetailTitle>h1")
    private WebElement classifiedDetailTitle;
    @FindBy(css = ".classifiedInfo>h3")
    private WebElement classifiedDetailPrice;
    @FindBy (xpath = "(//*[@class='classifiedInfoList']//li/span)[9]")
    private WebElement classifiedDetailKilometer;

    public String getclassifiedDetailTitle(){
        return classifiedDetailTitle.getText();
    }

    public String getclassifiedDetailPrice(){
        String classifiedDetailPriceInfo=classifiedDetailPrice.getText();
        String[] classifiedDetailPriceInfosplit = classifiedDetailPriceInfo.split("\n");
        String classifiedDetailPriceInfos = classifiedDetailPriceInfosplit[0];
        return classifiedDetailPriceInfos;
    }

    public String getclassifiedDetailKilometer(){
        return classifiedDetailKilometer.getText();
    }



}
