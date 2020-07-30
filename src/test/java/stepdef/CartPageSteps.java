package stepdef;

import org.junit.Assert;

import cucumber.TextContext;
import enums.Context;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjects.CartPage;
import pageObjects.HomePage;

public class CartPageSteps {

	TextContext testContext;//null
	CartPage cartPage;
	HomePage homePage;

	public CartPageSteps(TextContext context) {
		testContext = context;
		cartPage = testContext.getPageObjectManager().getCartPage();
		homePage = testContext.getPageObjectManager().getHomePage();
	}

	@When("click on Place Order")
	public void click_on_Place_Order() throws InterruptedException {
		String productName = (String) testContext.getScenarioContext().getContext(Context.PRODUCT_NAME);
		System.out.println(productName);
		Assert.assertEquals(homePage.getProductName(), productName);
		cartPage.clickPlaceOrder();
	}

	@When("select India from the dropdown")
	public void select_India_from_the_dropdown() {
		cartPage.selectCountry();
	}

	@When("click on Agree terms and conditions checkbox")
	public void click_on_Agree_terms_and_conditions_checkbox() {
		cartPage.clickCheckbox();
	}

	@When("click on proceed")
	public void click_on_proceed() {
		cartPage.clickProceed();
	}

	@Then("order should be placed successfully")
	public void order_should_be_placed_successfully() {
		System.out.println("order placed successfully");
	}
}
