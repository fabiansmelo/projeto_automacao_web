package pageobjects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.MetodosUteis;

public class LoginPage extends MetodosUteis {

	protected WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (how = How.ID, using = "user-name")
	private WebElement elementUser;
	
	@FindBy (how = How.ID, using = "password")
	private WebElement elementPassword;
	
	@FindBy (how = How.ID, using = "login-button")
	private WebElement btnLogin;
	
	@FindBy (how = How.CLASS_NAME, using = "title")
	private WebElement title;
	
	@FindBy (how = How.XPATH, using = "//h3[@data-test='error']")
	private WebElement errorMessage;
	
	public void preencherUserName(String userName) {
		esperarElemento(elementUser);
		elementUser.sendKeys(userName);
	}
	
	public void preencherPassword(String userPassword) {
		esperarElemento(elementPassword);
		elementPassword.sendKeys(userPassword);
	}
	
	public void clicarBotaoLogin() {
		esperarElemento(btnLogin);
		btnLogin.click();
	}
	
	public void validarTitle() {
		esperarElemento(title);
		assertTrue(title.isDisplayed());
	}
	
	public void validarMensagemErro(String mensagemEsperada) {
		esperarElemento(errorMessage);
		assertEquals(mensagemEsperada, errorMessage.getText());
	}
	
	public void logarComSucesso() {
		preencherUserName("standard_user");
		preencherPassword("secret_sauce");
		clicarBotaoLogin();
	}
	
	
}
