package pageobjectmodel.page;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClassifiedCreateSuccesPage extends BasePage{
    public ClassifiedCreateSuccesPage(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(css = ".success-icon.ng-scope")
    private WebElement successIcon;
    @FindBy(css = ".ng-binding.sicily")
    private WebElement successMessage;

    public void succesIconControl(){
        setWait(successIcon);
        logger.info("Iconun düzgün yüklendiği görülmüştür");
    }
    public void successMessageAssert(){
        Assertions.assertEquals(getText(successMessage),"Tebrikler! İlanınız yayına alınmıştır!");
        logger.info(getText(successMessage)+" Mesajının doğru geldiği görülmüştür.");
    }
}
