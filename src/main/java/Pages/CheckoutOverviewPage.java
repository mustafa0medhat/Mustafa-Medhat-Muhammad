package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutOverviewPage extends PageBase {

	public CheckoutOverviewPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(id = "finish")
	WebElement finishBtn;
	
	public void ConfirmPaying()
	{
		clickButton(finishBtn);
	}
}
