package com.bdd.steps;

import static com.bdd.pages.HomePage.*;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.bdd.utils.GlobalSelectors.*;
import static com.bdd.utils.ReusableFunctionalities.*;

public class HomePageSteps {
	
	@When("User type {string} name")
	public void user_type_product_name(String product) {
		SendKeys(HEADER_AUTOCOMPLETE_INPUT, product);
	}
	@And("Choose product")
	public void click_on_search_button() {
		headerAutocomplitChoyce();
	}
	@Then("Product description appears on the page")
	public void product_description_appears_on_the_page() {
		Assert.assertEquals("nazwa: jabłko", GetText(HOME_PAGE_PRODUCT_LIST_ITEM));   
	}

}
