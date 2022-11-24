package pageobjectmodel;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjectmodel.page.HomePage;
import pageobjectmodel.page.LoginPage;

public class LoginClass extends BaseTest{

    public static final Logger logger = LogManager.getLogger(PopularCategoryTest.class);
    LoginPage loginPage;
    HomePage homePage;
    @BeforeEach
    public void before(){
        loginPage=new LoginPage(driver);
        homePage=new HomePage(driver);
    }

    @Test
    public void loginDetailUsernameAndPasswordempty(){

        homePage.loginButtonClick();
        loginPage.setUsername(" ");
        logger.info("username alanına tıklandı boş bırakıldı.");
        loginPage.setPassword(" ");
        logger.info("password alanına tıklandı boş bırakıldı.");
        loginPage.loginButtonClick();
        loginPage.usernamepasswordnull();
    }

    @Test
    public void loginDetailUsernameFilledAndPasswordEmpty(){

        homePage.loginButtonClick();
        loginPage.setUsername("vasitasupermagaza");
        logger.info("username alanına vasitasupermagaza girildi");
        loginPage.setPassword(" ");
        logger.info("password alanına tıklandı boş bırakıldı.");
        loginPage.loginButtonClick();
        loginPage.usernamefilledpasswordnull();
    }
    @Test
    public void loginDetailUsernameEmptyAndPasswordFilled(){

        homePage.loginButtonClick();
        logger.info("Login butonuna tıklandı.");
        loginPage.setUsername("");
        logger.info("username alanına tıklandı boş bırakıldı.");
        loginPage.setPassword("password");
        logger.info("password alanına tıklandı password bırakıldı.");
        loginPage.loginButtonClick();
        loginPage.usernamenulldpasswordfilled();
    }

    @Test
    public void loginusernameorpasswordwrong(){

        homePage.loginButtonClick();
        loginPage.setUsername("vasitasupermagaza@gmail.com");
        logger.info("username alanına tıklandı vasitasupermagaza@gmail.com girildi");
        loginPage.setPassword("password123");
        logger.info("password alanına tıklandı ve şifre girildi");
        loginPage.loginButtonClick();
        loginPage.loginUsernameorPasswordWrong();
    }

    @Test
    public void loginSuccess(){

        homePage.loginButtonClick();
        logger.info("Login butonuna tıklandı.");
        loginPage.setUsername("vasitasupermagaza@gmail.com");
        logger.info("username alanına tıklandı mail girildi");
        loginPage.setPassword("password");
        logger.info("password alanına tıklandı ve şifre girildi");
        loginPage.loginButtonClick();
        loginPage.loginSucces();

    }
}
