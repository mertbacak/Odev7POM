package pageobjectmodel.page;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ClassifiedCreateDopingPage extends BasePage {
    public ClassifiedCreateDopingPage(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(css = ".promotion-select-header>h1")
    private WebElement dahaFazlaAliciMetni;
    @FindBy(css = "[class='quantity-wrapper']>li")
    private List<WebElement> dopings;
    @FindBy(css = "[ng-click='submit()']")
    private WebElement dopingDevamButton;

    public void dahaFazlaAliciMetniViewAssertion(){
        Assertions.assertEquals(getText(dahaFazlaAliciMetni),"Daha fazla alıcıya ulaşmak ister misiniz?");
        logger.info(getText(dahaFazlaAliciMetni)+"Sayfaya doğru bir şekilde gelmiştir.");
    }
    public void dopingsSize(){
        if (dopings.size()>0)
        {logger.info("Dopingler yüklenmiştir");
        }
        else {
            logger.error("Dopingler Yüklenmemiştir.");
        }
    }
    public void dopingDevamButtonClick(){
        click(dopingDevamButton);
        logger.info("Doping sayfasında Devam et butonuna tıklanmıştır.");
    }
}
