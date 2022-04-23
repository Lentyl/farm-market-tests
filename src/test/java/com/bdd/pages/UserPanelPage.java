package com.bdd.pages;

import static com.bdd.pages.LoginPage.logIn;
import static com.bdd.utils.GlobalSelectors.*;
import static com.bdd.utils.ReusableAndGlobalFunctionalities.*;

import org.jsoup.Jsoup;
import org.openqa.selenium.By;
import org.testng.Assert;

public class UserPanelPage {
	
	public static By userPanelPageUserName = By.xpath("//div[child::h6[text()='nazwa użytkownika']]");
	public static By userPanelPagePostCode = By.xpath("//div[child::h6[text()='kod pocztowy']]");
	public static By userPanelPageTown = By.xpath("//div[child::h6[text()='miejscowość']]");
	public static By userPanelPageStreet = By.xpath("//div[child::h6[text()='ulica/nr domu']]");
	public static By userPanelPageEmail = By.xpath("//div[child::h6[text()='e-mail']]");
	
	public static By userPanelPagePencilIconButton = By.cssSelector("svg.userPanel__pencil-icon");
	public static By userPanelPageConfirmButton = By.xpath("//button[text()='zatwierdź']");
	public static By userPanelPageTownInput = By.xpath("//input[preceding-sibling::h6[text()='miejscowość']]");
	public static By userPanelPageEmailInput = By.xpath("//input[preceding-sibling::h6[text()='e-mail']]");
	public static By userPanelPagePasswordInput = By.xpath("//input[preceding-sibling::h6[text()='hasło']]");
	public static By userPanelPageWarningMessageHeading = By.cssSelector(".alert-heading");
	public static By userPanelPageWarningMessageXButton = By.cssSelector("[aria-hidden='true']");
	
	public static By userPanelPageOrderHeader = By.cssSelector(".userPanel__header");
	public static By userPanelOrderDetailsLink = By.xpath("//a[text()='Szczegóły zamówienia']");
	
	public static By userPanelSellerDetailsButton = By.cssSelector(".order-details__card-btn");
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
	
	
	public static void checkUserInformationFields() {
		
		String name = Jsoup.parse(getAttribute(userPanelPageUserName,"outerHTML")).selectFirst("div").ownText();
		String postCode = Jsoup.parse(getAttribute(userPanelPagePostCode,"outerHTML")).selectFirst("div").ownText();
		String town = Jsoup.parse(getAttribute(userPanelPageTown,"outerHTML")).selectFirst("div").ownText();
		String street = Jsoup.parse(getAttribute(userPanelPageStreet,"outerHTML")).selectFirst("div").ownText();
		String email = Jsoup.parse(getAttribute(userPanelPageEmail,"outerHTML")).selectFirst("div").ownText();
		
		Assert.assertEquals("Rafał", name); 
		Assert.assertEquals("09-100", postCode); 
		Assert.assertEquals("Płońsk", town); 
		Assert.assertEquals("Kazimierza Wielkiego 17A/10", street); 
		Assert.assertEquals("ralf88@wp.pl", email); 
	}
	
	public static void orderDetailsCheck() throws InterruptedException {
		Assert.assertTrue(isDisplayed(getElementByXpathText(userPanelOrderDetailsElement, "łączna kwota: 80 zł"))); 
		Assert.assertTrue(isDisplayed(getElementByXpathText(userPanelOrderDetailsElement, "status zamówienia: realizowane"))); 
		Assert.assertTrue(isDisplayed(getElementByXpathText(userPanelOrderDetailsElement, "jabłko"))); 
		Assert.assertTrue(isDisplayed(getElementByXpathText(userPanelOrderDetailsElement, "30 zł / szt"))); 
		Assert.assertTrue(isDisplayed(getElementByXpathText(userPanelOrderDetailsElement, "1 szt - 70 kg"))); 
		Assert.assertTrue(isDisplayed(getElementByXpathText(userPanelOrderDetailsElement, "winogrono"))); 
		Assert.assertTrue(isDisplayed(getElementByXpathText(userPanelOrderDetailsElement, "50 zł / szt"))); 
		Assert.assertTrue(isDisplayed(getElementByXpathText(userPanelOrderDetailsElement, "zamówiono 1 szt"))); 
		Assert.assertTrue(isDisplayed(getElementByXpathText(userPanelOrderDetailsElement, "1 szt - 60 kg"))); 
	}
	
	public static void sellerDetailsCheck() {
		Assert.assertTrue(isDisplayed(getElementByXpathText(userPanelOrderDetailsElement, "imię: Jarek"))); 
		Assert.assertTrue(isDisplayed(getElementByXpathText(userPanelOrderDetailsElement, "e-mail: jarek@wp.pl"))); 
		Assert.assertTrue(isDisplayed(getElementByXpathText(userPanelOrderDetailsElement, "kod pocztowy: 80-180"))); 
		Assert.assertTrue(isDisplayed(getElementByXpathText(userPanelOrderDetailsElement, "miejscowość: Gdańsk"))); 
		Assert.assertTrue(isDisplayed(getElementByXpathText(userPanelOrderDetailsElement, "ulica/nr domu: Kazimierza Wielkiego 17A/10"))); 
	}
	
}
