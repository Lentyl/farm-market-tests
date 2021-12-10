package com.bdd.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.bdd.pages.BusinessSignupPage.*;
import static com.bdd.pages.SigninPage.SIGNIN_PAGE_WELCOME_INSCRIPTION;
import static com.bdd.utils.ReusableAndGlobalFunctionalities.*;

import org.testng.Assert;

public class BusinessSignupPageSteps {
	

	
	@When("User fill in credentials fields with correct data")
	public void user_fill_in_credentials_fields_with_correct_data() {
		businessSignUp("Robert", "robert88", "robert99@gmail.com", "09-100", "Płońsk", "Kopernika 9b/33");
	}
	
	@When("User fill in credentials with empty Name Field")
	public void user_fill_in_credentials_with_empty_name_field() {
		businessSignUp("", "robert88", "robert99@gmail.com", "09-100", "Płońsk", "Kopernika 9b/33");
	}
	
	@When("User fill in credentials with empty password Field")
	public void user_fill_in_credentials_with_empty_password_field() {
		businessSignUp("Robert", "", "robert99@gmail.com", "09-100", "Płońsk", "Kopernika 9b/33");
	}
	
	@When("User fill in credentials with empty email Field")
	public void user_fill_in_credentials_with_empty_email_field() {
		businessSignUp("Robert", "robert88", "", "09-100", "Płońsk", "Kopernika 9b/33");
	}
	
	@When("User fill in credentials with empty postecode Field")
	public void user_fill_in_credentials_with_empty_postecode_field() {
		businessSignUp("Robert", "robert88", "robert99@gmail.com", "", "Płońsk", "Kopernika 9b/33");
	}
	
	@And("Add product {string}")
	public void add_products(String productName) throws InterruptedException {
		addProduct(productName, "10", "10");
	}
	
	@Then("{string} is added to seller offer, appears on the page")
	public void product_is_added_to_seller_offer_appears_on_the_page(String productName) {
		Assert.assertEquals(productName, GetText(B_SIGNIN_NAME_OF_PRODUCT)); 
	}
	
	@When("User clicks red cancel button to delete product")
	public void user_clicks_red_cancel_button_to_delete_product() {
		Click(B_SIGNIN_CANCEL_PRODUCT_BUTTON);
	}
	
	@Then("Product disappears from the list")
	public void product_disappears_from_the_list() {
		Assert.assertFalse(isDisplayed(B_SIGNIN_CANCEL_PRODUCT_BUTTON)); 
	}
	
	@When("User clicks submit button")
	public void user_clicks_submit_button() {
		Click(B_SIGNIN_PAGE_CONFIRM_BUTTON);
	}
	
	@Then("User is signed in, confirmation inscription appears")
	public void user_is_signed_in_confirmation_inscription_appears() {
		Assert.assertEquals("Witamy rejestracja powiodła się.", GetText(B_SIGNIN_TITLE)); 
	}
}
