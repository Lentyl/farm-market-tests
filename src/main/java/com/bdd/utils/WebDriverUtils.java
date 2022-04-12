package com.bdd.utils;

import static com.bdd.variables.GlobalVariables.gdriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtils {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static JavascriptExecutor js;

	public static WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}
	
	public static WebDriverWait getWait() {
		wait = new WebDriverWait(driver, 20);
		return wait;
	}
	
	public static JavascriptExecutor getJs() {
		 JavascriptExecutor js = (JavascriptExecutor) gdriver;
		 return js;
	}
	
	public static Actions getActions() {
		 Actions act = new Actions(driver);
		 return act;
	}
	
	
	
	
}
