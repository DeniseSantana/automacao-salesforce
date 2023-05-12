package br.com.salesforce.test.pages;

import br.com.salesforce.core.page.BasePage;
import lombok.Getter;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;


@Getter
public class LoginPage extends BasePage {

    public LoginPage() {
        super();
    }
      public static final String salesforce = "https://wise-badger-3ks8kg-dev-ed.trailblaze.my.salesforce.com";

    // Localizadores dos elementos da página
    //CT=105
    private By usernameInput = By.id("username");
    private By passwordInput = By.id("password");

    private By lembrarButton = By.id("rememberUn");
    private By loginButton = By.xpath("//input[@name='Login']");

    private By mensagemGrafico = By.className("icon noicon");// O cenário está quebrando na hora de valida, o elemento está dinamico

    private By erroLogin = By.id("error");

    // Métodos para interagir com os elementos da página

    public void setUsername(String username) {

        getWebDriver().findElement(usernameInput).sendKeys(username);
    }

    public void setPassword(String password) {
        getWebDriver().findElement(passwordInput).sendKeys(password);
    }

    public void clickLoginButton() {
        getWebDriver().manage().window().maximize();
        getWebDriver().findElement(lembrarButton).click();
        getWebDriver().findElement(loginButton).click();
        getWebDriver().quit();

    }

    //    public void validarMensagemGrafico() {
//        assertTrue(getWebDriver().findElement(mensagemGrafico).isDisplayed());
//       // assertEquals(getWebDriver().findElement(mensagemGrafico).getText(),"");
//        getWebDriver().quit();
//    }
    public void validarMensagemErroLogin() throws InterruptedException {
        assertEquals(getWebDriver().findElement(erroLogin).getText(), "Please check your username and password. If you still can't log in, contact your Salesforce administrator.");
        Thread.sleep(2 * 1000);
        getWebDriver().quit();
    }
}



