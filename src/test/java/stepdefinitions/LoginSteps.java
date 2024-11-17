package stepdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.LoginPage;

public class LoginSteps {

WebDriver driver;
	
	@Dado("^que o usuario esteja na pagina principal do sistema$")
	public void que_o_usuario_esteja_na_pagina_principal_do_sistema() throws Throwable {
		Hooks.abrirUrl("https://www.saucedemo.com/");
		driver = Hooks.getDriver();
	}

	@Quando("^informar o campo Username como \"([^\"]*)\"$")
	public void informar_o_campo_Username_como(String userName) throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.preencherUserName(userName);
	}

	@Quando("^informar o campo Password como \"([^\"]*)\"$")
	public void informar_o_campo_Password_como(String userPassword) throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.preencherPassword(userPassword);
	}

	@Quando("^clicar no botao Login$")
	public void clicar_no_botao_Login() throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.clicarBotaoLogin();
	}

	@Entao("^o sistema devera autoriazar o login exibindo a pagina contendo os produtos$")
	public void o_sistema_devera_autoriazar_o_login_exibindo_a_pagina_contendo_os_produtos() throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.validarTitle();
	}
	
	@Entao("^o sistema devera exibir uma mensagem de erro \"([^\"]*)\"$")
	public void o_sistema_devera_exibir_uma_mensagem_de_erro(String mensagemEsperada) throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.validarMensagemErro(mensagemEsperada);
	}

	
}
