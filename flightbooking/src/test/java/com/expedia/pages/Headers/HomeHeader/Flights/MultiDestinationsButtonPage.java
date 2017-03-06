package com.expedia.pages.Headers.HomeHeader.Flights;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MultiDestinationsButtonPage extends ReturnButtonPage{

	WebDriver driver;
	
	public MultiDestinationsButtonPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	//.................Webelement...................

		
		@FindBy(id="flight-2-origin-hp-flight")
		public WebElement FlyingFromTextbox2;
		
		@FindBy(id="flight-2-destination-hp-flight")
		public WebElement FlyingToTextbox2;
		
		@FindBy(id="flight-2-departing-single-hp-flight")
		public WebElement DepartingCalendar2;
		
		
		@FindBy(id="flight-3-origin-hp-flight")
		public WebElement FlyingFromTextbox3;
		
		@FindBy(id="flight-3-destination-hp-flight")
		public WebElement FlyingToTextbox3;
		
		@FindBy(id="flight-3-departing-single-hp-flight")
		public WebElement DepartingCalendar3;
		
		
		@FindBy(id="flight-4-origin-hp-flight")
		public WebElement FlyingFromTextbox4;
		
		@FindBy(id="flight-4-destination-hp-flight")
		public WebElement FlyingToTextbox4;
		
		@FindBy(id="flight-4=departing-single-hp-flight")
		public WebElement DepartingCalendar4;
		
		
		@FindBy(id="flight-5-origin-hp-flight")
		public WebElement FlyingFromTextbox5;
		
		@FindBy(id="flight-5-destination-hp-flight")
		public WebElement FlyingToTextbox5;
		
		@FindBy(id="flight-5-departing-single-hp-flight")
		public WebElement DepartingCalendar5;
	//.........................End....................
		


}
