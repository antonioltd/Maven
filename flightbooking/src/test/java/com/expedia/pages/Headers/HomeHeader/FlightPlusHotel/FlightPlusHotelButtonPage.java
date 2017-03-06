package com.expedia.pages.Headers.HomeHeader.FlightPlusHotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightPlusHotelButtonPage extends FlightPlusHotelPlusCarButtonPage {
	
	WebDriver driver;
	
	public FlightPlusHotelButtonPage(WebDriver driver) {
		super(driver);
		this.driver =driver;
		
	}
	
	//..................Webelements...................
	@FindBy(id="package-advanced-options-hp-package")
	public WebElement AdvancedOptionsLink;
	
	@FindBy(id="package-advanced-preferred-class-hp-package")
	public WebElement PreferredClassDropdown;
	
	
	
	//..................End...........................
	
	
	//..................Actions...........................
	//..................End...........................
	
	
	//..................Navigations...........................
	//..................End...........................

}
