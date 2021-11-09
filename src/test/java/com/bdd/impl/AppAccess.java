package com.bdd.impl;
import static com.bdd.utils.WebDriverUtils.getDriver;
import static com.bdd.variables.GlobalVariables.*;

public class AppAccess {
	
	public static void accessApp() {
		if(gdriver == null || gdriver.toString().contains("null")) {
			gdriver = getDriver();
		}
	}
	
	public static void openUrl() {
		gdriver.get("https://farm-market-app-74e39.web.app");
	}

}
