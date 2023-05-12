@web @conta

Feature:Conta

  @CT=00003
  Scenario: Criar conta Salesforce
    Given que estou na tela principal do site salesforce
    When  insiro email valido e senha  válido
    And   clico em contas e depois clico em criar conta
    Then  preencho o formulario e crio minha conta com sucesso


  @CT=00004
  Scenario: Editando conta Salesforce
    Given que estou na tela principal do site salesforce
    When  insiro email valido e senha  válido
    And clico no nome da conta
    Then edito a conta com sucesso

  @CT=00005
  Scenario: Criar Oportunidade
    Given que estou na tela principal do site salesforce
    When  insiro email valido e senha  válido
    And   clico em contas e depois clico no nome da conta
    Then crio uma oportunidade com sucesso

  @CT=00006
  Scenario: Editando conta Salesforce
    Given que estou na tela principal do site salesforce
    When  insiro email valido e senha  válido
    And clico no nome da conta
    Then edito a conta com sucesso