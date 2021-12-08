package com.bdd.pages;

import static com.bdd.utils.ReusableAndGlobalFunctionalities.*;

import org.openqa.selenium.By;

public class BusinessSignupPage {
	
	public static By B_SIGNIN_PAGE_NAME_INPUT = By.id("validationCustom01");
	public static By B_SIGNIN_PAGE_PASSWORD_INPUT = By.id("validationCustom02");
	public static By B_SIGNIN_PAGE_EMAIL_INPUT = By.id("validationCustomUsername");
	public static By B_SIGNIN_PAGE_POSTCODE_INPUT = By.id("validationCustom05");
	public static By B_SIGNIN_PAGE_TOWN_INPUT = By.id("validationCustom03");
	public static By B_SIGNIN_PAGE_STREET_INPUT = By.id("validationCustom04");
	public static By B_SIGNIN_PAGE_AGREEMENT_CHECKBOX = By.className("form-check-input");
	
	public static By B_SIGNIN_PAGE_PRODUCT_NAME_INPUT = By.className("product-autocomplete__input");
	public static By B_SIGNIN_PAGE_PRICE_INPUT = By.cssSelector("input[placeholder='zł']");
	public static By B_SIGNIN_PAGE_WEIGHT_INPUT = By.cssSelector("input[placeholder='kg']");
	public static By B_SIGNIN_PAGE_ADD_BUTTON = By.className("add-product__btn");
	public static By B_SIGNIN_PAGE_CONFIRM_BUTTON = By.className("sign-up__business-btn");
	public static By B_SIGNIN_AUTOCOMPLET_ELEMENT = By.className("product-autocomplete__product");
	public static By B_SIGNIN_NAME_OF_PRODUCT = By.cssSelector(".add-product__list-item-element:nth-child(1)");
	public static By B_SIGNIN_CANCEL_PRODUCT_BUTTON = By.className("btn-outline-danger");
	public static By B_SIGNIN_TITLE = By.className("login__title");
	

	
	public static void businessSignUp(String name, String password, String email, String postcode, String town, String street){
		SendKeys(B_SIGNIN_PAGE_NAME_INPUT, name);
		SendKeys(B_SIGNIN_PAGE_PASSWORD_INPUT, password);
		SendKeys(B_SIGNIN_PAGE_EMAIL_INPUT, email);
		SendKeys(B_SIGNIN_PAGE_POSTCODE_INPUT, postcode);
		SendKeys(B_SIGNIN_PAGE_TOWN_INPUT, town);
		SendKeys(B_SIGNIN_PAGE_STREET_INPUT, street);
		Click(B_SIGNIN_PAGE_AGREEMENT_CHECKBOX);
		
	}
	
	public static void addProduct(String productName, String price, String weight) throws InterruptedException {
		Clear(B_SIGNIN_PAGE_PRODUCT_NAME_INPUT);
		SendKeys(B_SIGNIN_PAGE_PRODUCT_NAME_INPUT, productName);
		Click(B_SIGNIN_PAGE_PRODUCT_NAME_INPUT);
		Click(B_SIGNIN_AUTOCOMPLET_ELEMENT);
		Clear(B_SIGNIN_PAGE_PRICE_INPUT);
		SendKeys(B_SIGNIN_PAGE_PRICE_INPUT, price);
		Clear(B_SIGNIN_PAGE_WEIGHT_INPUT);
		SendKeys(B_SIGNIN_PAGE_WEIGHT_INPUT, weight);
		Click(B_SIGNIN_PAGE_ADD_BUTTON);
	}
	
}
