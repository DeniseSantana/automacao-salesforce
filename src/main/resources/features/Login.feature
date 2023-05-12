@web @login

Feature:Login

  @CT=00001
  Scenario: Realizar login
    Given que estou na tela principal do site
    When  insiro email e senha  válidos
    Then acesso o sistema com sucesso



  @CT=00002
  Scenario: Login invalido
    Given que estou na tela principal do site
    When  insiro email invalido e senha  inválida
    Then logo dá erro no login


