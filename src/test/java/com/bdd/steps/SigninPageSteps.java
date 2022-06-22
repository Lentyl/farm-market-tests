package com.bdd.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import com.bdd.pages.SigninPage;
import static com.bdd.utils.ReusableAndGlobalFunctionalities.*;

import org.testng.Assert;

public class SigninPageSteps {
	
	@And("I sign in with the correct credentials")
	public void sign_in_with_correct_credential() {
		SigninPage.signIn("Marcin", "marcin1988@gmail.com", "marcin1988");
	}
	
	@And("Sign in with the same correct credential")
	public void sign_in_with_the_same_correct_credential() {
		SigninPage.signIn("Marcin", "marcin1988@gmail.com", "marcin1988");
		acceptAlert();
	}
	
	@Then("I check, if I am signed in")
	public void check_if_signed_in() {
		Assert.assertEquals("Witamy rejestracja powiodła się.", getText(SigninPage.welcomeInscription)); 
	}
	
	@When("Sign in with empty name input")
	public void sign_in_with_empty_name_input() {
		SigninPage.signIn("", "marcin1988@gmail.com", "marcin1988");
	}
	
	@When("Sign in with empty email input")
	public void sign_in_with_empty_email_input() {
		SigninPage.signIn("Marcin", "", "marcin1988");
	}
	
	@When("Sign in with empty password input")
	public void sign_in_with_empty_password_input() {
		SigninPage.signIn("Marcin", "marcin1988@gmail.com", "");
	}
	
}
