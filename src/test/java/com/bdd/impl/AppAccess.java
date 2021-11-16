package com.bdd.impl;
import static com.bdd.utils.WebDriverUtils.*;
import static com.bdd.variables.GlobalVariables.*;

public class AppAccess {
	
	public static void accessApp() {
		if(gdriver == null || gdriver.toString().contains("null")) {
			gdriver = getDriver();	
		}
		if(gwait == null || gwait.toString().contains("null")) {
			gwait = getWait();
		}	
		if(gjs == null || gjs.toString().contains("null")) {
			gjs = getJs();
		}
		
	}
	
	public static void openUrl() {
		gdriver.get("https://farm-market-app-74e39.web.app");
	}
}
