package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import cucumber.TextContext;
import enums.Context;

public class HomePageSteps {

	TextContext testContext;
	HomePage homePage;

	public HomePageSteps(TextContext context) {
		testContext = context;
		homePage = testContext.getPageObjectManager().getHomePage();
	}

	@Given("user is on Home Page")
	public void user_is_on_Home_Page() {

		homePage.navigateTo_HomePage();
	}

	@When("he\\/she searche for {string}")
	public void he_she_searche_for(String vegetable) {
		homePage.searchCarrot(vegetable);
	}

	@When("clicks on ADD TO CART")
	public void clicks_on_ADD_TO_CART() {
		homePage.addCarrot();
	}

	@When("click on shopping bag")
	public void click_on_shopping_bag() {
		homePage.clickShoppingBag();
	}

	@When("click on PROCEED TO CHECKOUT")
	public void click_on_PROCEED_TO_CHECKOUT() throws InterruptedException {
		homePage.clickProceedToCheckout();
		String productName = homePage.getProductName();
		System.out.println(productName);
		testContext.getScenarioContext().setContext(Context.PRODUCT_NAME, productName);
		
	}

}
