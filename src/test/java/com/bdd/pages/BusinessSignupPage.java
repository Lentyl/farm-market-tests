package com.bdd.pages;

import static com.bdd.utils.ReusableAndGlobalFunctionalities.*;

import org.openqa.selenium.By;

public class BusinessSignupPage {
	
	public static By businessSignUpPageNameInput = By.id("validationCustom01");
	public static By businessSignUpPagePasswordInput = By.id("validationCustom02");
	public static By businessSignUpPageEmailInput = By.id("validationCustomUsername");
	public static By businessSignUpPagePostcodeInput = By.id("validationCustom05");
	public static By businessSignUpPageTownInput = By.id("validationCustom03");
	public static By businessSignUpPageStreetInput = By.id("validationCustom04");
	public static By businessSignUpPageAgreementCheckbox = By.className("form-check-input");
	
	public static By businessSignUpPageProductNameInput = By.className("product-autocomplete__input");
	public static By businessSignUpPagePriceInput = By.cssSelector("input[placeholder='zł']");
	public static By businessSignUpPageWeightInput = By.cssSelector("input[placeholder='kg']");
	public static By businessSignUpPageAddButton = By.className("add-product__btn");
	public static By businessSignUpPageConfirmButton = By.className("sign-up__business-btn");
	public static By businessSignUpPageAutocompletProductElement = By.className("product-autocomplete__product");
	public static By businessSignUpPageAddedProductName = By.cssSelector(".add-product__list-item-element:nth-child(1)");
	public static By businessSignUpPageCancelProductButton = By.className("btn-outline-danger");
	public static By businessSignUpPageTitle = By.className("login__title");
	

	
	public static void businessSignUp(String name, String password, String email, String postcode, String town, String street, boolean... checkbox){
		
		boolean clickCheckbox =  checkbox.length > 0 ? (boolean)checkbox[0]  : true;
		
		sendKeys(businessSignUpPageNameInput, name);
		sendKeys(businessSignUpPagePasswordInput, password);
		sendKeys(businessSignUpPageEmailInput, email);
		sendKeys(businessSignUpPagePostcodeInput, postcode);
		sendKeys(businessSignUpPageTownInput, town);
		sendKeys(businessSignUpPageStreetInput, street);
		if(clickCheckbox)click(businessSignUpPageAgreementCheckbox);
	}
	
	public static void addProduct(String productName, String price, String weight) {
		clear(businessSignUpPageProductNameInput);
		sendKeys(businessSignUpPageProductNameInput, productName);
		click(businessSignUpPageProductNameInput);
		click(businessSignUpPageAutocompletProductElement);
		clear(businessSignUpPagePriceInput);
		sendKeys(businessSignUpPagePriceInput, price);
		clear(businessSignUpPageWeightInput);
		sendKeys(businessSignUpPageWeightInput, weight);
		click(businessSignUpPageAddButton);
	}
	
}
