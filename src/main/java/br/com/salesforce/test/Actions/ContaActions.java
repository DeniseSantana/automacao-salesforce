package br.com.salesforce.test.Actions;

import br.com.salesforce.test.pages.ContaPage;
import br.com.salesforce.test.pages.LoginPage;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ContaActions  {
    private ContaPage contaPage;

    public ContaActions() {

        contaPage = new ContaPage();

    }
    public void acessandoSitePrincipalSalesforce() {
        contaPage.navigateToUrl(LoginPage.salesforce);


    }

    public void inserindoEmail() {

        contaPage.setUsernameUsuario("denise.cristiane.silva@gmail.com.test");
    }

    public void inserindoSenha() {
       contaPage.setPasswordUsuario("Denise123");
        contaPage.clickLogin();

    }
    public void cliclarNoButtonContas() throws InterruptedException {

       contaPage.clicarButtonContaParaCriarConta();
       contaPage.clickCriarConta();
    }

    public void preenchendoFormularioContaClienteSalesforce() throws InterruptedException {
        Thread.sleep(2 * 1000);
        contaPage.preenchendoFormularioConta("Denise", "948289696",
                "Rua Mouquim,30", "São Paulo", "05894390", "Brasil");


    }
    public void clicarNomeContaCliente() throws InterruptedException {
        contaPage.clicarButtonContaParaCriarConta();
        contaPage.clickNaContaCliente();
    }

    public void EditandoContaCliente() throws InterruptedException {
        contaPage.editarContaCliente("1500", "Sao Paulo", "(11) 1234-5678");
    }

    }

