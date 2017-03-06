package com.expedia.pages.Headers.HomeHeader.NEW_Trains;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.expedia.pages.Headers.HomeHeader.HomeHeaderPage;

public class New_TrainsTabPage extends HomeHeaderPage {

	WebDriver driver;
	
	public New_TrainsTabPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	//.........................Webelements................
	@FindBy(xpath="//form[@id='gcw-rails-form-hp-rail']/fieldset[1]/label[1]")
	public WebElement OneWayButton;
	
	@FindBy(id="rail-origin-hp-rail")
	public WebElement GoingFromTextbox;
	
	@FindBy(id="rail-destination-hp-rail")
	public WebElement GoingToTextbox;
	
	@FindBy(id="rail-departing-single-hp-rail")
	public WebElement DepartingCalendar;
	
	@FindBy(id="departingTime-hp-rail")
	public WebElement DepartAtOrArriveBy;
	
	@FindBy(id="departureTime-hp-rail")
	public WebElement DepartingTime;
	
	@FindBy(id="rail-adults-hp-rail")
	public WebElement AdultsDropdown;
	
	@FindBy(id="childAges-hp-rail")
	public WebElement ChildrenDropdown;
	
	@FindBy(id="youthAges-hp-rail")
	public WebElement YouthDropdown;
	
	@FindBy(id="seniorAges-hp-rail")
	public WebElement SeniorDropdown;
	
	@FindBy(id="railcard-type-select-0-hp-rail")
	public WebElement Railcards;
	
	@FindBy(xpath="//form[@id='gcw-rails-form-hp-rail']/button")
	public WebElement SearchButton;
	
	
	
	
	
	//........................End.....................
}
