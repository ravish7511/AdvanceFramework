package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CartPage {

	@FindBy(xpath="//button[contains(.,'Place Order')]")
	private WebElement placeOrder;
	
	@FindBy(xpath="//div[@class='wrapperTwo']//div//select")
	private WebElement selectCountry;
	
	@FindBy(xpath="//input[@class='chkAgree']")
	private WebElement checkbox;
	
	@FindBy(xpath="//button[contains(text(),'Proceed')]")
	private WebElement proceed;
	
	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickPlaceOrder() throws InterruptedException
	{
		Thread.sleep(2000);
		placeOrder.click();
	}
	
	public void selectCountry()
	{
		Select s=new Select(selectCountry);
		s.selectByVisibleText("India");
	}
	
	public void clickCheckbox()
	{
		checkbox.click();
	}
	
	public void clickProceed()
	{
		proceed.click();
	}
}
