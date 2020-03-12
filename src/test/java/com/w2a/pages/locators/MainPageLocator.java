package com.w2a.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPageLocator {
	
	//Menu locators
	@FindBy (id = "primary-header-hotel")
	public WebElement hotelsTopNav;
	
	@FindBy (id = "tab-hotel-tab-hp")
	public WebElement hotelsTabBtn;
	
	@FindBy (id = "primary-header-flight")
	public WebElement flightsTopNav;
	
	@FindBy (id = "tab-flight-tab-hp")
	public WebElement flightsTabBtn;
	
	@FindBy (id = "primary-header-package")
	public WebElement flightsHotelsTopNav;
	
	@FindBy (id = "tab-package-tab-hp")
	public WebElement flightsHotelsTabBtn;
	
	@FindBy (id = "primary-header-car")
	public WebElement carHireTopNav;
	
	@FindBy (id = "tab-car-tab-hp")
	public WebElement carHireTabBtn;
	
	@FindBy (id = "primary-header-activity")
	public WebElement activitiesTopNav;
	
	@FindBy (id = "tab-activity-tab-hp")
	public WebElement activitiesTabBtn;
	

}
