//package stepdef;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import managers.PageObjectManager;
//import pageObjects.CartPage;
//import pageObjects.HomePage;
//import webdrivermanger.WebDriverManager;
//
//public class Steps {
//
//	WebDriver driver;
//	HomePage hp;
//	CartPage cp;
//	PageObjectManager pom;
//	WebDriverManager webDriverManager;
//	
//
//	@Given("user is on Home Page")
//	public void user_is_on_Home_Page() {
//		webDriverManager =new WebDriverManager();
//		driver=webDriverManager.initializeDriver();
//		pom=new PageObjectManager(driver);
//		hp=pom.getHomePage();
//		cp=pom.getCartPage();
//		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
//	}
//
//	@When("he\\/she searche for {string}")
//	public void he_she_searche_for(String vegetable) {
//		hp.searchCarrot(vegetable);
//	}
//
//	@When("clicks on ADD TO CART")
//	public void clicks_on_ADD_TO_CART() {
//		// Write code here that turns the phrase above into concrete actions
//		hp.addCarrot();
//	}
//
//	@When("click on shopping bag")
//	public void click_on_shopping_bag() {
//		hp.clickShoppingBag();
//	}
//
//	@When("click on PROCEED TO CHECKOUT")
//	public void click_on_PROCEED_TO_CHECKOUT() {
//		hp.clickProceedToCheckout();
//	}
//
//	@When("click on Place Order")
//	public void click_on_Place_Order() throws InterruptedException {
//		cp.clickPlaceOrder();
//	}
//
//	@When("select India from the dropdown")
//	public void select_India_from_the_dropdown() {
//		cp.selectCountry();
//	}
//
//	@When("click on Agree terms and conditions checkbox")
//	public void click_on_Agree_terms_and_conditions_checkbox() {
//		cp.clickCheckbox();
//	}
//
//	@When("click on proceed")
//	public void click_on_proceed() {
//		cp.clickProceed();
//	}
//
//	@Then("order should be placed successfully")
//	public void order_should_be_placed_successfully() {
//		System.out.println("order placed successfully");
//	}
//
//}
