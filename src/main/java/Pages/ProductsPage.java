package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends PageBase{

	public ProductsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	WebElement addToCart;
	
	@FindBy(className = "shopping_cart_link")
	WebElement shoppingCartIcon;
	
	public void AddToCart()
	{
		clickButton(addToCart);
	}
	
	public void OpenCartLink()
	{
		clickButton(shoppingCartIcon);
	}

}
