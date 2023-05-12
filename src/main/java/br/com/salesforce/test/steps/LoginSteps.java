package br.com.salesforce.test.steps;

import br.com.salesforce.test.Actions.LoginActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    private LoginActions loginActions;

    public LoginSteps() {

        loginActions = new LoginActions();
    }

    @Given("que estou na tela principal do site")
    public void que_estou_na_tela_principal_do_site() {
        loginActions.acessandoSiteSalesforce();

    }

    @When("insiro email e senha  válidos")
    public void insiro_email_e_senha_validos() {
        loginActions.inserindoEmailValido();
        loginActions.inserindoSenhaValida();
    }

    @Then("acesso o sistema com sucesso")
    public void acesso_o_sistema_com_sucesso() {
        loginActions.clickNologin();
        //   loginActions.validarLogin();
    }

    @When("insiro email invalido e senha  inválida")
    public void insiro_email_invalido_e_senha_invalida() {
        loginActions.inserindoEmailValido();
        loginActions.inserindoSenhaInvalida();
        loginActions.clickNologin();
    }
    @Then("logo dá erro no login")
    public void logo_dá_erro_no_login() throws InterruptedException {
    loginActions.validarErroLoginCliente();
    }
}