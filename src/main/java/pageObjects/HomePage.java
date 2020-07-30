package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='Search for Vegetables and Fruits']")
	private WebElement searchBox;

	@FindBy(xpath="(//button[.='ADD TO CART'])[9]")
	private WebElement carratToCart;
	
	@FindBy(xpath="//a[@class='cart-icon']//img[contains(@class,'')]")
	private WebElement shoppingBag;
	
	@FindBy(xpath="//button[contains(text(),'PROCEED TO CHECKOUT')]")
	private WebElement proceedToCheckout;
	
	@FindBy(xpath="//p[@class='product-name']")
	private WebElement productName;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void navigateTo_HomePage()
	{
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}
	
	public void searchCarrot(String vegetable)
	{
		searchBox.sendKeys(vegetable);
	}
	
	public void addCarrot()
	{
		carratToCart.click();
	}
	
	public void clickShoppingBag()
	{
		shoppingBag.click();
	}
	
	public void clickProceedToCheckout()
	{
		proceedToCheckout.click();
	}
	
	public String getProductName() throws InterruptedException
	{
		Thread.sleep(3000);
		return productName.getText();
	}
}
