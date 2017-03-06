package com.expedia.pages.Headers.HomeHeader.Hotels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.expedia.pages.Headers.HomeHeader.HomeHeaderPage;

public class HotelsTabPage extends HomeHeaderPage {
	
	WebDriver driver;
	
	public HotelsTabPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	//............Webelements..................
	@FindBy(id="hotel-destination-hp-hotel")
	public WebElement GoingToTextbox;	
	
	@FindBy(id="hotel-checkin-hp-hotel")
	public WebElement CheckInCalendar;

	@FindBy(id="hotel-checkout-hp-hotel")
	public WebElement CheckIOutCalendar;
	
	@FindBy(id="hotel-rooms-hp-hotel")
	public WebElement RoomsDropdown;
	
	@FindBy(id="hotel-1-adults-hp-hotel")
	public WebElement AdultsDropdown;
	
	@FindBy(id="hotel-1-children-hp-hotel")
	public WebElement ChildrenDropdown;
	
	@FindBy(xpath="//form[@id='gcw-hotel-form-hp-hotel']/div[4]/label")
	public WebElement AddAFlightCheckbox;
	
	@FindBy(xpath="//form[@id='gcw-hotel-form-hp-hotel']/div[7]/label/button")
	public WebElement SearchButton;
	
	
	
	
	//..............End.....................
	
	//...............Actions..................
	//..............End......................
	
	//................Navigations.......................
	//.................End.....................

}
