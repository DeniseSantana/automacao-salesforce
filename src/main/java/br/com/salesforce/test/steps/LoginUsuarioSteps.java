package br.com.salesforce.test.steps;


import br.com.salesforce.test.Actions.LoginUsuarioActions;
import br.com.salesforce.test.pages.LoginUsuarioPage;
import br.com.salesforce.test.runners.AutomacaoSalesforceRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginUsuarioSteps extends AutomacaoSalesforceRunner {
     LoginUsuarioPage loginUsuarioPage = new LoginUsuarioPage(driver);
    private LoginUsuarioActions loginUsuarioActions;

    public LoginUsuarioSteps() {

        loginUsuarioActions = new LoginUsuarioActions();

    }
    @Given("que estou na tela do site")
    public void que_estou_na_tela_do_site() {
       loginUsuarioPage.acessarSitePrincipalSalesforce();

    }

    @When("insiro email e senha")
    public void insiro_email_e_senha() {
        loginUsuarioActions.inserindoEmailValido();
        loginUsuarioActions.inserindoSenhaValida();
    }

    @Then("acesso o sistema salesforce com sucesso")
    public void acesso_o_sistema_salesforce_com_sucesso() {
        loginUsuarioActions.clickNologin();
        //   loginActions.validarLogin();
    }
}
