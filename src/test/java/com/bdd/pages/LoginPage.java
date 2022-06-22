package com.bdd.pages;

import static com.bdd.utils.ReusableAndGlobalFunctionalities.*;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {
	
	public static By emailInput = By.cssSelector(".form-control[placeholder='e-mail']");
	public static By passwordInput = By.cssSelector(".form-control[placeholder='hasło']");
	public static By confirmButton = By.className("login__btn");
	public static By welcomeInscription = By.className("login__title");
	
	public static void logIn(String email, String password) {
		sendKeys(emailInput, email);
		sendKeys(passwordInput, password);
		click(confirmButton);
	}
}
