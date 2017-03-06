package com.expedia.pages.Headers.HomeHeader.Flights;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReturnButtonPage extends OneWayButtonPage {
	
	WebDriver driver;
	
	public ReturnButtonPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	
	//.....................Webelement.....................
	@FindBy(id="flight-returning-hp-flight")
	public WebElement ReturningCalendar;
	
	@FindBy(xpath="//form[@id='gcw-flights-form-hp-flight']/div[5]/label[1]")
	public WebElement AddAHotelCheckbox;
	
	@FindBy(xpath="//form[@id='gcw-flights-form-hp-flight']/div[5]/label[2]")
	public WebElement AddACarCheckbox;
	//.....................End............................
		
	//.....................Action.........................
	//.....................End............................


	//.....................Navigation.....................
	//.....................End............................


}
