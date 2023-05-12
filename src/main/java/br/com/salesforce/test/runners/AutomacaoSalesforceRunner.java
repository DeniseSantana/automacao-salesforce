package br.com.salesforce.test.runners;

import cucumber.api.junit.Cucumber;

import io.cucumber.testng.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {},
        features = "src/test/resources/features",
        tags = {"~@ignore"},
        glue = {"Steps"}

)
public class AutomacaoSalesforceRunner  {
    public static WebDriver driver;
    @BeforeClass
    public static void start(){
        driver = new ChromeDriver();
    }
    @AfterClass
    public static void stop(){
        System.out.println("fim");
        driver.quit();
    }

    }


