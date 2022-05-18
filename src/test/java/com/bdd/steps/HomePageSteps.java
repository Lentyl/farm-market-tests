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
	
	@When("User clicks on left carusel arrow button")
	public void user_clicks_on_left_carusel_arrow_button(){
		scroll(0,10000);
		click(homePageCarouselLeftButton);
	}
	
	@Then("Carousel goes left")
	public void carousel_goes_left() throws InterruptedException {
		Assert.assertEquals("brukselka 40% taniej", getCurrentHeaderCoureselText());
	}

	@And("User clicks on right corusel arrow button")
	public void user_clicks_on_right_corusel_arrow_button() {
		click(homePageCarouselRightButton);
	}
	
	@Then("Carusel goes right")
	public void carusel_goes_right() throws InterruptedException {
		Assert.assertEquals("20% taniej", getCurrentHeaderCoureselText());
	}
}
