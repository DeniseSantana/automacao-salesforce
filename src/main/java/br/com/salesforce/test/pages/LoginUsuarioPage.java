package br.com.salesforce.test.pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Getter
public class LoginUsuarioPage {
    WebDriver driver;
    private By usernameInput = By.id("username");

    private By passwordInput = By.id("password");

    private By lembrarButton = By.id("rememberUn");

    private By loginButton = By.xpath("//input[@name='Login']");

    private By mensagemGrafico = By.className("icon noicon");// O cenário está quebrando na hora de valida, o elemento está dinamico

    private By erroLogin = By.id("error");

    public LoginUsuarioPage(WebDriver driver) {
        this.driver = this.driver;
    }

    public void acessarSitePrincipalSalesforce() {

        driver.get("https://wise-badger-3ks8kg-dev-ed.trailblaze.my.salesforce.com");
        driver.manage().window().maximize();
    }

    public void setUsername(String username) {
        driver.findElement(usernameInput).sendKeys(username);
    }


    public void setPassword(String password) {

        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLoginButton() {

        driver.manage().window().maximize();
        driver.findElement(lembrarButton).click();
        driver.findElement(loginButton).click();

    }
}
