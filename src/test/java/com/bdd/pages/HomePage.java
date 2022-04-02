package com.bdd.pages;

import static com.bdd.utils.ReusableAndGlobalFunctionalities.*;

import org.openqa.selenium.By;


public class HomePage {

	public static By homePageProductListItem = By.className("search__list-item-paragraph-element");	
	public static By homePageEmtyProductList = By.className("search__title");	
	public static By homePageCarouselRightButton = By.className("carousel-control-next");
	public static By homePageCarouselLeftButton = By.className("carousel-control-prev");

	
	public static String getCurrentHeaderCoureselText() throws InterruptedException {
		sleep(2500);
		return getText(By.cssSelector(".main-page__carusel-item.active"));
	}
	
	
	
}
