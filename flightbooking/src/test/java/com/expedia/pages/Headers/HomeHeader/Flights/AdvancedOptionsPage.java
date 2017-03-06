package com.expedia.pages.Headers.HomeHeader.Flights;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdvancedOptionsPage extends MultiDestinationsButtonPage {

	WebDriver driver;
	
	public AdvancedOptionsPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
//........................Webelements..............

	
	@FindBy(id="advanced-flight-nonstop-label-hp-flight")
	public WebElement DirectCheckbox;
	
	@FindBy(id="advanced-flight-refundable-label-hp-flight")
	public WebElement RefundableCheckbox;	
	
	@FindBy(id="flight-advanced-preferred-airline-hp-flight")
	public WebElement PreferredAirlineDropdown;
	
	@FindBy(id="flight-advanced-preferred-class-hp-flight")
	public WebElement PreferredClassDropdown;
	
//.........................End....................

}
