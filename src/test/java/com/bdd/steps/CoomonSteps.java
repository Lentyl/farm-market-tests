package com.bdd.steps;

import static com.bdd.impl.AppAccess.*;
import static com.bdd.utils.ReusableAndGlobalFunctionalities.*;
import static com.bdd.variables.GlobalVariables.*;
import static com.bdd.pages.BusinessSignupPage.addProduct;
import static com.bdd.pages.CartPage.*;

import com.bdd.pages.HomePage;
import com.bdd.pages.CartPage;


import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CoomonSteps {
	
	@Given("I navigate to the application")
	public void navigate_to_the_application() {
		accessApp();
		gdriver.manage().window().maximize();
		openUrl();
	}
	
	@And("I navigate to the home page by url")
	public void navigate_to_the_home_page_by_url() {
		goToUrl("https://farm-market-app-74e39.web.app/");
	}
	
	@Then("Product description appears on the page")
	public void product_description_appears_on_the_page() {
		Assert.assertEquals("nazwa: jabłko", getText(HomePage.productListItem));   
	}
	
	@When ("I click the {string} link")
	public void click_the_Link(String linkName) {
		clickAllLinks(linkName);
	}
	
	@Then ("I am sent to the {string} page")
	public void sent_to_next_page(String pageName){
		Assert.assertEquals(getAllPagesUrl(pageName), gdriver.getCurrentUrl());
		
	}
	
	@When("I type {string} name")
	public void type_product_name(String product) {
		sendKeys(headerAutocompleteInput, product);
	}
	
	@And("I choose product")
	public void choose_product() {
		headerAutocomplitChoyce();
	}
	
	@And("I navigate to the home page")
	public void navigate_to_the_home_page() {
		click(headerLogoLink);
	}
	
	@And("I click the product details button")
	public void click_the_product_details_button() {
		click(productDetailsBytton);
	}
	
	@And("I add products to the cart, one of each kind")
	public void add_products_to_cart_one_of_each_kind() {
		clickAllElements(addToCartButton);
	}
	
	@And("I check if backward button works")
	public void checks_if_backward_button_works() {
		click(productDetailsBackwordButton);
	}
	
	@Then("I am sent to the product seller details tab")
	public void user_is_send_to_product_seller_details_tab() {
		Assert.assertEquals("wstecz", getText(productDetailsBackwordButton));
	}
	
	@Then("I check, if cart logo number is updated correctly")
	public void checks_if_cart_logo_number_is_updated_correctly() {
		Assert.assertEquals("2", getText(headerCartLogoNumber));
	}
	
	@And("Navigate to the cart page")
	public void navigate_to_cart_page() {
		click(headerCartLink);
	}
	
	@And("I click the log out button")
	public void click_log_out_button() {
	  click(headerLogoutButto);
	}
	
	@And("Accept alert message")
	public void Accept_alert_message() {
		acceptAlert();
	}
	
	@Then("I check if I am logged out and there is log in dropdown menu")
	public void checks_if_logged_out_and_there_is_log_in_dropdown_menu() {
		Assert.assertEquals("Logowanie/rejestracja", getText(headerLoginSignupDropdown));
	}
	
	@When("I Log in, put products to cart and navigate to cart page")
	public void log_in_put_products_to_cart_and_navigate_to_cart_page() {
		navigateWithFullCartToCartPage();
	}
	
	@And("I click the red cancel button to delete {string} product")
	public void click_red_cancel_button_to_delete_product(String name) {
		click(getElementByXpathText(productCancelButton, name));
	}
	
	@Then("{string} is added to seller offer, it appears on the page")
	public void product_is_added_to_seller_offer_it_appears_on_the_page(String productName) {
		Assert.assertEquals(productName, getText(getElementByXpathText(addedProduct, productName))); 
	}
	
	@And("I add product {string}")
	public void add_products(String productName) {
		addProduct(productName, "10", "10");
	}
	
	@Then("{string} disappears from the list")
	public void product_disappears_from_the_list(String productName) {
		Assert.assertFalse(isDisplayed(getElementByXpathText(addedProduct, productName))); 
	}
	
	@Then("Go to the user panel")
	public void go_to_user_panel() {
		click(headerUserPanelLink);
	}
	
	@Then("I check order confirmation text")
	public void checks_order_confirmation_text() {
		Assert.assertEquals("zamówienie wysłane", getText(CartPage.confirmationOrderMessage));
	}	 
}
