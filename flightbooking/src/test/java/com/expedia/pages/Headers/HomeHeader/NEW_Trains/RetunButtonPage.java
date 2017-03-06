package com.expedia.pages.Headers.HomeHeader.NEW_Trains;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RetunButtonPage extends New_TrainsTabPage {

	WebDriver driver;
	
	public RetunButtonPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	//..................Webelements............
	@FindBy(id="rail-returning-single-hp-rail")
	public WebElement ReturningCalendar;
	
	@FindBy(id="arrivingTime-hp-rail")
	public WebElement DepartAtOrArriveBy;
	
	@FindBy(id="returningTime-hp-rail")
	public WebElement ReturningTime;
	
	//............................End.............

}
