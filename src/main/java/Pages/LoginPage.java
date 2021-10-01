package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="user-name")
	WebElement usernameTxtBox;
	
	@FindBy(id="password")
	WebElement passwordTxtBox;
	
	@FindBy (id="login-button")
	WebElement loginBtn;
	
	public void userLogin(String username, String password)
	{
		setTextElement(usernameTxtBox, username);
		setTextElement(passwordTxtBox, password);
		loginBtn.click();
	}

}
