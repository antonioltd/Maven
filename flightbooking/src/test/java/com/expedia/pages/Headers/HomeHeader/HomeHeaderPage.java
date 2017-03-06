package com.expedia.pages.Headers.HomeHeader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.expedia.baseclasses.PageBase;
import com.expedia.helper.GenericMethod;
import com.expedia.pages.Headers.HomeHeader.Cars.CarsTabPage;
import com.expedia.pages.Headers.HomeHeader.FlightPlusHotel.FlightPlusHotelTabPage;
import com.expedia.pages.Headers.HomeHeader.Flights.FlightsTabPage;
import com.expedia.pages.Headers.HomeHeader.Hotels.HotelsTabPage;
import com.expedia.pages.Headers.HomeHeader.NEW_Trains.New_TrainsTabPage;
import com.expedia.pages.Headers.HomeHeader.SearchAnything.SearchAnythingPage;
import com.expedia.pages.Headers.HomeHeader.ThingsToDo.ThingsToDoTabPage;

import junit.framework.Assert;

public class HomeHeaderPage extends PageBase{
	WebDriver driver;
	public HomeHeaderPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	//...........WebElements...........................
	@FindBy(id="tab-flight-tab-hp")
	public WebElement FlightsTab;
	
	@FindBy(id="tab-hotel-tab-hp")
	public WebElement HotelsTab;
	
	@FindBy(id="tab-package-tab-hp")
	public WebElement FlightPlusHotelTab;
	
	@FindBy(id="tab-car-tab-hp")
	public WebElement CarsTab;
	
	@FindBy(id="tab-activity-tab-hp")
	public WebElement ThingsToDoTab;
	
	@FindBy(id="tab-rail-tab-hp")
	public WebElement New_TrainsTab;
	
	@FindBy(id="tab-openSearch-tab-hp")
	public WebElement SearchAnythingTab;
	
	
	//...........End..................................

	public FlightsTabPage NavigateToFlightTabPage(){
		if (!FlightsTab.isDisplayed()) {
			GenericMethod.FluentWait(driver, FlightsTab);
		}
		
		FlightsTab.click();
		return new FlightsTabPage(driver);
	}
	
	public  HotelsTabPage NavigateToHotelsTabPage(){
		HotelsTab.click();
		return new HotelsTabPage(driver);
	}
	
	public FlightPlusHotelTabPage NavigateToFlightPlusHotelTabPage(){
		FlightPlusHotelTab.click();
		return new FlightPlusHotelTabPage(driver);
	}
	
	public CarsTabPage NavigateToCarsTabPage(){
		CarsTab.click();
		return new CarsTabPage(driver);
	}
	
	public ThingsToDoTabPage NavigateToThingsToDoPage(){
		ThingsToDoTab.click();
		return new ThingsToDoTabPage(driver);
	}
	
	public New_TrainsTabPage NavigateToNew_TrainsTabPage(){
		New_TrainsTab.click();
		return new New_TrainsTabPage(driver);
	}
	
	public SearchAnythingPage NavigateToSearchAnything(){
		SearchAnythingTab.click();
		return new SearchAnythingPage(driver);
	}
	
}
