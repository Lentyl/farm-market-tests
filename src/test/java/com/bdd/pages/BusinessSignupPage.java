package com.bdd.pages;

import org.openqa.selenium.By;
import static com.bdd.utils.ReusableAndGlobalFunctionalities.*;

public class BusinessSignupPage extends BasePage {
	
	public static By nameInput = By.id("validationCustom01");
	public static By passwordInput = By.id("validationCustom02");
	public static By emailInput = By.id("validationCustomUsername");
	public static By postcodeInput = By.id("validationCustom05");
	public static By townInput = By.id("validationCustom03");
	public static By streetInput = By.id("validationCustom04");
	public static By agreementCheckbox = By.className("form-check-input");
	
	public static By productNameInput = By.className("product-autocomplete__input");
	public static By priceInput = By.cssSelector("input[placeholder='zł']");
	public static By weightInput = By.cssSelector("input[placeholder='kg']");
	public static By addButton = By.className("add-product__btn");
	public static By confirmButton = By.className("sign-up__business-btn");
	public static By autocompletProductElement = By.className("product-autocomplete__product");
	public static By addedProductName = By.cssSelector(".add-product__list-item-element:nth-child(1)");
	public static By cancelProductButton = By.className("btn-outline-danger");
	public static By title = By.className("login__title");
	
	public static void signUp(String name, String password, String email, String postcode, String town, String street, boolean... checkbox){
		
		boolean clickCheckbox =  checkbox.length > 0 ? (boolean)checkbox[0]  : true;
		
		sendKeys(nameInput, name);
		sendKeys(passwordInput, password);
		sendKeys(emailInput, email);
		sendKeys(postcodeInput, postcode);
		sendKeys(townInput, town);
		sendKeys(streetInput, street);
		if(clickCheckbox)click(agreementCheckbox);
	}
	
	public static void addProduct(String productName, String price, String weight) {
		clear(productNameInput);
		sendKeys(productNameInput, productName);
		click(productNameInput);
		click(autocompletProductElement);
		clear(priceInput);
		sendKeys(priceInput, price);
		clear(weightInput);
		sendKeys(weightInput, weight);
		click(addButton);
	}
	
}
