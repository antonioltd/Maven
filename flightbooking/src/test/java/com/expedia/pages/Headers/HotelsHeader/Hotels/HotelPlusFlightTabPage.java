package com.expedia.pages.Headers.HotelsHeader.Hotels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelPlusFlightTabPage extends HotelPlusFlightPlusCarTabPage {
	
	WebDriver driver;
	public HotelPlusFlightTabPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	//.................Webelement.......................
	@FindBy(id="package-advanced-options-hlp-fh")
	public WebElement AdvancedOptionsLink;
	//................End...............................
	
	//.................Navigations.......................
	public AdvancedOptionsPage NavigatetoAdvancedOptionsPage(){
		AdvancedOptionsLink.click();
		return new AdvancedOptionsPage(driver);
	}
	//................End...............................

}
