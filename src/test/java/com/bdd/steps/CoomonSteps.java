package com.bdd.steps;

import static com.bdd.impl.AppAccess.*;
import static com.bdd.variables.GlobalVariables.*;

import io.cucumber.java.en.Given;

public class CoomonSteps {
	
	@Given("User navigates to the application")
	public void user_navigates_to_the_application() {
		accessApp();
		gdriver.manage().window().maximize();
		openUrl();
	}

}
