package com.bdd.steps;

import io.cucumber.java.en.*;
import static com.bdd.utils.ReusableAndGlobalFunctionalities.*;
import org.testng.Assert;
import static com.bdd.pages.UserPanelPage.*;

public class UserPanelPageSteps {
	
	@Then("I check user information fields")
	public void checks_user_information_fields() {
		Assert.assertEquals("Rafał", getUserInformationValue("name")); 
		Assert.assertEquals("09-100", getUserInformationValue("postCode")); 
		Assert.assertEquals("Płońsk", getUserInformationValue("town")); 
		Assert.assertEquals("Kazimierza Wielkiego 17A/10", getUserInformationValue("street")); 
		Assert.assertEquals("ralf88@wp.pl", getUserInformationValue("email")); 
	}
	
	@When("I am Logged in and have {string} I go to user panel")
	public void logged_in_user_goes_to_user_panel(String userStatus) {
		goToUserPanel(userStatus);
	}
	
	@Then("Check if business panel isnt displaying")
	public void check_if_business_panel_isnt_displaying() {
		Assert.assertFalse(isDisplayed(getElementByXpathText(userPanelUserDetailsField, "nazwa użytkownika")));
	}
	
	@And("I click on the pencil icon button")
	public void clicks_on_the_pencil_icon_button() {
		click(userPanelPagePencilIconButton);
	}
	
	@Then("I check if edit panel is open")
	public void checks_if_edit_panel_is_open() {
		Assert.assertTrue(isDisplayed(userPanelPageConfirmButton)); 
	}
	
	@And("I change town name on {string}")
	public void changes_town_name_on(String townName) {
		clear(userPanelPageTownInput);
		sendKeys(userPanelPageTownInput, townName); 
	}
	
	@And("I click on confirm button")
	public void clicks_on_confirm_button() {
		click(userPanelPageConfirmButton);
	}
	
	@Then("Checks town warning  message content")
	public void checks_town_warning_message_content() {
		Assert.assertEquals("Zmień wszystkie elementy adresu!", getText(userPanelPageWarningMessageHeading));
	}
	
	@Then("I check email warning message content")
	public void checks_email_warning_message_content() {
		Assert.assertEquals("chcesz zmienić e-mail?", getText(userPanelPageWarningMessageHeading));
	}
	
	@And("I click x button in the warning message")
	public void click_x_button_in_the_warning_message() {
		click(userPanelPageWarningMessageXButton);
	}
	
	@And("I changes email")
	public void changes_email() {
		emailValueChange("ralf8@wp.pl"); 
	}
	
	@Then("Checks if orders arent present")
	public void checks_if_there_is_any_order() {
		Assert.assertEquals("Rafał nie masz żadnych zamówień.", getText(userPanelPageOrderHeader));
	}
	
	@Then("I Check if header is correct")
	public void checks_if_header_is_correct_and_order_is_present() {
		Assert.assertEquals("Rafał twoje wszystkie zamówienia", getText(userPanelPageOrderHeader));
	}
	
	@And("Click order details link")
	public void click_order_details_link() {
		clickChosenListElement(userPanelOrderDetailsLink, 0);
	}
	
	@Then("I go to order detail card and check order details")
	public void user_goes_to_order_detail_card_and_checks_order_details() throws InterruptedException {
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
	
	@Then("Click seller details button")
	public void click_seller_details_button() {
		click(userPanelSellerDetailsButton);
	}
	
	@Then("I Check seller details")
	public void check_seller_details() {
		Assert.assertTrue(isDisplayed(getElementByXpathText(userPanelOrderDetailsElement, "imię: Jarek"))); 
		Assert.assertTrue(isDisplayed(getElementByXpathText(userPanelOrderDetailsElement, "e-mail: jarek@wp.pl"))); 
		Assert.assertTrue(isDisplayed(getElementByXpathText(userPanelOrderDetailsElement, "kod pocztowy: 80-180"))); 
		Assert.assertTrue(isDisplayed(getElementByXpathText(userPanelOrderDetailsElement, "miejscowość: Gdańsk"))); 
		Assert.assertTrue(isDisplayed(getElementByXpathText(userPanelOrderDetailsElement, "ulica/nr domu: Kazimierza Wielkiego 17A/10"))); 
	}
}
