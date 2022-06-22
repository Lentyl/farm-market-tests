package com.bdd.pages;

import static com.bdd.pages.LoginPage.logIn;
import static com.bdd.utils.ReusableAndGlobalFunctionalities.*;

import org.jsoup.Jsoup;
import org.openqa.selenium.By;

public class UserPanelPage extends BasePage {
	
	//USER DETAILS
	public static By userDetailsField = By.xpath("//div[child::h6[text()='#####']]");
	public static By confirmButton = By.xpath("//button[text()='zatwierdź']");
	public static By townInput = By.xpath("//input[preceding-sibling::h6[text()='miejscowość']]");
	public static By emailInput = By.xpath("//input[preceding-sibling::h6[text()='e-mail']]");
	public static By passwordInput = By.xpath("//input[preceding-sibling::h6[text()='hasło']]");
	
	//WARNIN MESSAGE ELEMENTS
	public static By warningMessageHeading = By.cssSelector(".alert-heading");
	public static By warningMessageXButton = By.cssSelector("[aria-hidden='true']");
	
	//USER PANEL NAVIGATION AND HEADERS
	public static By pencilIconButton = By.cssSelector("svg.userPanel__pencil-icon");
	public static By orderHeader = By.cssSelector(".userPanel__header");
	public static By orderDetailsLink = By.xpath("//a[text()='Szczegóły zamówienia']");
	public static By sellerDetailsButton = By.cssSelector(".order-details__card-btn");
	
	//ORDER DETAILS ELEMENTS
	public static By orderDetailsElement = By.xpath("//div[contains(@class,'list-group-flush') and normalize-space()='#####']");
	
	public static void goToUserPanel(String userStatus) {
		if(userStatus.equals("business")) {
			goToLoginSignUpPage("login");
			logIn("ralf88@wp.pl", "ralf88");
			click(headerUserPanelLink);
		}else {
			goToLoginSignUpPage("login");
			logIn("many185@wp.pl", "many185");
			click(headerUserPanelLink);
		}
	}
	
	public static void emailValueChange(String email) {
		sendKeys(emailInput, email); 
		sendKeys(passwordInput, "ralf88");
		click(confirmButton);
	}
	
	public static String getUserInformationValue(String fieldName) {
		if(fieldName.equals("name")) return Jsoup.parse(getAttribute(getElementByXpathText(userDetailsField, "nazwa użytkownika"),"outerHTML")).selectFirst("div").ownText();
		else if(fieldName.equals("postCode")) return Jsoup.parse(getAttribute(getElementByXpathText(userDetailsField, "kod pocztowy"),"outerHTML")).selectFirst("div").ownText();
		else if(fieldName.equals("town")) return Jsoup.parse(getAttribute(getElementByXpathText(userDetailsField, "miejscowość"),"outerHTML")).selectFirst("div").ownText();
		else if(fieldName.equals("street")) return Jsoup.parse(getAttribute(getElementByXpathText(userDetailsField, "ulica/nr domu"),"outerHTML")).selectFirst("div").ownText();
		else if(fieldName.equals("email")) return Jsoup.parse(getAttribute(getElementByXpathText(userDetailsField, "e-mail"),"outerHTML")).selectFirst("div").ownText();
		return null;
	}
	
}
