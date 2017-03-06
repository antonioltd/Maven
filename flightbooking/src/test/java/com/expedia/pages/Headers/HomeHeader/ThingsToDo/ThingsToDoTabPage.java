package com.expedia.pages.Headers.HomeHeader.ThingsToDo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.expedia.pages.Headers.HomeHeader.HomeHeaderPage;

public class ThingsToDoTabPage extends HomeHeaderPage{

	WebDriver driver;
	
	public ThingsToDoTabPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	//..............Webelement....................
	@FindBy(id="activity-destination-hp-activity")
	public WebElement DestinationTextbox;
	
	@FindBy(id="activity-start-hp-activity")
	public WebElement FromCalendar;
	
	@FindBy(id="activity-end-hp-activity")
	public WebElement ToCalendar;
	
	@FindBy(xpath ="//form[@id='gcw-activities-form-hp-activity']/button")
	public WebElement SearchButton;
	
	//...............End................

}
