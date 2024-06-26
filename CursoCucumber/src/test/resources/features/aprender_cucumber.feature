Feature: Aprender Cucumber
	Como um aluno
	Eu quero aprender a utilizar Cucumber
	Para que eu possa automatizar crit�rios de aceita��o
	
Scenario: Deve executar especificacao
	Given que criei o arquivo corretamente
	When executa-lo
	Then a especificacao deve finalizar com sucesso
	
Scenario: Deve incrementar contador
	Given que o valor do contador e 15
	When eu incrementar em 3
	Then o valor do contador sera 18
	
Scenario: Deve incrementar contador
	Given que o valor do contador e 123
	When eu incrementar em 35
	Then o valor do contador sera 158
	
Scenario: Deve calcular atraso na entrega
	Given que a entrega e dia 05/04/2018
	When a entrega atrasa em 2 dias
	Then a entrega sera efetuada em 07/04/2018
	
Scenario: Deve criar steps genericos para estes passos
    Given que o ticket e AF345
    Given que o valor da passagem e R$ 230,45
    Given que o nome do passageiro e "Fulano da Silva"
    Given que o telefone do passageiro e 9999-9999
    When criar os steps
    Then o teste vai funcionar

Scenario: Deve reaproveitar os steps "Given" do cenario anterior
    Given que o ticket e AB167
    Given que o ticket especial e AB167
    Given que o valor da passagem e R$ 1120,23
    Given que o nome do passageiro e "Cicrano de Oliveira"
    Given que o telefone do passageiro e 9888-8888

#Scenario: Deve negar todos os steps "Given" dos cenarios anteriores
    #Given que o ticket e CD123
    #Given que o ticket e AG1234
    #Given que o valor da passagem e R$ 1.1345,56
    #Given que o nome do passageiro e "Beltrano Souza Matos de Alc�ntara Azevedo"
    #Given que o telefone do passageiro e 1234-5678
    #Given que o telefone do passageiro e 999-2223 
    