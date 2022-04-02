package com.bdd.pages;
import static com.bdd.pages.LoginPage.*;
import static com.bdd.utils.ReusableAndGlobalFunctionalities.*;

import org.openqa.selenium.By;
import org.testng.Assert;

import static com.bdd.utils.GlobalSelectors.*;


public class CartPage {
	
	public static By cartPageFirstItemAddButton = By.cssSelector(".cart__list-item:nth-child(1) > .cart__item-add-btn");
	public static By cartPageFirstItemQuantity = By.cssSelector(".cart__list-item:nth-child(1) > .cart__item-quantity");
	public static By cartPageBinButtons = By.className("cart__item-bin-btn");
	public static By cartPageEmptyCartHeader = By.cssSelector(".cart__empty-cart-header");
	public static By cartPagePriceCounter = By.cssSelector(".empty-cart-header");
	public static By cartPageBlikRadioButton = By.cssSelector("[value='blik']");
	public static By cartPageOrderButton = By.cssSelector("[type='submite']");
	public static By cartPageDeliveryMethodWarningSign = By.xpath("//p[text()='Nie jest wybrana opcja dostawy lub płatności które są wymagane.']");
	public static By cartPageDeliveryMethodXButtonWarningSign = By.xpath("//button[following-sibling::p[text()='Nie jest wybrana opcja dostawy lub płatności które są wymagane.']]");
	public static By cartPageNameInput = By.cssSelector("[value='Jarek']");
	public static By cartPageStreetInput = By.cssSelector("[value='Kazimierza Wielkiego 17A/10']"); 
	public static By cartPagePostCodeInput = By.cssSelector("[value='80-180']");
	public static By cartPageTownInput = By.cssSelector("[value='Gdańsk']");
	public static By cartPageEmailInput = By.cssSelector("[value='jarek@wp.pl']");
	public static By cartPageRecipientsDetailsInputs = By.cssSelector(".cart__details-item");
	
	
	
	public static void navigateWithFullCartToCartPage(){
		goToLoginSignUpPage("login");
		logIn("jarek@wp.pl", "maniek84");
		click(headerLogoLink);
		sendKeys(headerAutocompleteInput, "jabłko");
		headerAutocomplitChoyce();
		click(productDetailsBytton);
		clickAllElements(addToCartButton);
		click(headerCartLink);
	}
	
	public static void automaticFillingFieldsWithDataCheck(){
		Assert.assertTrue(isDisplayed(cartPageNameInput));
		Assert.assertTrue(isDisplayed(cartPageNameInput));
		Assert.assertTrue(isDisplayed(cartPageStreetInput));
		Assert.assertTrue(isDisplayed(cartPagePostCodeInput));
		Assert.assertTrue(isDisplayed(cartPageTownInput));
		Assert.assertTrue(isDisplayed(cartPageEmailInput));
	}
	
	public static void fillInRecipientsDetails(String name){
		if(name=="userName") {
			sendKeysToAllElements(cartPageRecipientsDetailsInputs, "", "Kopernika 9b/33", "09-166", "Gdańsk", "grabie111@wp.pl", "66666666673");
		}

	}
	
	public static void errorMessageCheck(String name){
		if(name=="paymentMethod")Assert.assertTrue(isDisplayed(cartPageDeliveryMethodWarningSign));
		else if(name=="userName")Assert.assertTrue(isDisplayed(cartPageDeliveryMethodWarningSign));
		else if(name=="street")Assert.assertTrue(isDisplayed(cartPageDeliveryMethodWarningSign));
		else if(name=="postcode")Assert.assertTrue(isDisplayed(cartPageDeliveryMethodWarningSign));
		else if(name=="Town")Assert.assertTrue(isDisplayed(cartPageDeliveryMethodWarningSign));
		else if(name=="email")Assert.assertTrue(isDisplayed(cartPageDeliveryMethodWarningSign));
		else if(name=="telephone")Assert.assertTrue(isDisplayed(cartPageDeliveryMethodWarningSign));
	}
	
	
	
}
