package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutInfoPage extends PageBase{

	public CheckoutInfoPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "first-name")
	WebElement firstNameTxtBox;
	
	@FindBy(id = "last-name")
	WebElement lastNameTxtBox;
	
	@FindBy(id = "postal-code")
	WebElement postalCodeTxtBox;
	
	@FindBy(id = "continue")
	WebElement continueBtn;
	
	public void ContinueCheckout(String firstName, String lastName, String postalCode)
	{
		setTextElement(firstNameTxtBox, firstName);
		setTextElement(lastNameTxtBox, lastName);
		setTextElement(postalCodeTxtBox, postalCode);
		clickButton(continueBtn);
	}

}
