package com.bdd.utils;
import static com.bdd.utils.GlobalSelectors.*;
import static com.bdd.variables.GlobalVariables.*;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ReusableFunctionalities {

	
	public static void Click(By el) {
		gdriver.findElement(el).click();	
	}
	
	public static void SendKeys(By el, String text) {
		gdriver.findElement(el).sendKeys(text);
	}
	
	public static String GetText(By el) {
		return gwait.until(ExpectedConditions.visibilityOfElementLocated(el)).getText();
	}
	
	public static void headerAutocomplitChoyce() {
		Click(HEADER_AUTOCOMPLET_ELEMENT);
		Click(HEADER_SEARCH_BTN);
	}
	

}
