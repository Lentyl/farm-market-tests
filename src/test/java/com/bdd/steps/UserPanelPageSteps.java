package com.bdd.steps;

import io.cucumber.java.en.*;
import static com.bdd.utils.ReusableAndGlobalFunctionalities.*;
import org.testng.Assert;
import com.bdd.pages.UserPanelPage;

public class UserPanelPageSteps {
	
	@Then("I check user information fields")
	public void checks_user_information_fields() {
		Assert.assertEquals("Rafał", UserPanelPage.getUserInformationValue("name")); 
		Assert.assertEquals("09-100", UserPanelPage.getUserInformationValue("postCode")); 
		Assert.assertEquals("Płońsk", UserPanelPage.getUserInformationValue("town")); 
		Assert.assertEquals("Kazimierza Wielkiego 17A/10", UserPanelPage.getUserInformationValue("street")); 
		Assert.assertEquals("ralf88@wp.pl", UserPanelPage.getUserInformationValue("email")); 
	}
	
	@When("I am Logged in and have {string} I go to user panel")
	public void logged_in_user_goes_to_user_panel(String userStatus) {
		UserPanelPage.goToUserPanel(userStatus);
	}
	
	@Then("Check if business panel is not displaying")
	public void check_if_business_panel_isnt_displaying() {
		Assert.assertFalse(isDisplayed(getElementByXpathText(UserPanelPage.userDetailsField, "nazwa użytkownika")));
	}
	
	@And("I click the pencil icon button")
	public void clicks_on_the_pencil_icon_button() {
		click(UserPanelPage.pencilIconButton);
	}
	
	@Then("I check if edit panel is open")
	public void checks_if_edit_panel_is_open() {
		Assert.assertTrue(isDisplayed(UserPanelPage.confirmButton)); 
	}
	
	@And("I change town name to {string}")
	public void changes_town_name_on(String townName) {
		clear(UserPanelPage.townInput);
		sendKeys(UserPanelPage.townInput, townName); 
	}
	
	@And("I click confirm button")
	public void clicks_on_confirm_button() {
		click(UserPanelPage.confirmButton);
	}
	
	@Then("Check the town warning  message content")
	public void checks_town_warning_message_content() {
		Assert.assertEquals("Zmień wszystkie elementy adresu!", getText(UserPanelPage.warningMessageHeading));
	}
	
	@Then("I check email warning message content")
	public void checks_email_warning_message_content() {
		Assert.assertEquals("chcesz zmienić e-mail?", getText(UserPanelPage.warningMessageHeading));
	}
	
	@And("I click x button in the warning message")
	public void click_x_button_in_the_warning_message() {
		click(UserPanelPage.warningMessageXButton);
	}
	
	@And("I change email")
	public void changes_email() {
		UserPanelPage.emailValueChange("ralf8@wp.pl"); 
	}
	
	@Then("I check if orders are present")
	public void checks_if_there_is_any_order() {
		Assert.assertEquals("Rafał nie masz żadnych zamówień.", getText(UserPanelPage.orderHeader));
	}
	
	@Then("I check if the header is correct")
	public void checks_if_header_is_correct_and_order_is_present() {
		Assert.assertEquals("Rafał twoje wszystkie zamówienia", getText(UserPanelPage.orderHeader));
	}
	
	@And("Click order details link")
	public void click_order_details_link() {
		clickChosenListElement(UserPanelPage.orderDetailsLink, 0);
	}
	
	@Then("I go to the order details card and check order details")
	public void user_goes_to_order_detail_card_and_checks_order_details() throws InterruptedException {
		Assert.assertTrue(isDisplayed(getElementByXpathText(UserPanelPage.orderDetailsElement, "łączna kwota: 80 zł"))); 
		Assert.assertTrue(isDisplayed(getElementByXpathText(UserPanelPage.orderDetailsElement, "status zamówienia: realizowane"))); 
		Assert.assertTrue(isDisplayed(getElementByXpathText(UserPanelPage.orderDetailsElement, "jabłko"))); 
		Assert.assertTrue(isDisplayed(getElementByXpathText(UserPanelPage.orderDetailsElement, "30 zł / szt"))); 
		Assert.assertTrue(isDisplayed(getElementByXpathText(UserPanelPage.orderDetailsElement, "1 szt - 70 kg"))); 
		Assert.assertTrue(isDisplayed(getElementByXpathText(UserPanelPage.orderDetailsElement, "winogrono"))); 
		Assert.assertTrue(isDisplayed(getElementByXpathText(UserPanelPage.orderDetailsElement, "50 zł / szt"))); 
		Assert.assertTrue(isDisplayed(getElementByXpathText(UserPanelPage.orderDetailsElement, "zamówiono 1 szt"))); 
		Assert.assertTrue(isDisplayed(getElementByXpathText(UserPanelPage.orderDetailsElement, "1 szt - 60 kg"))); 
	}
	
	@Then("Click seller details button")
	public void click_seller_details_button() {
		click(UserPanelPage.sellerDetailsButton);
	}
	
	@Then("I check seller details")
	public void check_seller_details() {
		Assert.assertTrue(isDisplayed(getElementByXpathText(UserPanelPage.orderDetailsElement, "imię: Jarek"))); 
		Assert.assertTrue(isDisplayed(getElementByXpathText(UserPanelPage.orderDetailsElement, "e-mail: jarek@wp.pl"))); 
		Assert.assertTrue(isDisplayed(getElementByXpathText(UserPanelPage.orderDetailsElement, "kod pocztowy: 80-180"))); 
		Assert.assertTrue(isDisplayed(getElementByXpathText(UserPanelPage.orderDetailsElement, "miejscowość: Gdańsk"))); 
		Assert.assertTrue(isDisplayed(getElementByXpathText(UserPanelPage.orderDetailsElement, "ulica/nr domu: Kazimierza Wielkiego 17A/10"))); 
	}
}
