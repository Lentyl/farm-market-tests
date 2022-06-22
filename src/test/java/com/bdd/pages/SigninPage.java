package com.bdd.pages;

import static com.bdd.utils.ReusableAndGlobalFunctionalities.*;

import org.openqa.selenium.By;

public class SigninPage extends BasePage {

	public static By nameInput = By.id("validationCustom01");
	public static By emailInput = By.id("validationCustomUsername");
	public static By passwordInput = By.id("validationCustom02");
	public static By agreementCheckbox = By.className("form-check-input");
	public static By signInButton = By.className("sign-up__button");
	public static By welcomeInscription = By.className("login__title");
	
	public static void signIn(String name, String email, String password) {
		sendKeys(nameInput, name);
		sendKeys(emailInput, email);
		sendKeys(passwordInput, password);
		click(agreementCheckbox);
		click(signInButton);
	}
}
