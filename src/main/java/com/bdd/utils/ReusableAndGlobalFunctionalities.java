package com.bdd.utils;

import static com.bdd.utils.GlobalSelectors.*;
import static com.bdd.variables.GlobalVariables.*;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class ReusableAndGlobalFunctionalities {

	public static Boolean isDisplayed(By el) {
		try {
			gdriver.findElement(el);
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	public static void AcceptAlert() {
		Alert al = gwait.until(ExpectedConditions.alertIsPresent());
		al.accept();
	}

	public static void Sleep(int sec) throws InterruptedException {
		Thread.sleep(sec);
	}

	public static void ScrollToElement(By el) {
		gjs.executeScript("arguments[0].scrollIntoView(true);", gdriver.findElement(el));
	}

	public static void ScrollToBottom() {
		gjs.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public static void Scroll(int x, int y) {
		gjs.executeScript("window.scrollBy(" + x + "," + y + ")", "");
	}

	public static void Click(By el) {
		gwait.until(ExpectedConditions.visibilityOfElementLocated(el)).click();
	}

	public static void ClickAllElements(By el) {
		List<WebElement> elementList = gwait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(el));
		for (WebElement button : elementList) {
			button.click();
		}
	}

	public static void SendKeys(By el, String text) {
		gwait.until(ExpectedConditions.visibilityOfElementLocated(el)).sendKeys(text);
	}

	public static String GetText(By el) {
		return gwait.until(ExpectedConditions.visibilityOfElementLocated(el)).getText();
	}

	public static void Clear(By el) {
		gdriver.findElement(el).clear();
	}

	public static void headerAutocomplitChoyce() {
		Click(HEADER_AUTOCOMPLET_ELEMENT);
		Click(HEADER_SEARCH_BTN);
		Clear(HEADER_AUTOCOMPLETE_INPUT);
	}

	public static void checkAllLinks(String linkName) {
		switch (linkName) {
		case "login":
			goToLoginSignUpPage(linkName);
			break;
		case "signUp":
			goToLoginSignUpPage(linkName);
			break;
		case "buy":
			Click(HEADER_BUY_LINK);
			break;
		case "sell":
			Click(HEADER_SELL_LINK);
			break;
		case "cart":
			Click(HEADER_CART_LINK);
			break;
		}
	}

	public static void checkAllPages(String pageName) {
		switch (pageName) {
		case "login":
			Assert.assertEquals("https://farm-market-app-74e39.web.app/login", gdriver.getCurrentUrl());
			break;
		case "signUp":
			Assert.assertEquals("https://farm-market-app-74e39.web.app/sign-up", gdriver.getCurrentUrl());
			break;
		case "products":
			Assert.assertEquals("https://farm-market-app-74e39.web.app/products", gdriver.getCurrentUrl());
			break;
		case "businessSignUp":
			Assert.assertEquals("https://farm-market-app-74e39.web.app/business-sign-up", gdriver.getCurrentUrl());
			break;
		case "cart":
			Assert.assertEquals("https://farm-market-app-74e39.web.app/cart", gdriver.getCurrentUrl());
			checkLogoLinks();
			break;
		}
	}

	public static void goToLoginSignUpPage(String page) {
		Click(HEADER_LOGIN_SIGN_UP_DROPDOWN);
		if (page.equals("login")) {
			Click(HEADER_LOGIN_LINK);
		} else {
			Click(HEADER_SIGN_UP_LINK);
		}
	}

	public static void checkLogoLinks() {
		Click(HEADER_LOGO_LINK);
		Assert.assertEquals("https://farm-market-app-74e39.web.app/", gdriver.getCurrentUrl());
		Click(HEADER_CART_LINK);
		Click(HEADER_LOGO_INSCRIPTION_LINK);
	}

}
