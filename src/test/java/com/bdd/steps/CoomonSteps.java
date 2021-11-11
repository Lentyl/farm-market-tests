package com.bdd.steps;

import static com.bdd.impl.AppAccess.*;
import static com.bdd.utils.GlobalSelectors.HEADER_AUTOCOMPLETE_INPUT;
import static com.bdd.utils.ReusableAndGlobalFunctionalities.SendKeys;
import static com.bdd.utils.ReusableAndGlobalFunctionalities.headerAutocomplitChoyce;
import static com.bdd.variables.GlobalVariables.*;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CoomonSteps {
	
	@Given("User navigates to the application")
	public void user_navigates_to_the_application() {
		accessApp();
		gdriver.manage().window().maximize();
		openUrl();
	}
	
	//set 1
	@When("User type {string} name")
	public void user_type_product_name(String product) {
		SendKeys(HEADER_AUTOCOMPLETE_INPUT, product);
	}
	@And("Choose product")
	public void click_on_search_button() {
		headerAutocomplitChoyce();
	}
}
