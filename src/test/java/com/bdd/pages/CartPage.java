package com.bdd.pages;
import static com.bdd.pages.LoginPage.*;
import static com.bdd.utils.ReusableAndGlobalFunctionalities.*;

import org.openqa.selenium.By;

public class CartPage extends BasePage {
	
	//ORDER DETAILS ELEMENTS
	public static By firstItemAddButton = By.cssSelector(".cart__list-item:nth-child(1) > .cart__item-add-btn");
	public static By firstItemQuantity = By.cssSelector(".cart__list-item:nth-child(1) > .cart__item-quantity");
	public static By binButtons = By.className("cart__item-bin-btn");
	public static By emptyCartHeader = By.cssSelector(".cart__empty-cart-header");
	public static By priceCounter = By.cssSelector(".empty-cart-header");
	public static By blikRadioButton = By.cssSelector("[value='blik']");
	public static By deliveryManRadioButton = By.cssSelector("[value='courier']");
	public static By orderButton = By.cssSelector("[type='submite']");
	public static By confirmationOrderMessage = By.cssSelector(".cart__delivery-container > h2");
	
	//USER INPUT FIELDS
	public static By nameInput = By.cssSelector("[placeholder='Imię i nazwisko lub nazwa firmy']");
	public static By streetInput = By.cssSelector("[placeholder='Ulica i numer']"); 
	public static By postCodeInput = By.cssSelector("[placeholder='Kod pocztowy']");
	public static By townInput = By.cssSelector("[placeholder='Miejscowość']");
	public static By emailInput = By.cssSelector("[placeholder='e-mail']");
	public static By telephoneInput = By.cssSelector("[placeholder='Telefon']");
	public static By recipientsALLInputs = By.cssSelector(".cart__details-item");
	
	//ERROR MESSAGES
	public static By nameErrorMessage = By.xpath("//label[text()='imię i nazwisko odbiorcy']/preceding-sibling::div[1]/div[text()='Pole wymagane!']");
	public static By streetErrorMessage = By.xpath("//label[text()='ulica i numer domu']/preceding-sibling::div[1]/div[text()='Pole wymagane!']");
	public static By postCodeErrorMessage = By.xpath("//label[text()='kod pocztowy']/preceding-sibling::div[1]/div[text()='Pole wymagane!']");
	public static By townErrorMessage = By.xpath("//label[text()='miejscowość']/preceding-sibling::div[1]/div[text()='Pole wymagane!']");
	public static By emailMessage = By.xpath("//label[text()='e-mail']/preceding-sibling::div[1]/div[text()='Pole wymagane, sprawdź poprawność e-maila!']");
	public static By telephoneMessage = By.xpath("//label[text()='Telefon']/preceding-sibling::div[1]/div[text()='Numer powinien być dziewięciocyfrowy!']");
	public static By deliveryMethodWarningSign = By.xpath("//p[text()='Nie jest wybrana opcja dostawy lub płatności które są wymagane.']");
	public static By deliveryMethodWarningSignXButton = By.xpath("//button[following-sibling::p[text()='Nie jest wybrana opcja dostawy lub płatności które są wymagane.']]");
	
	
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
	
	public static void fillInRecipientsDetails(String name) throws InterruptedException {
		if(name.equals("userName")) {
			actClearInput(nameInput);
		}else if(name.equals("street")) {
			actClearInput(streetInput);
		}else if(name.equals("postCode")) {
			actClearInput(postCodeInput);
		}else if(name.equals("town")) {
			actClearInput(townInput);
		}else if(name.equals("email")) {
			actClearInput(emailInput);
		}else if(name.equals("telephone")) {
			actClearInput(telephoneInput);
		}
	}
	
	public static Boolean errorMessageCheck(String name) throws InterruptedException {
		if(name.equals("userName")) return isDisplayed(nameErrorMessage);
		else if(name.equals("street")) return isDisplayed(streetErrorMessage);
		else if(name.equals("postCode")) return isDisplayed(postCodeErrorMessage);
		else if(name.equals("town")) return isDisplayed(townErrorMessage);
		else if(name.equals("email")) return isDisplayed(emailMessage);
		else if(name.equals("telephone")) return isDisplayed(telephoneMessage);
		else if(name.equals("delivery")) return isDisplayed(deliveryMethodWarningSign);
		return false;
	}
}
