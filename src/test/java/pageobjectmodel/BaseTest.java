package pageobjectmodel;

import com.google.common.io.Files;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.SessionStorage;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BaseTest implements TestWatcher {
    public static final Logger logger = LogManager.getLogger(BaseTest.class);
    WebDriver driver;
    @BeforeAll
    public  static  void beforeAll(){
        WebDriverManager.chromedriver().setup();
    }
    @BeforeEach
    public void beforeTest(){
        driver=new ChromeDriver();
        WebDriverWait wait=new WebDriverWait(driver,30);
        driver.manage().window().maximize();
        driver.get("https://sahibinden.com/");
        List<Cookie> cookieList = new ArrayList<>();
        cookieList.add(new Cookie("testBox","64",".sahibinden.com","/",null));
        cookieList.add(new Cookie("tbSite","x",".sahibinden.com","/",null));
        cookieList.forEach(cookie -> driver.manage().addCookie(cookie));
        driver.navigate().refresh();
        logger.info("TB64 ortamına yönlendirildi!");

        LocalStorage localStorage = ((WebStorage) driver).getLocalStorage();
        localStorage.setItem("feature_discovery_data", "{\"add-to-favorites\":{\"count\":1,\"displayedAt\":1666694107010},\"extended\":true}");
        SessionStorage sessionStorage = ((WebStorage) driver).getSessionStorage();
        sessionStorage.setItem("feature_discovery_displayed", "true");
    }
    @AfterEach
    public void afterTest(){
        driver.quit();
    }

    public void testDisabled(ExtensionContext context, Optional<String> reason) {
    }

    public void testSuccessful(ExtensionContext context) {
        logger.info("Test Başarıyla Çalıştı.");
    }

    public void testAborted(ExtensionContext context, Throwable cause) {
    }

    public void testFailed(ExtensionContext context, Throwable cause) {
        AutoMobileSearch.logger.info("Test Hata Aldı.");
        TakesScreenshot screenshot=(TakesScreenshot)driver;
        File imageFile= screenshot.getScreenshotAs(OutputType.FILE);
        try {
            Files.move(imageFile,new File("src/main/image/hata.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
