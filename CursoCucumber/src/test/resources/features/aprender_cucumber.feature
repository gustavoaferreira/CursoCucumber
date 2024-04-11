Feature: Aprender Cucumber
	Como um aluno
	Eu quero aprender a utilizar Cucumber
	Para que eu possa automatizar critérios de aceitação
	
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