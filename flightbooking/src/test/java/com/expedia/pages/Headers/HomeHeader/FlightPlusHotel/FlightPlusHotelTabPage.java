package com.expedia.pages.Headers.HomeHeader.FlightPlusHotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.expedia.pages.Headers.HomeHeader.HomeHeaderPage;

public class FlightPlusHotelTabPage extends HomeHeaderPage {
	
	WebDriver driver;
	
	public FlightPlusHotelTabPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		
	}
	
	//................Webelements........................
	@FindBy(xpath="//label[@for='fh-fh-hp-package']")
	public WebElement FlightPlusHotelButton;
	
	@FindBy(xpath="//label[@for='fhc-fhc-hp-package']")
	public WebElement FlightPlusHotelPlusCarButton;
	
	@FindBy(xpath="//label[@for='fc-fc-hp-package']")
	public WebElement FlightPlusCarButton;
	
	@FindBy(id="package-origin-hp-package")
	public WebElement FlyingFromTextbox;
	
	@FindBy(id="package-destination-hp-package")
	public WebElement FlyingToTextbox;
	
	@FindBy(id="package-departing-hp-package")
	public WebElement DepartingCalendar;
	
	@FindBy(id="package-returning-hp-package")
	public WebElement ReturningCalendar;

	@FindBy(id="package-adults-hp-package")
	public WebElement AdultDropdown;
	
	@FindBy(id="package-children-hp-package")
	public WebElement ChildrenDropdown;	
	
	@FindBy(xpath="//form[@id='gcw-packages-form-hp-package']/div[11]/label/button")
	public WebElement SearchButton;
	
	//................End...............................
	
	//................Actions........................
	//................End...............................
	
	//................Navigations........................
	public FlightPlusHotelButtonPage NavigateToFlightPlusHotelButtonPage(){
		FlightPlusHotelButton.click();
		return new FlightPlusHotelButtonPage(driver);
	}
	
	public FlightPlusHotelPlusCarButtonPage NavigateToFlightPlusHotelPlusCarButtonPage(){
		FlightPlusHotelPlusCarButton.click();
		return new FlightPlusHotelPlusCarButtonPage(driver);
	}
	
	public FlightPlusCarButtonPage NavigateToFlightPlusCarPage(){
		FlightPlusCarButton.click();
		return new FlightPlusCarButtonPage(driver);
	}
	
	//................End...............................

}
