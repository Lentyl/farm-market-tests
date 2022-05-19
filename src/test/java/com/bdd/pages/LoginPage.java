package com.bdd.pages;

import static com.bdd.utils.ReusableAndGlobalFunctionalities.*;
import org.openqa.selenium.By;

public class LoginPage {
	
	public static By loginPageEmailInput = By.cssSelector(".form-control[placeholder='e-mail']");
	public static By loginPagePasswordInput = By.cssSelector(".form-control[placeholder='hasło']");
	public static By loginPageConfirmButton = By.className("login__btn");
	public static By loginPageWelcomeInscription = By.className("login__title");
	
	public static void logIn(String email, String password) {
		sendKeys(loginPageEmailInput, email);
		sendKeys(loginPagePasswordInput, password);
		click(loginPageConfirmButton);
	}
}
