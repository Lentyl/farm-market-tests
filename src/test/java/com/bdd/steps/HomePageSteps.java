package com.bdd.steps;

import static com.bdd.pages.HomePage.*;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.bdd.utils.GlobalSelectors.*;
import static com.bdd.utils.ReusableAndGlobalFunctionalities.*;

public class HomePageSteps {
	
	@When ("User clicks on the {string}")
	public void user_clicks_on_the_Link(String linkName) {
		checkAllLinks(linkName);
	}
	
	@Then ("User is send to {string} page")
	public void user_is_send_to_next_page(String pageName){
		checkAllPages(pageName);
	}
	
	@Then("Product description appears on the page")
	public void product_description_appears_on_the_page() {
		Assert.assertEquals("nazwa: jabłko", GetText(HOME_PAGE_PRODUCT_LIST_ITEM));   
	}
	
	@Then ("No product description appears on the page")
	public void no_product_description_appears_on_the_page() {
		Assert.assertEquals("Wyszukaj okazje! Używaj liczby pojedynczej (cebula, truskawka, marchewka).", GetText(HOME_PAGE_EMPTY_PRODUCT_LIST));
	}
	
	
	
	//System.out.println(pageName+ "- PageName");
}
