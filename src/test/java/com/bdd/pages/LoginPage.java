package com.bdd.pages;

import static com.bdd.pages.HomePage.HOME_PAGE_PRODUCT_LIST_ITEM;
import static com.bdd.utils.ReusableAndGlobalFunctionalities.*;
import org.openqa.selenium.By;
import org.testng.Assert;


public class LoginPage {
	
	public static By LOGIN_PAGE_EMAIL_INP = By.cssSelector(".form-control[placeholder='e-mail']");
	public static By LOGIN_PAGE_PASSWORD_INP = By.cssSelector(".form-control[placeholder='hasło']");
	public static By LOGIN_PAGE_CONFIRM_BUTTON = By.className("login__btn");
	public static By LOGIN_PAGE_WELCOME_INSCRIPTION = By.className("login__title");
	
	public static void logInPrivatUser(){
		SendKeys(LOGIN_PAGE_EMAIL_INP, "many78467@wp.pl");
		SendKeys(LOGIN_PAGE_PASSWORD_INP, "mariusz22");
		Click(LOGIN_PAGE_CONFIRM_BUTTON); 
	}
	
	public static void logInSeller() {
		SendKeys(LOGIN_PAGE_EMAIL_INP, "jarek@wp.pl");
		SendKeys(LOGIN_PAGE_PASSWORD_INP, "maniek84");
		Click(LOGIN_PAGE_CONFIRM_BUTTON);
	}
	
	
}
