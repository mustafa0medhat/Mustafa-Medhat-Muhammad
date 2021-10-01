package tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Pages.CheckoutInfoPage;
import Pages.CheckoutOverviewPage;
import Pages.LoginPage;
import Pages.ProductsPage;
import Pages.YourCartPage;

public class FullCycleTest extends TestBase {
	
	LoginPage login_Obj;
	ProductsPage product_obj;
	YourCartPage cart_Obj;
	CheckoutInfoPage checkout_Obj;
	CheckoutOverviewPage lastConfirm_Obj;
	String username = "standard_user";
	String password = "secret_sauce";
	String firstName = "Adel";
	String lastName = "Emam";
	String postalCode = "123456";
	
	@Test (priority = 1)
	public void UserCanLoginSuccessfully()
	{
		login_Obj = new LoginPage(driver);
		login_Obj.userLogin(username, password);
	}
	
	@Test (priority = 2)
	public void UserCanAddProductToCartSuccessfully()
	{
		product_obj = new ProductsPage(driver);
		product_obj.AddToCart();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	@Test(priority = 3)
	public void UserCanClickOnCartIcon()
	{
		product_obj.OpenCartLink();
	}
	
	@Test(priority = 4)
	public void ConfirmCheckout()
	{
		cart_Obj = new YourCartPage(driver);
		cart_Obj.ConfirmCheckout();
	}
	
	@Test(priority = 5)
	public void ContinueCheckout()
	{
		checkout_Obj = new CheckoutInfoPage(driver);
		checkout_Obj.ContinueCheckout(firstName, lastName, postalCode);
		
	}
	
	@Test (priority = 6)
	public void checkoutOverview()
	{
		lastConfirm_Obj = new CheckoutOverviewPage(driver);
		lastConfirm_Obj.ConfirmPaying();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

}
