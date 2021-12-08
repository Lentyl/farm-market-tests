package com.bdd.pages;

import static com.bdd.utils.ReusableAndGlobalFunctionalities.Click;
import static com.bdd.utils.ReusableAndGlobalFunctionalities.SendKeys;

import org.openqa.selenium.By;

public class SigninPage {

	public static By SIGNIN_PAGE_NAME_INPUT = By.id("validationCustom01");
	public static By SIGNIN_PAGE_EMAIL_INPUT = By.id("validationCustomUsername");
	public static By SIGNIN_PAGE_PASSWORD_INPUT = By.id("validationCustom02");
	public static By SIGNIN_PAGE_AGREEMENT_CHECKBOX = By.className("form-check-input");
	public static By SIGNIN_PAGE_BUTTON = By.className("sign-up__button");
	public static By SIGNIN_PAGE_WELCOME_INSCRIPTION = By.className("login__title");
	
	
	public static void SignIn(String name, String email, String password) {
		SendKeys(SIGNIN_PAGE_NAME_INPUT, name);
		SendKeys(SIGNIN_PAGE_EMAIL_INPUT, email);
		SendKeys(SIGNIN_PAGE_PASSWORD_INPUT, password);
		Click(SIGNIN_PAGE_AGREEMENT_CHECKBOX);
		Click(SIGNIN_PAGE_BUTTON);
	}
	
}
