package com.bdd.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.bdd.pages.BusinessSignupPage.*;
import static com.bdd.utils.ReusableAndGlobalFunctionalities.*;

import org.testng.Assert;

public class BusinessSignupPageSteps {
	
	@And("I fill in credentials without marking confirmation checkbox")
	public void user_fill_in_credentials_without_marking_confirmation_checkbox() {
		businessSignUp("Robert", "robert88", "robert99@gmail.com", "09-100", "Płońsk", "Kopernika 9b/33", false);
	}
	
	@When("I fill in credentials with invalid email")
	public void user_fill_in_credentials_with_invalid_email() {
		businessSignUp("Robert", "robert88", "robert99gmail.com", "09-100", "Płońsk", "Kopernika 9b/33");
	}
	
	@When("I fill in credentials fields with correct data")
	public void user_fill_in_credentials_fields_with_correct_data() {
		businessSignUp("Robert", "robert88", "robert99@gmail.com", "09-100", "Płońsk", "Kopernika 9b/33");
	}
	
	@When("I fill in credentials with empty Name field")
	public void user_fill_in_credentials_with_empty_name_field() {
		businessSignUp("", "robert88", "robert99@gmail.com", "09-100", "Płońsk", "Kopernika 9b/33");
	}
	
	@When("I fill in credentials with empty password field")
	public void user_fill_in_credentials_with_empty_password_field() {
		businessSignUp("Robert", "", "robert99@gmail.com", "09-100", "Płońsk", "Kopernika 9b/33");
	}
	
	@When("I fill in credentials with empty email field")
	public void user_fill_in_credentials_with_empty_email_field() {
		businessSignUp("Robert", "robert88", "", "09-100", "Płońsk", "Kopernika 9b/33");
	}
	
	@When("I fill in credentials with empty postecode field")
	public void user_fill_in_credentials_with_empty_postecode_field() {
		businessSignUp("Robert", "robert88", "robert99@gmail.com", "", "Płońsk", "Kopernika 9b/33");
	}
	
	@When ("I fill in credentials with empty city field")
	public void user_fill_in_credentials_with_empty_city_field() {
		businessSignUp("Robert", "robert88", "robert99@gmail.com", "09-100", "", "Kopernika 9b/33");
	}
	
	@When ("I fill in credentials with empty street field")
	public void user_fill_in_credentials_with_empty_street_field() {
		businessSignUp("Robert", "robert88", "robert99@gmail.com", "09-100", "Płońsk", "");
	}
	
	@And("I click submit button")
	public void user_clicks_submit_button() {
		click(businessSignUpPageConfirmButton);
	}
	
	@Then("I am signed in, confirmation inscription appears")
	public void user_is_signed_in_confirmation_inscription_appears() {
		Assert.assertEquals("Witamy rejestracja powiodła się.", getText(businessSignUpPageTitle)); 
	}
}
