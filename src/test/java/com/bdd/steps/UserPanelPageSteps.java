package com.bdd.steps;

import io.cucumber.java.en.*;
import static com.bdd.utils.ReusableAndGlobalFunctionalities.*;
import org.testng.Assert;
import static com.bdd.pages.UserPanelPage.*;

public class UserPanelPageSteps {
	
	@Then("Checks user information fields")
	public void checks_user_information_fields() {
		checkUserInformationFields();
	}
	
	@When("Logged in {string} user goes to user panel")
	public void logged_in_user_goes_to_user_panel(String userStatus) {
		goToUserPanel(userStatus);
	}
	
	@Then("Check if business panel isnt displaying")
	public void check_if_business_panel_isnt_displaying() {
		Assert.assertFalse(isDisplayed(getElementByXpathText(userPanelUserDetailsField, "nazwa użytkownika")));
	}
	
	@And("Clicks on the pencil icon button")
	public void clicks_on_the_pencil_icon_button() {
		click(userPanelPagePencilIconButton);
	}
	
	@Then("Checks if edit panel is open")
	public void checks_if_edit_panel_is_open() {
		Assert.assertTrue(isDisplayed(userPanelPageConfirmButton)); 
	}
	
	@And("Changes town name on {string}")
	public void changes_town_name_on(String townName) {
		clear(userPanelPageTownInput);
		sendKeys(userPanelPageTownInput, townName); 
	}
	
	@And("Clicks on confirm button")
	public void clicks_on_confirm_button() {
		click(userPanelPageConfirmButton);
	}
	
	@Then("Checks town warning  message content")
	public void checks_town_warning_message_content() {
		Assert.assertEquals("Zmień wszystkie elementy adresu!", getText(userPanelPageWarningMessageHeading));
	}
	
	@Then("Checks email warning message content")
	public void checks_email_warning_message_content() {
		Assert.assertEquals("chcesz zmienić e-mail?", getText(userPanelPageWarningMessageHeading));
	}
	
	@And("Clicks x button in the warning message")
	public void clicks_x_button_in_the_warning_message() {
		click(userPanelPageWarningMessageXButton);
	}
	
	@And("Changes email")
	public void changes_email() {
		emailValueChange("ralf8@wp.pl"); 
	}
	
	@Then("Checks if orders arent present")
	public void checks_if_there_is_any_order() {
		Assert.assertEquals("Rafał nie masz żadnych zamówień.", getText(userPanelPageOrderHeader));
	}
	
	@Then("Checks if header is correct")
	public void checks_if_header_is_correct_and_order_is_present() {
		Assert.assertEquals("Rafał twoje wszystkie zamówienia", getText(userPanelPageOrderHeader));
	}
	
	@Then("Clicks order details link")
	public void clicks_order_details_link() {
		clickChosenListElement(userPanelOrderDetailsLink, 0);
	}
	
	@Then("User goes to order detail card and checks order details")
	public void user_goes_to_order_detail_card_and_checks_order_details() throws InterruptedException {
		orderDetailsCheck();
	}
	
	@Then("Clicks seller details button")
	public void clicks_seller_details_button() {
		click(userPanelSellerDetailsButton);
	}
	
	@Then("Checks seller details")
	public void checks_seller_details() {
		sellerDetailsCheck();
	}
}
