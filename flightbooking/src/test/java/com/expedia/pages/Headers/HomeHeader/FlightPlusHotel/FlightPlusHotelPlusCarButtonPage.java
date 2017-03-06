package com.expedia.pages.Headers.HomeHeader.FlightPlusHotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightPlusHotelPlusCarButtonPage extends FlightPlusHotelTabPage {

		WebDriver driver;
	
	public FlightPlusHotelPlusCarButtonPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	
	//..................Webelements...................
	@FindBy(id="package-rooms-hp-package")
	public WebElement RoomsDropdown;
	
	@FindBy(xpath="//form[@id='gcw-packages-form-hp-package']/div[7]/div[5]/div/label")
	public WebElement IOnlyNeedAHotelForPartOfMyStay;
	
	
	
	
	//..................End...........................
	
	
	//..................Actions...........................
	
	//..................End...........................
	
	
	//..................Navigations...........................
	
	//..................End...........................
}
