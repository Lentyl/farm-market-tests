package com.bdd.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.bdd.pages.SigninPage.*;
import static com.bdd.utils.ReusableAndGlobalFunctionalities.*;

import org.testng.Assert;

public class SigninPageSteps {

	
	@And("Sign in with correct credential")
	public void sign_in_with_correct_credential() {
		signIn("Marcin", "marcin1988@gmail.com", "marcin1988");
	}
	
	@And("Sign in with the same correct credential")
	public void sign_in_with_the_same_correct_credential() {
		signIn("Marcin", "marcin1988@gmail.com", "marcin1988");
		acceptAlert();
	}
	
	@Then("Checks, if he is signed in")
	public void check_if_he_is_signed_in() {
		Assert.assertEquals("Witamy rejestracja powiodła się.", getText(signinPageWelcomeInscription)); 
	}
	
	@When("Sign in with empty name input")
	public void sign_in_with_empty_name_input() {
		signIn("", "marcin1988@gmail.com", "marcin1988");
	}
	
	@When("Sign in with empty email input")
	public void sign_in_with_empty_email_input() {
		signIn("Marcin", "", "marcin1988");
	}
	
	@When("Sign in with empty password input")
	public void sign_in_with_empty_password_input() {
		signIn("Marcin", "marcin1988@gmail.com", "");
	}
	
}
