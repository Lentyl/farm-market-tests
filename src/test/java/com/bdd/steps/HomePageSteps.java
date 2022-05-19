package com.bdd.steps;

import static com.bdd.pages.HomePage.*;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static com.bdd.utils.ReusableAndGlobalFunctionalities.*;

public class HomePageSteps {
	
	@Then ("There is no product description on the page")
	public void no_product_description_appears_on_the_page() {
		Assert.assertEquals("Wyszukaj okazje! Używaj liczby pojedynczej (cebula, truskawka, marchewka).", getText(homePageEmtyProductList));
	}
	
	@When("I click on the left carousel arrow button")
	public void click_on_left_corousel_arrow_button(){
		scroll(0,10000);
		click(homePageCarouselLeftButton);
	}
	
	@Then("Corousel goes left")
	public void carousel_goes_left() throws InterruptedException {
		Assert.assertEquals("brukselka 40% taniej", getCurrentHeaderCoureselText());
	}

	@And("I click on the right corousel arrow button")
	public void click_on_right_corousel_arrow_button() {
		click(homePageCarouselRightButton);
	}
	
	@Then("Corousel goes right")
	public void carusel_goes_right() throws InterruptedException {
		Assert.assertEquals("20% taniej", getCurrentHeaderCoureselText());
	}
}
