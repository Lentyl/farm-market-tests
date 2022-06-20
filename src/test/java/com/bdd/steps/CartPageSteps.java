package com.bdd.steps;

import static com.bdd.pages.CartPage.*;
import static com.bdd.utils.ReusableAndGlobalFunctionalities.*;
import org.testng.Assert;
import io.cucumber.java.en.*;

public class CartPageSteps {
	
	@And("I add to cart one more item and delete")
	public void add_to_cart_one_more_item_and_delete() {
		click(cartPageFirstItemAddButton);
		click(cartPageBinButtons);
	}
	
	@Then("I check if item is added")
	public void checks_if_item_is_added() {
		Assert.assertEquals("x 1", getText(cartPageFirstItemQuantity));
	}
	
	@And("I delete all items")
	public void deletes_all_items() {
		clickAllElements(cartPageBinButtons);
	}
	
	@Then("I check that no item left")
	public void user_checks_that_no_item_left() {
		Assert.assertEquals("Twój koszyk jest pusty!", getText(cartPageEmptyCartHeader));
	}
	
	@Then("Check if price have correct {string}")
	public void checks_if_price_have_correct_amount(String amount) {
		Assert.assertEquals("Łączna kwota: "+amount+" zł", getText(cartPagePriceCounter));
	}
	
	@And("I add first item")
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
	public void press_order_button() {
		click(cartPageOrderButton);
	}
	
	@And("Fill in the recipients details with blank {string} field")
	public void fill_in_the_recipients_details_with_blank_field_name(String name) throws InterruptedException {
		fillInRecipientsDetails(name);
	}
	
	@Then("Check if there is {string} warning sign")
	public void checks_if_there_is_warning_sign(String name) throws InterruptedException {
		Assert.assertTrue(errorMessageCheck(name));
	}
	
	@And("Click x button of this worning sign")
	public void clicks_on_x_button_of_this_worning_sign() {
		click(cartPageDeliveryMethodWarningSignXButton);
	}
	
	@Then("Check name, house number, post code, town, email field")
	public void checks_name_house_number_post_code_town_email_field() {
		Assert.assertEquals( "Rafał", getAttribute(cartPageNameInput,"value"));
		Assert.assertEquals("Kazimierza Wielkiego 17A/10", getAttribute(cartPageStreetInInput,"value"));
		Assert.assertEquals("09-100", getAttribute(cartPagePostCodeInput,"value"));
		Assert.assertEquals("Płońsk", getAttribute(cartPageTownInput,"value"));
		Assert.assertEquals("ralf88@wp.pl", getAttribute(cartPageEmailInput,"value"));
	}
	
	@And("Fill in telephone input")
	public void fill_in_telephone_input() {
		sendKeys(cartPageTelephoneInput, "847362849");
	}
}
