package com.expedia.pages.Headers.HomeHeader.SearchAnything;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.expedia.pages.Headers.HomeHeader.HomeHeaderPage;

public class SearchAnythingPage extends HomeHeaderPage{
	WebDriver driver;
	
	public SearchAnythingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
//...............Webelements..............
	@FindBy(id="openSearch-searchQuery-hp-searchAnything")
	public WebElement WhatAreYouLookingForTextbox;
	
	@FindBy(xpath="//form[@id='gcw-search-anything-form-hp-searchAnything']/button")
	public WebElement SearchButton;
//.................End..............
}
