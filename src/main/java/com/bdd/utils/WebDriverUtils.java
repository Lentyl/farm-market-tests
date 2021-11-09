package com.bdd.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtils {
	
	public static WebDriver driver;
	public static WebDriverWait wait;

	public static WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}
	
	public static WebDriverWait getWait() {
		wait = new WebDriverWait(driver, 20);
		return wait;
	}
	
	
	
	
}
