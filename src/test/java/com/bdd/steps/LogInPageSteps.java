package com.bdd.steps;

import com.bdd.pages.LoginPage;
import static com.bdd.utils.ReusableAndGlobalFunctionalities.*;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LoginPageSteps {
	
	@And("I log in with the correct credentials")
	public void log_in_with_correct_credentials() {
		LoginPage.logIn("ralf88@wp.pl", "ralf88");
	}
	
	@And("Log in with incorrect email")
	public void log_in_with_correct_email() {
		LoginPage.logIn("ralf8@wp.pl", "ralf88");
		acceptAlert();
	}
	
	@And("Log in with incorrect password")
	public void log_in_with_correct_password() {
		LoginPage.logIn("ralf88@wp.pl", "ralf8");
		acceptAlert();
	}
	
	@Then("I check, if I am logged in")
	public void Check_if_logged_in() {
		Assert.assertEquals("Witamy jesteś zalogowany.", getText(LoginPage.welcomeInscription)); 
	}
}
