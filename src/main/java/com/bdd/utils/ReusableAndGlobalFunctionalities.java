package com.bdd.utils;

import static com.bdd.utils.GlobalSelectors.*;
import static com.bdd.variables.GlobalVariables.*;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class ReusableAndGlobalFunctionalities {
	
	public static By getElementByXpathText(By xpath, String text) {
		String name = xpath.toString();
		name = name.replace("#####", text);
		name = name.replace("By.xpath: ", ""); 
		return By.xpath(name);
	}
	

	public static Boolean isDisplayed(By el) {
		try {
			gwait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(el));
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	public static void acceptAlert() {
		Alert al = gwait.until(ExpectedConditions.alertIsPresent());
		al.accept();
	}

	public static void sleep(int sec) throws InterruptedException {
		Thread.sleep(sec);
	}

	public static void scrollToElement(By el) {
		gjs.executeScript("arguments[0].scrollIntoView(true);", gdriver.findElement(el));
	}

	public static void scrollToBottom() {
		gjs.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public static void scroll(int x, int y) {
		gjs.executeScript("window.scrollBy(" + x + "," + y + ")", "");
	}

	public static void click(By el) {
		gwait.until(ExpectedConditions.visibilityOfElementLocated(el)).click();
	}
	
	public static String getAttribute(By el, String atr) {
		return gwait.until(ExpectedConditions.visibilityOfElementLocated(el)).getAttribute(atr);
	}
	
	
	public static void actMoveToElement(By el, int x, int y) {
		gactoins.moveToElement(gdriver.findElement(el), x, y).build().perform();
	}
	
	public static void actClick(By el) {
		gactoins.click(gdriver.findElement(el)).build().perform();
	}
	
	public static void actSendKeys() {
		gactoins.sendKeys(Keys.BACK_SPACE).build().perform();
	}
	
	public static void actClearInput(By el) {
		gactoins.click(gdriver.findElement(el))
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL)
		.sendKeys(Keys.BACK_SPACE)
		.sendKeys(Keys.ENTER)
		.build()
		.perform();
	}
	
	public static void clickChosenListElement(By el, int number) {
		int i = 0;
		List<WebElement> elementList = gwait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(el));
		for (WebElement button : elementList) {
			if(i== number) {
				button.click();
			}
			i++;
		}
	}

	public static void clickAllElements(By el) {
		List<WebElement> elementList = gwait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(el));
		for (WebElement button : elementList) {
			button.click();
		}
	}
	
	public static void clearAllElements(By el) {
		List<WebElement> elementList = gwait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(el));
		for (WebElement element : elementList) {
			element.clear();
		}
	}
	
	public static void sendKeysToAllElements(By el, String ...fieldsContent) throws InterruptedException {
		int i = 0;
		List<WebElement> elementList = gwait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(el));
		for (WebElement element : elementList) {
			sleep(10000);
			element.clear();
			element.sendKeys(fieldsContent[i++]);
		}
	}

	public static void sendKeys(By el, String text) {
		gwait.until(ExpectedConditions.visibilityOfElementLocated(el)).sendKeys(text);
	}

	public static String getText(By el) {
		return gwait.until(ExpectedConditions.visibilityOfElementLocated(el)).getText();
	}

	public static void clear(By el) {
		gdriver.findElement(el).clear();
	}

	public static void headerAutocomplitChoyce() {
		click(headerAutocompleteSearchedProduct);
		click(headerSearchButton);
		clear(headerAutocompleteInput);
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
			click(headerBuyLink);
			break;
		case "sell":
			click(headerSellLink);
			break;
		case "cart":
			click(headerCartLink);
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
		click(headerLoginSignupDropdown);
		if (page.equals("login")) {
			click(headerLoginLink);
		} else {
			click(headerSignupLink);
		}
	}

	public static void checkLogoLinks() {
		click(headerLogoLink);
		Assert.assertEquals("https://farm-market-app-74e39.web.app/", gdriver.getCurrentUrl());
		click(headerCartLink);
		click(headerLogoInscriptionLink);
	}

}
