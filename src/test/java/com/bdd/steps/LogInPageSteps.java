package com.bdd.steps;

import static com.bdd.pages.LoginPage.*;
import static com.bdd.utils.ReusableAndGlobalFunctionalities.*;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LoginPageSteps {
	
	
	@And("Log in with correct credential")
	public void log_in_with_correct_credentials() {
		logIn("jarek@wp.pl", "jarek84");
	}
	
	@And("Log in with incorrect email")
	public void log_in_with_correct_email() {
		logIn("jarek88@wp.pl", "jarek84");
		acceptAlert();
	}
	
	@And("Log in with incorrect password")
	public void log_in_with_correct_password() {
		logIn("jarek@wp.pl", "jarek8");
		acceptAlert();
	}
	
	@Then("Checks, if he is logged in")
	public void Check_if_he_is_logged_in() {
		Assert.assertEquals("Witamy jesteś zalogowany.", getText(LOGIN_PAGE_WELCOME_INSCRIPTION)); 
	}

}
