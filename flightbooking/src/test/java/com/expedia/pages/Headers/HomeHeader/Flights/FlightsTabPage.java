package com.expedia.pages.Headers.HomeHeader.Flights;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.expedia.pages.Headers.HomeHeader.HomeHeaderPage;

public class FlightsTabPage extends HomeHeaderPage{
	
		WebDriver driver;
		
	public FlightsTabPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	//.................Webelements...................
	@FindBy(id="flight-type-roundtrip-label-hp-flight")
	public WebElement ReturnButton;
	
	@FindBy(id="flight-type-one-way-label-hp-flight")
	public WebElement OneWayButton;
	
	@FindBy(id="flight-type-multi-dest-label-hp-flight")
	public WebElement MultiDestButton;
	
	@FindBy(id="flight-origin-hp-flight")
	public WebElement FlyingFromTextbox;
	
	@FindBy(id="flight-destination-hp-flight")
	public WebElement FlyingToTextbox;
	
	@FindBy(id="flight-departing-hp-flight")
	public WebElement DepartingCalendar;
	
	@FindBy(id="flight-adults-hp-flight")
	public WebElement AdultsDropdown;
	
	@FindBy(id="flight-children-hp-flight")
	public WebElement ChildrenDropdown;
	
	@FindBy(id="flight-advanced-options-hp-flight")
	public WebElement AdvancedOptionsLink;
	
	@FindBy(xpath="//form[@id='gcw-flights-form-hp-flight']/div[7]/label/button")
	public WebElement SearchButton;
	
	//.................End..........................
	
	
	//.................Actions.......................
	
	
	
	
	//.................End..........................
	
	
	//.................Navigations...................
	public ReturnButtonPage NavigateToReturnButtonPage(){
		ReturnButton.click();
		return new ReturnButtonPage(driver);
	}
	
	public OneWayButtonPage NavigateToOneWayButtonPage(){
		OneWayButton.click();
		return new OneWayButtonPage(driver);
	}
	
	public MultiDestinationsButtonPage NavigateToMultiDestinationsButtonPage(){
		MultiDestButton.click();
		return new MultiDestinationsButtonPage(driver);
	}
	
	public AdvancedOptionsPage NavigateToAdvancedOptionsPage(){
		AdvancedOptionsLink.click();
		return new AdvancedOptionsPage(driver);
	}

	//.................End..........................

	
}
