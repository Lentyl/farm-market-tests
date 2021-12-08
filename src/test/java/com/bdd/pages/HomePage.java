package com.bdd.pages;

import static com.bdd.utils.ReusableAndGlobalFunctionalities.*;

import org.openqa.selenium.By;


public class HomePage {

	public static By HOME_PAGE_PRODUCT_LIST_ITEM = By.className("search__list-item-paragraph-element");	
	public static By HOME_PAGE_EMPTY_PRODUCT_LIST = By.className("search__title");	
	public static By HOME_PAGE_CAROUSEL_RIGHT_BUTTON = By.className("carousel-control-next");
	public static By HOME_PAGE_CAROUSEL_LEFT_BUTTON = By.className("carousel-control-prev");

	
	public static String getCurrentHeaderCoureselText() throws InterruptedException {
		Sleep(2500);
		return GetText(By.cssSelector(".main-page__carusel-item.active"));
	}
	
	
	
}
