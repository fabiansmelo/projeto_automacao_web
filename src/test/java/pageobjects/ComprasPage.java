package pageobjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.MetodosUteis;

public class ComprasPage extends MetodosUteis{

	protected WebDriver driver;
	
	public ComprasPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (how = How.ID, using = "add-to-cart-sauce-labs-backpack")
	private WebElement btnAddToCart;
	
	@FindBy (how = How.XPATH, using = "//span[@class='shopping_cart_badge']")
	private WebElement quantidade;
	
	public void clicarBotaoAdd() {
		esperarElemento(btnAddToCart);
		btnAddToCart.click();
	}
	
	public void validarQuantidade() {
		esperarElemento(quantidade);
		assertEquals("1", quantidade.getText());

		
	}
	
}
