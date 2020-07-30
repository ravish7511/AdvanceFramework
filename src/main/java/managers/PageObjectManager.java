package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.CartPage;
import pageObjects.HomePage;

public class PageObjectManager {
	private WebDriver driver;
	private CartPage cartPage;
	private HomePage homePage;
	
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	public HomePage getHomePage() {
		return homePage==null ? homePage=new HomePage(driver):homePage;
	}
	
	public CartPage getCartPage()
	{
		return cartPage==null? cartPage=new CartPage(driver):cartPage;
	}
}
