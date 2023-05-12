package br.com.salesforce.test.Actions;


import br.com.salesforce.test.pages.LoginPage;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class LoginActions {

    private LoginPage loginPage;

    public LoginActions() {
        loginPage = new LoginPage();
    }


    public void acessandoSiteSalesforce() {
        loginPage.navigateToUrl(LoginPage.salesforce);


    }

    public void inserindoEmailValido() {

        loginPage.setUsername("denise.cristiane.silva@gmail.com.test");
    }

    public void inserindoSenhaValida() {
        loginPage.setPassword("Denise123");

    }

    public void clickNologin() {

        loginPage.clickLoginButton();
    }

    //    public void validarLogin() {
//        loginPage.validarMensagemGrafico();
//
//    }
//
    public void inserindoSenhaInvalida() {
        loginPage.setPassword("Denise124");

   }

        public void validarErroLoginCliente() throws InterruptedException {
            loginPage.validarMensagemErroLogin();
        }
    }



