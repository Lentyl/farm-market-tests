package com.bdd.steps;


import static com.bdd.pages.LoginPage.*;
import static com.bdd.utils.ReusableAndGlobalFunctionalities.GetText;

import org.testng.Assert;

import io.cucumber.java.en.And;

public class LogInPageSteps {
	
	@And("Log in")
	public void log_in() {
		logInPrivatUser();
		Assert.assertEquals("Witamy jesteś zalogowany.", GetText(LOGIN_PAGE_WELCOME_INSCRIPTION)); 
	}

}
