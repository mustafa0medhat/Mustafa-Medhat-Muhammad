package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourCartPage extends PageBase{

	public YourCartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "checkout")
	WebElement checkoutBtn;
	
	public void ConfirmCheckout()
	{
		clickButton(checkoutBtn);
	}

}
