package br.com.salesforce.core.page;

import br.com.salesforce.core.exception.PageException;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.net.URL;
import java.sql.Driver;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public abstract class BasePage {

    private   WebDriver driver = null;

    public static final String salesforce = "https://wise-badger-3ks8kg-dev-ed.trailblaze.my.salesforce.com";

    public static final String AUTOMATE_USERNAME = "YOUR_USERNAME";
    public static final String AUTOMATE_KEY = "YOUR_ACCESS_KEY";
    public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    public BasePage() {
        DesiredCapabilities caps = new DesiredCapabilities();


        // INIT CHROME OPTIONS
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        Map<String, Object> profile = new HashMap<String, Object>();
        Map<String, Object> contentSettings = new HashMap<String, Object>();
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "75.0");
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");

        // SET CHROME OPTIONS
        // 0 - Default, 1 - Allow, 2 - Block
        contentSettings.put("notifications", 1);
        profile.put("managed_default_content_settings", contentSettings);
        prefs.put("profile", profile);
        options.setExperimentalOption("prefs", prefs);

        // SET CAPABILITY
        caps.setCapability(ChromeOptions.CAPABILITY, options);

        options.merge(caps);

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Selenium\\chromedriver\\driver\\chromedriver_win32\\chromedriver.exe");

        try {
            if( driver ==null  )
                driver = new ChromeDriver(options);

            driver.get(salesforce);

            if (driver instanceof AppiumDriver) {
                PageFactory.initElements(new AppiumFieldDecorator(driver), this);
            } else {
                PageFactory.initElements(driver, this);
            }
        } catch (Exception e) {
            throw new PageException(e);
        }
    }

    public WebDriver getWebDriver() {
        return driver;
   }

    public void navigateToUrl(String url) {
        driver.get(url);
    }


    @AfterAll
    private void fechar() {
        driver.quit();


        }

    }

