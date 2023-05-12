package br.com.salesforce.test.pages;


import br.com.salesforce.core.page.BasePage;
import lombok.Getter;
import org.openqa.selenium.By;


@Getter
public class ContaPage extends BasePage {

    //CT=00003

    public static final String salesforce = "https://wise-badger-3ks8kg-dev-ed.trailblaze.my.salesforce.com";
    private By usernameInput = By.id("username");

    private By passwordInput = By.id("password");

    private By lembrarButton = By.id("rememberUn");

    private By loginButton = By.xpath("//input[@name='Login']");

    private By contasButton = By.xpath("//a[@title='Contas']");
    private By criarButton = By.xpath("(//*[@class='forceActionLink'])[1]");

    private By nomeConta = By.xpath("//input[@name='Name']");

    private By numeroTelefone = By.xpath("//input[@name='Phone']");

    private By endereçoEntrega = By.xpath("(//*[@name='street'])[2]");
    private By cidadeEntrega = By.xpath("//input[@name='city']");

    private By cepEntrega = By.xpath("//input[@name='postalCode']");

    private By paisEntrega = By.xpath("//input[@name='country']");

    private By salvarEEditar = By.xpath("//*[@name='SaveEdit']");


    ////CT=00004

    private By nomeContaCriada = By.xpath("(//a[@title='Denise'])[1]");

    private By editButton = By.xpath("//Button[@name='Edit']");

    private By numeroConta = By.xpath("//input[@name='AccountNumber']");

    private By localConta = By.xpath("//input[@name='Site']");

    private By numeroFax = By.xpath("//input[@name='Fax']");

    private By salvarECriar = By.xpath("//input[@name='AccountNumber']");
    private By fecharButton = By.xpath("//button[@class='slds-button slds-button_icon slds-modal__close closeIcon slds-button_icon-bare slds-button_icon-inverse']");


    // Métodos para interagir com os elementos da página

    public void setUsernameUsuario(String username) {

        getWebDriver().findElement(usernameInput).sendKeys(username);
    }

    public void setPasswordUsuario(String password) {
        getWebDriver().findElement(passwordInput).sendKeys(password);
    }

    public void clickLogin() {
        getWebDriver().manage().window().maximize();
        getWebDriver().findElement(lembrarButton).click();
        getWebDriver().findElement(loginButton).click();

    }
    public void clicarButtonContaParaCriarConta() throws InterruptedException {
        //getWebDriver().manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
        //Thread.sleep(10*1000);
        navigateToUrl("https://wise-badger-3ks8kg-dev-ed.trailblaze.lightning.force.com/lightning/o/Account/list?filterName=Recent");
        //    getWebDriver().findElement(contasButton).click();

    }

    public void clickCriarConta() throws InterruptedException {
        Thread.sleep(5 * 1000);
        getWebDriver().findElement(criarButton).click();

    }

    public void preenchendoFormularioConta(String nomeDaConta, String numeroDoTelefone, String enderecoDeEntrega, String cidadeDeEntrega, String cepDeEntrega, String paisdeEntrega) throws InterruptedException {
        Thread.sleep(2 * 1000);
        getWebDriver().findElement(nomeConta).sendKeys(nomeDaConta);
        getWebDriver().findElement(numeroTelefone).sendKeys(numeroDoTelefone);
        getWebDriver().findElement(endereçoEntrega).sendKeys(enderecoDeEntrega);
        getWebDriver().findElement(cidadeEntrega).sendKeys(cidadeDeEntrega);
        getWebDriver().findElement(cepEntrega).sendKeys(cepDeEntrega);
        getWebDriver().findElement(paisEntrega).sendKeys(paisdeEntrega);
        getWebDriver().findElement(salvarEEditar).click();


    }
    //CT=00004
    public void clickNaContaCliente() throws InterruptedException {
        Thread.sleep(5 * 1000);
        getWebDriver().findElement(nomeContaCriada).click();
        Thread.sleep(2 * 1000);
        getWebDriver().findElement(editButton).click();

    }

    public void editarContaCliente(String numeroDaConta, String localDaConta, String numeroDoFax) throws InterruptedException {
        Thread.sleep(2 * 1000);
        getWebDriver().findElement(numeroConta).sendKeys(numeroDaConta);
        getWebDriver().findElement(localConta).sendKeys(localDaConta);
        getWebDriver().findElement(numeroFax).sendKeys(numeroDoFax);
        getWebDriver().findElement(salvarEEditar).click();
        getWebDriver().findElement(fecharButton).click();

        getWebDriver().quit();
    }


}