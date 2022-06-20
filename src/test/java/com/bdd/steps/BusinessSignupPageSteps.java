package com.bdd.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.bdd.pages.BusinessSignupPage.*;
import static com.bdd.utils.ReusableAndGlobalFunctionalities.*;

import org.testng.Assert;

public class BusinessSignupPageSteps {
	
	@And("I fill in credentials without ticking the confirmation checkbox")
	public void fill_in_credentials_without_marking_confirmation_checkbox() {
		businessSignUp("Robert", "robert88", "robert99@gmail.com", "09-100", "Płońsk", "Kopernika 9b/33", false);
	}
	
	@When("I fill in credentials using invalid email address")
	public void fill_in_credentials_with_invalid_email() {
		businessSignUp("Robert", "robert88", "robert99gmail.com", "09-100", "Płońsk", "Kopernika 9b/33");
	}
	
	@When("I fill in all credential fields with the correct data")
	public void user_fill_in_credentials_fields_with_correct_data() {
		businessSignUp("Robert", "robert88", "robert99@gmail.com", "09-100", "Płońsk", "Kopernika 9b/33");
	}
	
	@When("I fill in all credentials except the name field")
	public void fill_in_credentials_except_name_field() {
		businessSignUp("", "robert88", "robert99@gmail.com", "09-100", "Płońsk", "Kopernika 9b/33");
	}
	
	@When("I fill in all credentials except the password field")
	public void fill_in_credentials_except_password_field() {
		businessSignUp("Robert", "", "robert99@gmail.com", "09-100", "Płońsk", "Kopernika 9b/33");
	}
	
	@When("I fill in all credentials except the email field")
	public void fill_in_credentials_except_email_field() {
		businessSignUp("Robert", "robert88", "", "09-100", "Płońsk", "Kopernika 9b/33");
	}
	
	@When("I fill in all credentials except the postecode field")
	public void fill_in_credentials_except_postecode_field() {
		businessSignUp("Robert", "robert88", "robert99@gmail.com", "", "Płońsk", "Kopernika 9b/33");
	}
	
	@When ("I fill in all credentials except the city field")
	public void fill_in_credentials_except_city_field() {
		businessSignUp("Robert", "robert88", "robert99@gmail.com", "09-100", "", "Kopernika 9b/33");
	}
	
	@When ("I fill in all credentials except the street field")
	public void fill_in_credentials_except_street_field() {
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
