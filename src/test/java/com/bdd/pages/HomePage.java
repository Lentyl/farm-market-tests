package com.bdd.pages;

import static com.bdd.utils.ReusableAndGlobalFunctionalities.*;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

	public static By productListItem = By.className("search__list-item-paragraph-element");	
	public static By emtyProductList = By.className("search__title");	
	public static By carouselRightButton = By.className("carousel-control-next");
	public static By carouselLeftButton = By.className("carousel-control-prev");
	
	public static String getCurrentHeaderCoureselText() throws InterruptedException {
		sleep(2500);
		return getText(By.cssSelector(".main-page__carusel-item.active"));
	}
}
