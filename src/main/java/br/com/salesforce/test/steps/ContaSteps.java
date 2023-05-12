package br.com.salesforce.test.steps;

import br.com.salesforce.test.Actions.ContaActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ContaSteps {

    private ContaActions contaActions;

    public ContaSteps() {

        contaActions = new ContaActions();


    }
    @Given("que estou na tela principal do site salesforce")
    public void que_estou_na_tela_principal_do_site_salesforce() {
       contaActions.acessandoSitePrincipalSalesforce();

    }

    @When("insiro email valido e senha  válido")
    public void insiro_email_valido_e_senha_valido() {
     contaActions.inserindoEmail();
     contaActions.inserindoSenha();
    }
    @And("clico em contas e depois clico em criar conta")
    public void clico_em_contas_e_depois_clico_em_criar_conta() throws InterruptedException {
        contaActions.cliclarNoButtonContas();
    }

    @Then("preencho o formulario e crio minha conta com sucesso")
    public void preencho_o_formulario_e_crio_minha_conta_com_sucesso() throws InterruptedException {

        contaActions.preenchendoFormularioContaClienteSalesforce();
    }

    @And("clico no nome da conta")
    public void clico_no_nome_da_conta() throws InterruptedException {
        contaActions.clicarNomeContaCliente();
    }

    @Then("edito a conta com sucesso")
    public void edito_a_conta_com_sucesso() throws InterruptedException {
        contaActions.EditandoContaCliente();
    }
}