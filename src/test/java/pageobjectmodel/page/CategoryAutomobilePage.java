package pageobjectmodel.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryAutomobilePage extends BasePage{
    public CategoryAutomobilePage(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(css = ".all-classifieds-link")
    private WebElement allCategoryClassfieldAutomobile;


    public void AllCategoryClassfieldAutomobileClick(){
        click(allCategoryClassfieldAutomobile);
    }
}
