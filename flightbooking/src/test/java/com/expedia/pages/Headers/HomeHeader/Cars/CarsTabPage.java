package com.expedia.pages.Headers.HomeHeader.Cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.expedia.pages.Headers.HomeHeader.HomeHeaderPage;

public class CarsTabPage extends HomeHeaderPage {

	WebDriver driver;
	
	public CarsTabPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	//..................Webelements...................
	
	@FindBy(id="car-pickup-hp-car")
	public WebElement PickUpTextbox;
	
	@FindBy(id="car-dropoff-hp-car")
	public WebElement DropOffTextbox;	
	
	@FindBy(id="car-pickup-date-hp-car")
	public WebElement PickUpDateCalendar;
	
	@FindBy(id="car-pickup-time-hp-car")
	public WebElement PickUpTimeCalendar;
	
	@FindBy(id="car-dropoff-date-hp-car")
	public WebElement DropOffDateCalendar;

	
	@FindBy(id="car-dropoff-date-hp-car")
	public WebElement DropOffTimeCalendar;
	
	@FindBy(xpath="//form[@id='gcw-cars-form-hp-car']/fieldset/label")
	public WebElement DriverAgedBetween25To70;
	
	
	@FindBy(id="package-advanced-options-hp-package")
	public WebElement AdvancedOptionsLink;
	
	@FindBy(id="package-advanced-preferred-class-hp-package")
	public WebElement PreferredClassDropdown;
	
	@FindBy(xpath="//form[@id='gcw-packages-form-hp-package']/div[11]/label/button")
	public WebElement SearchButton;
	
	
	//..................End...........................
	
	
	//..................Actions...........................
	//..................End...........................
	
	
	//..................Navigations...........................
	//..................End...........................
}
