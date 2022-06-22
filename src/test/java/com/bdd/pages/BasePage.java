package com.bdd.pages;

import static com.bdd.utils.ReusableAndGlobalFunctionalities.*;

import org.openqa.selenium.By;


public class BasePage {
	//HEADER SELECTORS
	public static By headerAutocompleteInput = By.className("product-autocomplete__input");	
	public static By headerAutocompleteSearchedProduct = By.className("product-autocomplete__product");
	public static By headerSearchButton = By.className("header__search-button");
	public static By headerLoginSignupDropdown = By.className("dropdown");
	public static By headerLoginLink = By.cssSelector("a[href='/login']");
	public static By headerSignupLink = By.cssSelector("a[href='/sign-up']");
	public static By headerBuyLink = By.cssSelector("a[href='/products']");
	public static By headerSellLink = By.cssSelector("a[href='/business-sign-up']");
	public static By headerCartLink = By.cssSelector("a[href='/cart']");
	public static By headerLogoLink = By.cssSelector("a[href='/']:nth-child(1)");
	public static By headerUserPanelLink = By.cssSelector("a[href='/user']");
	public static By headerLogoInscriptionLink = By.cssSelector("a[href='/']:nth-child(2)");
	public static By headerCartLogoNumber = By.className("header__cart-item-counter"); 
	public static By headerLogoutButto = By.className("header__signout-btn");
	
	//REUSABLE GLOBAL SELECTORS 
	public static By productDetailsBytton = By.className("search__details-btn");
	public static By addToCartButton = By.className("search__add-item-btn");
	public static By productDetailsBackwordButton = By.className("search__backwards-btn");
	public static By productCancelButton = By.xpath("//button[ancestor::div[contains(@class,'add-product__cancel-btn-container') and preceding-sibling::div[text()='#####']]]");
	public static By addedProduct = By.xpath("//div[text()='#####']");
	
	public static void goToLoginSignUpPage(String page) {
		click(headerLoginSignupDropdown);
		if (page.equals("login")) {
			click(headerLoginLink);
		} else {
			click(headerSignupLink);
		}
	}
	
	public static void headerAutocomplitChoyce() {
		click(headerAutocompleteSearchedProduct);
		click(headerSearchButton);
		clear(headerAutocompleteInput);
	}

	public static void clickAllLinks(String linkName) {
		switch (linkName) {
		case "login":
			goToLoginSignUpPage(linkName);
			break;
		case "signUp":
			goToLoginSignUpPage(linkName);
			break;
		case "buy":
			click(headerBuyLink);
			break;
		case "sell":
			click(headerSellLink);
			break;
		case "cart":
			click(headerCartLink);
			break;
		}
	}

	public static String getAllPagesUrl(String pageName) {
		
		String currentUrl = "";
		
		switch (pageName) {
		case "login":
			currentUrl = "https://farm-market-app-74e39.web.app/login";
			break;
		case "signUp":
			currentUrl = "https://farm-market-app-74e39.web.app/sign-up";
			break;
		case "products":
			currentUrl = "https://farm-market-app-74e39.web.app/products";
			break;
		case "businessSignUp":
			currentUrl = "https://farm-market-app-74e39.web.app/business-sign-up";
			break;
		case "cart":
			currentUrl = "https://farm-market-app-74e39.web.app/cart";
			break;
		}
		return currentUrl;
	}
}
