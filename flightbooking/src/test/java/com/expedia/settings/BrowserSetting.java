package com.expedia.settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserSetting {

	public static  WebDriver InitBrowser(BrowserType browser) {
		WebDriver driver = null;
		switch (browser) {
		case Chrome:
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\tanto\\Desktop\\GitHub\\JARS\\geckodriver.exee");
			driver = new ChromeDriver();
			break;
		case Firefox:
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\tanto\\Desktop\\GitHub\\JARS\\chromedriver.exe");
			driver = new ChromeDriver();
			break;

		case IExplore:

			break;
		case HeadLess:
			
			break;

		default:
			break;
		}
		return driver;
	}
}
