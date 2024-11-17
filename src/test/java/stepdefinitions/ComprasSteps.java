package stepdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.ComprasPage;
import pageobjects.LoginPage;

public class ComprasSteps {
	
	WebDriver driver;
	
	@Dado("^que o usuario esteja logado no sistema$")
	public void que_o_usuario_esteja_logado_no_sistema() throws Throwable {
		Hooks.abrirUrl("https://www.saucedemo.com/");
		driver = Hooks.getDriver();
		LoginPage lp = new LoginPage(driver);
		lp.logarComSucesso();
	}

	@Quando("^o usuario clica no botao Add To Cart$")
	public void o_usuario_clica_no_botao_Add_To_Cart() throws Throwable {
		ComprasPage cp = new ComprasPage(driver);
		cp.clicarBotaoAdd();
	}

	@Entao("^o sistema devera validar que os itens foram adicionados ao carrinho$")
	public void o_sistema_devera_validar_que_os_itens_foram_adicionados_ao_carrinho() throws Throwable {
		ComprasPage cp = new ComprasPage(driver);
		cp.validarQuantidade();
	}

}
