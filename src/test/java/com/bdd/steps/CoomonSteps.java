package com.bdd.steps;

import static com.bdd.impl.AppAccess.*;
import static com.bdd.utils.GlobalSelectors.*;
import static com.bdd.utils.ReusableAndGlobalFunctionalities.*;
import static com.bdd.variables.GlobalVariables.*;
import static com.bdd.pages.CartPage.*;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CoomonSteps {
	
	@Given("User navigates to the application")
	public void user_navigates_to_the_application() {
		accessApp();
		gdriver.manage().window().maximize();
		openUrl();
	}
	
	@When ("User clicks on the {string}")
	public void user_clicks_on_the_Link(String linkName) {
		checkAllLinks(linkName);
	}
	
	@Then ("User is send to {string} page")
	public void user_is_send_to_next_page(String pageName){
		checkAllPages(pageName);
	}
	
	@When("User types {string} name")
	public void user_types_product_name(String product) {
		sendKeys(headerAutocompleteInput, product);
	}
	
	@And("Choose product")
	public void click_on_search_button() {
		headerAutocomplitChoyce();
	}
	
	@Then("Navigate to the home page")
	public void navigate_to_the_home_page() {
		click(headerLogoLink);
	}
	
	@Then("Clicks on the product details button")
	public void clicks_on_the_product_details_button() {
		click(productDetailsBytton);
	}
	
	@And("Add products to cart, one of each kind")
	public void add_products_to_cart_one_of_each_kind() {
		clickAllElements(addToCartButton);
	}
	
	@And("Checks, if backward button works")
	public void checks_if_backward_button_works() {
		click(productDetailsBackwordButton);
	}
	
	@When("User is send to product seller details tab")
	public void user_is_send_to_product_seller_details_tab() {
		Assert.assertEquals("wstecz", getText(productDetailsBackwordButton));
	}
	
	@Then("Checks, if cart logo number is updated correctly")
	public void checks_if_cart_logo_number_is_updated_correctly() {
		Assert.assertEquals("2", getText(headerCartLogoNumber));
	}
	
	@And("Clicks on log out button")
	public void clicks_on_log_out_button() {
	  click(headerLogoutButto);
	}
	
	@And("Accepts alert message")
	public void Accept_alert_message() {
		acceptAlert();
	}
	
	@Then("Checks if there is sign in and sign up dropdown tab")
	public void checks_if_logo_button_changed_on_sign_in_and_sign_up_dropdown_tab() {
		Assert.assertEquals("Logowanie/rejestracja", getText(headerLoginSignupDropdown));
	}
	
	@When("Logged in user put products to cart and navigate to cart page")
	public void logged_in_user_put_products_to_cart_and_navigate_to_cart_page() throws InterruptedException {
		navigateWithFullCartToCartPage();
	}
	 
}
