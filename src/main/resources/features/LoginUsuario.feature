@web @loginUsuario

Feature:Login Usuario

  @CT=000060
  Scenario: Realizar login usuario
    Given que estou na tela do site
    When   insiro email e senha
    Then acesso o sistema salesforce com sucesso


  @CT=000061
  Scenario: realizar login invalido
    Given que estou na tela  do site
    When  insiro email  e senha  inválida
    Then logo recebo uma mensagem de erro no login