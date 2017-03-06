package com.expedia.pages.Headers.HotelsHeader.Hotels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdvancedOptionsPage extends HotelPlusFlightTabPage {

	WebDriver driver;
	public AdvancedOptionsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	//..................Webelements.............
	@FindBy(id="package-advanced-preferred-class-hlp-fh")
	public WebElement PreferredClassDropdown;
	
	@FindBy(xpath="//form[@id='gcw-packages-form-hlp-fh']/div[7]/label/button")
	public WebElement SearchButton;
	//.................End.....................

}
