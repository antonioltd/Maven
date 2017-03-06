package com.expedia.baseclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.expedia.pages.Headers.HomeHeader.HomeHeaderPage;
import com.expedia.pages.Headers.HotelsHeader.HotelsHeaderPage;

public class PageBase {
	WebDriver driver;
	
	public PageBase(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//...............WebElements............................
	@FindBy(id="primary-header-home")
	public WebElement HomeHeader;
	
	@FindBy(id="primary-header-hotel")
	public WebElement HotelsHeader;
	
	@FindBy(id="primary-header-flight")
	public WebElement FlightsHeader;
	
	@FindBy(id="primary-header-package")
	public WebElement FlightPlusHotelHeader;
	
	@FindBy(id="primary-header-car")
	public WebElement CarHeader;
	
	@FindBy(id="primary-header-rail")
	public WebElement TrainsHeader;
	
	@FindBy(id="primary-header-lastminute")
	public WebElement LastMinuteHeader;
	
	@FindBy(id="primary-header-beach")
	public WebElement BeachHeader;
	
	@FindBy(id="primary-header-deals")
	public WebElement DealsHeader;
	
	@FindBy(id="primary-header-citybreaks")
	public WebElement CityBreaksHeader;
	
	@FindBy(id="primary-header-activity")
	public WebElement ThingsToDoHeader;
	
	@FindBy(id="primary-header-rewards")
	public WebElement RewardsHeader;
	
	@FindBy(id="primary-header-domestic")
	public WebElement UK_IrelandHeader;
	
	@FindBy(id="primary-header-cottages")
	public WebElement CottagesHeader;
		
	//..................end.....................
	
	//Actions

	
	
	
	//end
	
	
	//Navigation
	public HomeHeaderPage NavigateToHomeHeaderPage(){
		HomeHeader.click();
		return new HomeHeaderPage(driver);
		
	}
	
	public HotelsHeaderPage NavigateToHotelsHeader(){
		HotelsHeader.click();
		return new HotelsHeaderPage(driver);
	}
	
	//end
	
}
