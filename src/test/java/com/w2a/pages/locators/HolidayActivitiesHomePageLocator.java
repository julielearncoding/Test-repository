package com.w2a.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HolidayActivitiesHomePageLocator extends MainPageLocator {

	@FindBy (id = "activity-destination-hp-activity")
	public WebElement destination;

	@FindBy (id = "activity-start-hp-activity")
	public WebElement from;

	@FindBy (id = "activity-end-hp-activity")
	public WebElement to;

	@FindBy (id = "gcw-activities-form-hp-activity")
	public WebElement holidayActivitiesForm;


}
