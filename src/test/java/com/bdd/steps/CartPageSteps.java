package com.bdd.steps;

import static com.bdd.pages.CartPage.*;
import static com.bdd.utils.ReusableAndGlobalFunctionalities.*;
import org.testng.Assert;
import io.cucumber.java.en.*;

public class CartPageSteps {
	
	@When("Add to cart one more item and delete")
	public void add_one_more_first_item_to_cart() {
		click(cartPageFirstItemAddButton);
		click(cartPageBinButtons);
	}
	
	@Then("User checks if item is added")
	public void user_checks_if_item_is_added() {
		Assert.assertEquals("x 1", getText(cartPageFirstItemQuantity));
	}
	
	@And("Deletes all items")
	public void deletes_all_items() {
		clickAllElements(cartPageBinButtons);
	}
	
	@Then("User checks that no item left")
	public void user_checks_that_no_item_left() {
		Assert.assertEquals("Twój koszyk jest pusty!", getText(cartPageEmptyCartHeader));
	}
	
	@Then("Checks if price have correct {string}")
	public void checks_if_price_have_correct_amount(String amount) {
		Assert.assertEquals("Łączna kwota: "+amount+" zł", getText(cartPagePriceCounter));
	}
	
	@And("Add first item")
	public void add_one_more_first_item() {
		click(cartPageFirstItemAddButton);
	}
	
	@And("Select the payment method")
	public void select_the_payment_method() {
		click(cartPageBlikRadioButton);
	}
	
	@And("Select the delivery method")
	public void select_the_delivery_method() {
		click(cartPageDeliveryManRadioButton);
	}
	
	@When("Press order button")
	public void press_order_button() throws InterruptedException {
		click(cartPageOrderButton);
	}
	
	@And("Fill in the recipients details with blank {string} field")
	public void fill_in_the_recipients_details_with_blank_field_name(String name) throws InterruptedException {
		fillInRecipientsDetails(name);
	}
	
	@Then("Checks if there is {string} warning sign")
	public void checks_if_there_is_warning_sign(String name) throws InterruptedException {
		errorMessageCheck(name);
	}
	
	@And("Clicks on x button of this worning sign")
	public void clicks_on_x_button_of_this_worning_sign() {
		click(cartPageDeliveryMethodXButtonWarningSign);
	}
	
	@Then("Checks name, house number, post code, town, email field")
	public void checks_name_house_number_post_code_town_email_field() {
		automaticFillingFieldsWithDataCheck();
	}
	
	@And("Fill in telephone input")
	public void fill_in_telephone_input() {
		sendKeys(cartPageTelephoneInput, "847362849");
	}
	@Then("Checks order confirmation text")
	public void check_order_confirmation_text() {
		Assert.assertEquals("zamówienie wysłane", getText(cartPageConfirmationOrderMessage));
	}

}
