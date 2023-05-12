package br.com.salesforce.test.Actions;


import br.com.salesforce.test.pages.LoginUsuarioPage;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class LoginUsuarioActions{

    private LoginUsuarioPage loginUsuarioPage;

    public LoginUsuarioActions() {

//        loginUsuarioPage = new LoginUsuarioPage(driver);
    }
    public void inserindoEmailValido() {

        loginUsuarioPage.setUsername("denise.cristiane.silva@gmail.com.test");
    }
    public void inserindoSenhaValida() {
        loginUsuarioPage.setPassword("Denise123");

    }
    public void clickNologin() {

        loginUsuarioPage.clickLoginButton();
    }
}

