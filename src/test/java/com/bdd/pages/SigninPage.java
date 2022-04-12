package com.bdd.pages;

import static com.bdd.utils.ReusableAndGlobalFunctionalities.*;

import org.openqa.selenium.By;

public class SigninPage {

	public static By signinPageNameInput = By.id("validationCustom01");
	public static By signinPageEmailInput = By.id("validationCustomUsername");
	public static By signinPagePasswordInput = By.id("validationCustom02");
	public static By signinPageAgreementCheckbox = By.className("form-check-input");
	public static By signinPageButton = By.className("sign-up__button");
	public static By signinPageWelcomeInscription = By.className("login__title");
	
	
	public static void signIn(String name, String email, String password) {
		sendKeys(signinPageNameInput, name);
		sendKeys(signinPageEmailInput, email);
		sendKeys(signinPagePasswordInput, password);
		click(signinPageAgreementCheckbox);
		click(signinPageButton);
	}
	
}
