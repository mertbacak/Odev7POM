package pageobjectmodel.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageobjectmodel.PopularCategoryTest;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }


    @FindBy(id ="username")
    private WebElement username;

    @FindBy(id="password")
    private  WebElement password;

    @FindBy(css= "label[for='username'].error")
    private  WebElement errorUsername;
    @FindBy(css ="label[for='password'].error")
    private WebElement errorPassword;

    @FindBy(id = "userLoginSubmitButton")
    private WebElement userLoginSubmitButton;

    @FindBy(id = "usernameArea")
    private WebElement loginUserNameArea;
    @FindBy(css = "#loginForm span.error")
    private WebElement wrongUsernamPassword;
    public void setUsername(String user){
       sendKeys(username,user);
    }

    public void setPassword(String pass){
        sendKeys(password,pass);
    }
   
    public void loginButtonClick()
    {
        click(userLoginSubmitButton);
        logger.info("Giriş yap butonuna tıklandı.");
    }
    public void usernamepasswordnull()
    {
        setWait(errorUsername);
       Assertions.assertEquals(getText(errorUsername),"E-posta adresinizi veya kullanıcı adınızı girin.");
       logger.info("Email alanı boş bırakıldı "+getText(errorUsername)+" hatası alındı.");
       setWait(errorPassword);
        Assertions.assertEquals(getText(errorPassword),"Şifrenizi girin.","Şifre alanı boş bırakıldı "+getText(errorPassword)+" hatası alındı");
        logger.info("Şifre alanı boş bırakıldı "+getText(errorPassword)+" hatası alındı.");
    }
    public void usernamefilledpasswordnull()
    {
        setWait(errorPassword);
        Assertions.assertEquals(getText(errorPassword),"Şifrenizi girin.","Şifre alanı boş bırakıldı "+getText(errorPassword)+" hatası alındı");
        logger.info("Şifre alanı boş bırakıldı "+getText(errorPassword)+" hatası alındı.");
    }
    public void usernamenulldpasswordfilled(){
        setWait(errorUsername);
        Assertions.assertEquals(getText(errorUsername),"E-posta adresinizi veya kullanıcı adınızı girin.");
        logger.info("Email alanı boş bırakıldı "+getText(errorUsername)+" hatası alındı.");
    }
    public void loginSucces(){
        setWait(loginUserNameArea);
        Assertions.assertEquals(driver.getCurrentUrl(),"https://banaozel.sahibinden.com/");
        logger.info("Giriş Başarılıyla yapıldı.");
    }
    public void loginUsernameorPasswordWrong(){
        setWait(wrongUsernamPassword);
        Assertions.assertEquals(getText(wrongUsernamPassword),"E-posta adresiniz, kullanıcı adınız veya şifreniz hatalı.");
        logger.info("Email ya da şifre hatalı girildi ve "+getText(wrongUsernamPassword)+" hatası alındı.");
    }


}
