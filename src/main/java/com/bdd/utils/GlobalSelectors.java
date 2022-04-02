package com.bdd.utils;

import org.openqa.selenium.By;


public class GlobalSelectors {
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
	public static By headerLogoInscriptionLink = By.cssSelector("a[href='/']:nth-child(2)");
	public static By headerCartLogoNumber = By.className("header__cart-item-counter"); 
	public static By headerLogoutButto = By.className("header__signout-btn");
	
	//reusable global selectors
	public static By productDetailsBytton = By.className("search__details-btn");
	public static By addToCartButton = By.className("search__add-item-btn");
	public static By productDetailsBackwordButton = By.className("search__backwards-btn");
	
}
