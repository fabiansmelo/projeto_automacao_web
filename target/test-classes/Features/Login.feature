#language: pt
@End2End
Funcionalidade: Venda de produtos online

	Contexto: 
	Dado que o usuario esteja na pagina principal do sistema
	
	Esquema do Cenario: Realizar login com sucesso
	Quando informar o campo Username como "<usuario>"
	E informar o campo Password como "<senha>"
  E clicar no botao Login
  Entao o sistema devera autoriazar o login exibindo a pagina contendo os produtos
  
  Exemplos: 
  | usuario | senha |
  | standard_user | secret_sauce |
  | problem_user | secret_sauce |
  | performance_glitch_user | secret_sauce |
  
  @SmokeTest
  Esquema do Cenario: Realizar login invalido
	Quando informar o campo Username como "<usuario>"
	E informar o campo Password como "<senha>"
  E clicar no botao Login
  Entao o sistema devera exibir uma mensagem de erro "<error>"
  
  Exemplos: 
  | usuario | senha | error |
  | locked_out_user | secret_sauce | Epic sadface: Sorry, this user has been locked out. |
  | blabla | blabla | Epic sadface: Username and password do not match any user in this service |
  |  |  | Epic sadface: Username is required |

