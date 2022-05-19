package com.bdd.pages;

import static com.bdd.pages.LoginPage.logIn;
import static com.bdd.utils.GlobalSelectors.*;
import static com.bdd.utils.ReusableAndGlobalFunctionalities.*;

import org.jsoup.Jsoup;
import org.openqa.selenium.By;

public class UserPanelPage {
	
	//USER DETAILS
	public static By userPanelUserDetailsField = By.xpath("//div[child::h6[text()='#####']]");
	public static By userPanelPageConfirmButton = By.xpath("//button[text()='zatwierdź']");
	public static By userPanelPageTownInput = By.xpath("//input[preceding-sibling::h6[text()='miejscowość']]");
	public static By userPanelPageEmailInput = By.xpath("//input[preceding-sibling::h6[text()='e-mail']]");
	public static By userPanelPagePasswordInput = By.xpath("//input[preceding-sibling::h6[text()='hasło']]");
	
	//WARNIN MESSAGE ELEMENTS
	public static By userPanelPageWarningMessageHeading = By.cssSelector(".alert-heading");
	public static By userPanelPageWarningMessageXButton = By.cssSelector("[aria-hidden='true']");
	
	//USER PANEL NAVIGATION AND HEADERS
	public static By userPanelPagePencilIconButton = By.cssSelector("svg.userPanel__pencil-icon");
	public static By userPanelPageOrderHeader = By.cssSelector(".userPanel__header");
	public static By userPanelOrderDetailsLink = By.xpath("//a[text()='Szczegóły zamówienia']");
	public static By userPanelSellerDetailsButton = By.cssSelector(".order-details__card-btn");
	
	//ORDER DETAILS ELEMENTS
	public static By userPanelOrderDetailsElement = By.xpath("//div[contains(@class,'list-group-flush') and normalize-space()='#####']");
	
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
		sendKeys(userPanelPageEmailInput, email); 
		sendKeys(userPanelPagePasswordInput, "ralf88");
		click(userPanelPageConfirmButton);
	}
	
	public static String getUserInformationValue(String fieldName) {
		if(fieldName.equals("name")) return Jsoup.parse(getAttribute(getElementByXpathText(userPanelUserDetailsField, "nazwa użytkownika"),"outerHTML")).selectFirst("div").ownText();
		else if(fieldName.equals("postCode")) return Jsoup.parse(getAttribute(getElementByXpathText(userPanelUserDetailsField, "kod pocztowy"),"outerHTML")).selectFirst("div").ownText();
		else if(fieldName.equals("town")) return Jsoup.parse(getAttribute(getElementByXpathText(userPanelUserDetailsField, "miejscowość"),"outerHTML")).selectFirst("div").ownText();
		else if(fieldName.equals("street")) return Jsoup.parse(getAttribute(getElementByXpathText(userPanelUserDetailsField, "ulica/nr domu"),"outerHTML")).selectFirst("div").ownText();
		else if(fieldName.equals("email")) return Jsoup.parse(getAttribute(getElementByXpathText(userPanelUserDetailsField, "e-mail"),"outerHTML")).selectFirst("div").ownText();
		return null;
	}
	
}
