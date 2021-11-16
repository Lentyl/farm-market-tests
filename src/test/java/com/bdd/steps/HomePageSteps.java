package com.bdd.steps;

import static com.bdd.pages.HomePage.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.bdd.utils.GlobalSelectors.*;
import static com.bdd.utils.ReusableAndGlobalFunctionalities.*;

import static com.bdd.variables.GlobalVariables.*;

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
	
	@When("User clicks on left carusel arrow button")
	public void user_clicks_on_left_carusel_arrow_button(){
		Scroll(0,10000);
		Click(HOME_PAGE_CAROUSEL_LEFT_BUTTON);
	}
	
	@Then("Carousel goes left")
	public void carousel_goes_left() throws InterruptedException {
		Assert.assertEquals("brukselka 40% taniej", getCurrentHeaderCoureselText());
	}
	

	@When("User clicks on right corusel arrow Button")
	public void user_clicks_on_right_corusel_arrow_button() {
		Click(HOME_PAGE_CAROUSEL_RIGHT_BUTTON);
	}
	
	@Then("carusel goes right")
	public void carusel_goes_right() throws InterruptedException {
		Assert.assertEquals("20% taniej", getCurrentHeaderCoureselText());
		//Scroll(0,-10000);
	}
	
	@Then("Clicks on the product details button")
	public void clicks_on_the_product_details_button() {
		
	}
	
	
	
	//System.out.println(pageName+ " - !!!!!!!!!!!!!!!!!!!!!!!!!");
}
