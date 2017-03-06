package com.expedia.pages.Headers.HotelsHeader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.expedia.baseclasses.PageBase;
import com.expedia.pages.Headers.HotelsHeader.Hotels.HotelOnlyTabPage;
import com.expedia.pages.Headers.HotelsHeader.Hotels.HotelPlusFlightPlusCarTabPage;
import com.expedia.pages.Headers.HotelsHeader.Hotels.HotelPlusFlightTabPage;

public class HotelsHeaderPage extends PageBase {
	WebDriver driver;

	public HotelsHeaderPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	//..................Webelement............
	@FindBy(id="tab-hotel-tab-hlp")
	public WebElement HotelOnlyTab;
	
	@FindBy(id="tab-hotelFlight-tab-hlp-fh")
	public WebElement HotelPlusFlightTab;
	
	@FindBy(id="tab-hotelFlightCar-tab-hlp-fhc")
	public WebElement HotelPlusFlightPlusCarTab;
	//..................End............
	
	//..................Navigations............
	public HotelOnlyTabPage NavigateToHotelOnlyTabPage(){
		HotelOnlyTab.click();
		return new HotelOnlyTabPage(driver);
	}
	
	public HotelPlusFlightTabPage NavigateToHotelPlusFlightTabPage(){
		HotelPlusFlightTab.click();
		return new HotelPlusFlightTabPage(driver);
	}
	
	public HotelPlusFlightPlusCarTabPage NavigateToHotelPlusFlightPlusCarTabPage(){
		HotelPlusFlightPlusCarTab.click();
		return new HotelPlusFlightPlusCarTabPage(driver);
	}


	
	//..................End............
}
