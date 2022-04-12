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
	
	public static By cartPageDeliveryManRadioButton = By.cssSelector("[value='courier']");
	public static By cartPageOrderButton = By.cssSelector("[type='submite']");
	public static By cartPageDeliveryMethodWarningSign = By.xpath("//p[text()='Nie jest wybrana opcja dostawy lub płatności które są wymagane.']");
	public static By cartPageDeliveryMethodXButtonWarningSign = By.xpath("//button[following-sibling::p[text()='Nie jest wybrana opcja dostawy lub płatności które są wymagane.']]");
	
	public static By cartPageNameInput = By.cssSelector("[placeholder='Imię i nazwisko lub nazwa firmy']");
	public static By cartPageStreetInInput = By.cssSelector("[placeholder='Ulica i numer']"); 
	public static By cartPagePostCodeInput = By.cssSelector("[placeholder='Kod pocztowy']");
	public static By cartPageTownInput = By.cssSelector("[placeholder='Miejscowość']");
	public static By cartPageEmailInput = By.cssSelector("[placeholder='e-mail']");
	public static By cartPageTelephoneInput = By.cssSelector("[placeholder='Telefon']");
	
	public static By cartPageRecipientsDetailsInputs = By.cssSelector(".cart__details-item");
	
	public static By cartPageNameErrorMessage = By.xpath("//label[text()='imię i nazwisko odbiorcy']/preceding-sibling::div[1]/div[text()='Pole wymagane!']");
	public static By cartPageStreetErrorMessage = By.xpath("//label[text()='ulica i numer domu']/preceding-sibling::div[1]/div[text()='Pole wymagane!']");
	public static By cartPagePostCodeErrorMessage = By.xpath("//label[text()='kod pocztowy']/preceding-sibling::div[1]/div[text()='Pole wymagane!']");
	public static By cartPageTownErrorMessage = By.xpath("//label[text()='miejscowość']/preceding-sibling::div[1]/div[text()='Pole wymagane!']");
	public static By cartPageEmailMessage = By.xpath("//label[text()='e-mail']/preceding-sibling::div[1]/div[text()='Pole wymagane, sprawdź poprawność e-maila!']");
	public static By cartPageTelephoneMessage = By.xpath("//label[text()='Telefon']/preceding-sibling::div[1]/div[text()='Numer powinien być dziewięciocyfrowy!']");
	
	public static By cartPageConfirmationOrderMessage = By.cssSelector(".cart__delivery-container > h2");


	public static void navigateWithFullCartToCartPage(){
		goToLoginSignUpPage("login");
		logIn("ralf88@wp.pl", "ralf88");
		click(headerLogoLink);
		sendKeys(headerAutocompleteInput, "jabłko");
		headerAutocomplitChoyce();
		click(productDetailsBytton);
		clickAllElements(addToCartButton);
		click(headerCartLink);
	}
	
	public static void automaticFillingFieldsWithDataCheck(){
		Assert.assertEquals( "Jarek", getAttribute(cartPageNameInput,"value"));
		Assert.assertEquals("Kazimierza Wielkiego 17A/10", getAttribute(cartPageStreetInInput,"value"));
		Assert.assertEquals("80-180", getAttribute(cartPagePostCodeInput,"value"));
		Assert.assertEquals("Gdańsk", getAttribute(cartPageTownInput,"value"));
		Assert.assertEquals("jarek@wp.pl", getAttribute(cartPageEmailInput,"value"));
	}
	
	public static void fillInRecipientsDetails(String name) throws InterruptedException {
		if(name.equals("userName")) {
			actClearInput(cartPageNameInput);
		}else if(name.equals("street")) {
			actClearInput(cartPageStreetInInput);
		}else if(name.equals("postCode")) {
			actClearInput(cartPagePostCodeInput);
		}else if(name.equals("town")) {
			actClearInput(cartPageTownInput);
		}else if(name.equals("email")) {
			actClearInput(cartPageEmailInput);
		}else if(name.equals("telephone")) {
			actClearInput(cartPageTelephoneInput);
		}
	}
	
	public static void errorMessageCheck(String name) throws InterruptedException {
		if(name.equals("userName"))Assert.assertTrue(isDisplayed(cartPageStreetErrorMessage));
		else if(name.equals("street"))Assert.assertTrue(isDisplayed(cartPageStreetErrorMessage));
		else if(name.equals("postCode"))Assert.assertTrue(isDisplayed(cartPagePostCodeErrorMessage));
		else if(name.equals("town"))Assert.assertTrue(isDisplayed(cartPageTownErrorMessage));
		else if(name.equals("email"))Assert.assertTrue(isDisplayed(cartPageEmailMessage));
		else if(name.equals("telephone"))Assert.assertTrue(isDisplayed(cartPageTelephoneMessage));
	}
	
	
	
}
