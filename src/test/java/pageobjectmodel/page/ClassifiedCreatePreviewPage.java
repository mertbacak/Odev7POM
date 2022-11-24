package pageobjectmodel.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClassifiedCreatePreviewPage extends BasePage{
    public ClassifiedCreatePreviewPage(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(css = ".page-container-overlay:last-of-type")
    private WebElement previewContainer;
    @FindBy(css = ".classified-preview-buttons>[type='submit'].btn")
    private WebElement devamEtbutton;

    public void previewContainerView(){
        setWait(previewContainer);
    }
    public void devamEtButtonClick(){
        click(devamEtbutton);
    }



}
