package com.bdd.utils;

import org.openqa.selenium.By;


public class GlobalSelectors {
	//HEADER SELECTORS
	public static By HEADER_AUTOCOMPLETE_INPUT = By.className("product-autocomplete__input");	
	public static By HEADER_AUTOCOMPLET_ELEMENT = By.className("product-autocomplete__product");
	public static By HEADER_SEARCH_BTN = By.className("header__search-button");
	public static By HEADER_LOGIN_SIGN_UP_DROPDOWN = By.className("dropdown");
	public static By HEADER_LOGIN_LINK = By.cssSelector("a[href='/login']");
	public static By HEADER_SIGN_UP_LINK = By.cssSelector("a[href='/sign-up']");
	public static By HEADER_BUY_LINK = By.cssSelector("a[href='/products']");
	public static By HEADER_SELL_LINK = By.cssSelector("a[href='/business-sign-up']");
	public static By HEADER_CART_LINK = By.cssSelector("a[href='/cart']");
	public static By HEADER_LOGO_LINK = By.cssSelector("a[href='/']:nth-child(1)");
	public static By HEADER_LOGO_INSCRIPTION_LINK = By.cssSelector("a[href='/']:nth-child(2)");
}
