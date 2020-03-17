package com.w2a.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightsSearchResultPageLocator {
	
	@FindBy (xpath = "//div[@id='advanced-options-container']//p/span[@class='secondary-playback-summary']")
	public WebElement selectionSummary;

}
