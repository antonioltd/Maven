package com.expedia.pages.Headers.HotelsHeader.Hotels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.expedia.pages.Headers.HotelsHeader.HotelsHeaderPage;

public class HotelPlusFlightPlusCarTabPage extends HotelsHeaderPage {
	
	WebDriver driver;
	public HotelPlusFlightPlusCarTabPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	//...............Webelements........
	@FindBy(id="package-origin-hlp-fhc")
	public WebElement FlyingFrom;
	
	@FindBy(id="package-departing-hlp-fhc")
	public WebElement DepartingCalendaar;
	
	@FindBy(id="package-returning-hlp-fhc")
	public WebElement ReturningCalendar;
	
	@FindBy(id="package-rooms-hlp-fhc")
	public WebElement RoomsDropdown;
	
	@FindBy(id="package-1-adults-hlp-fhc")
	public WebElement AdultsDropdown;
		
	@FindBy(id="package-1-children-hlp-fhc")
	public WebElement ChildrenDropdown;
	
	@FindBy(xpath="//form[@id=gcw-packages-form-hlp-fhc']/div[3]/div[5]/div/label")
	public WebElement IOnlyNeedAHotelForPartOfMyStayLink;
	
	
	@FindBy(xpath="//form[@id='gcw-packages-form-hlp-fhc']/div[6]/label/button")
	public WebElement SearchButton;
	

	
	//................End..............
}
