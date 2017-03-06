package com.expedia.pages.Headers.HotelsHeader.Hotels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.expedia.pages.Headers.HotelsHeader.HotelsHeaderPage;

public class HotelOnlyTabPage extends HotelsHeaderPage{

	WebDriver driver;
	public HotelOnlyTabPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
//..................Webelements...........
	@FindBy(id="hotel-destination-hlp")
	public WebElement GoingToTextBox;
	
	
	@FindBy(id="hotel-checkin-hlp")
	public WebElement CheckInCalendar;
	
	@FindBy(id="hotel-checkout-hlp")
	public WebElement CheckOutCalendar;
	
	@FindBy(id="hotel-rooms-hlp")
	public WebElement RoomsDropdown;
	
	@FindBy(id="hotel-1-adults-hlp")
	public WebElement AdultsDropdown;
	
	@FindBy(id="hotel-1-children-hlp")
	public WebElement ChildrenDropdown;
	
	@FindBy(xpath="//form[@id='gcw-hotel-form-hlp']/div[4]/label")
	public WebElement AddAFlightCheckbox;
	
	@FindBy(xpath=".//*[@id='gcw-hotel-form-hlp']/div[7]/label/button")
	public WebElement SearchButton;
	
	
	
//........................End..................
}
