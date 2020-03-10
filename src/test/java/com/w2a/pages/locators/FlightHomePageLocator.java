package com.w2a.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightHomePageLocator {

	@FindBy(id = "tab-flight-tab-hp")
	public WebElement tabFlights;

	// locator for flight booking
	@FindBy(id = "flight-origin-hp-flight")
	public WebElement flightFrom;
	@FindBy(id = "flight-destination-hp-flight")
	public WebElement flightDestination;
	@FindBy(id = "flight-departing-hp-flight")
	public WebElement departDate;
	@FindBy(id = "flight-returning-hp-flight")
	public WebElement returnDate;
	
	/* travellers locators */
	@FindBy(id = "traveler-selector-hp-flight")
	public WebElement travellers;
	
	/* adults locator */
	@FindBy (xpath = "//div[@id='traveler-selector-hp-flight']/div/ul/li/div/div/div/div[1]")
	public WebElement adultsLevel;

	//minusIcon
	@FindBy (xpath = "//div[@id='traveler-selector-hp-flight']/div/ul/li/div/div/div/div[1]/div[2]")
	public WebElement adultsMinusIcon;
	
	//adultsSelectedValue
	@FindBy (xpath = "//div[@id='traveler-selector-hp-flight']/div/ul/li/div/div/div/div[1]/div[3]")
	public WebElement adultsSelectedValue;
	
	//plusIcon
	@FindBy (xpath = "//div[@id='traveler-selector-hp-flight']/div/ul/li/div/div/div/div[1]/div[4]")
	public WebElement adultsPlusIcon;	
	/* adults locator end */
	
	/* children locator */
	@FindBy (xpath = "//div[@id='traveler-selector-hp-flight']/div/ul/li/div/div/div/div[@class='children-wrapper']")
	public WebElement childrenLevel;
	
	@FindBy (xpath = "//div[@id='traveler-selector-hp-flight']/div/ul/li/div/div/div/div[2]/div/div[2]")
	public WebElement childrenMinusIcon;
	
	@FindBy (xpath = "//div[@id='traveler-selector-hp-flight']/div/ul/li/div/div/div/div[2]/div/div[3]")
	public WebElement childrenSelectedValue;
	
	@FindBy (xpath = "//div[@id='traveler-selector-hp-flight']/div/ul/li/div/div/div/div[2]/div/div[4]")
	public WebElement childrenPlusIcon;
	
	/* child age */
	@FindBy (id = "flight-age-select-1-hp-flight")
	public WebElement chidAge1;
	
	@FindBy (id = "flight-age-select-2-hp-flight")
	public WebElement chidAge2;
	
	@FindBy (id = "flight-age-select-3-hp-flight")
	public WebElement chidAge3;
	
	@FindBy (id = "flight-age-select-4-hp-flight")
	public WebElement chidAge4;
	
	@FindBy (id = "flight-age-select-5-hp-flight")
	public WebElement chidAge5;
	
	@FindBy (id = "flight-age-select-6-hp-flight")
	public WebElement chidAge6;
	/* child age ends*/
	/* children locator end*/
	
	/* Infants locator */	
	@FindBy (xpath = "//div[@id='traveler-selector-hp-flight']/div/ul/li/div/div/div/div[@class='infants-wrapper']")
	public WebElement infantsLevel;
	
	@FindBy (xpath = "//div[@id='traveler-selector-hp-flight']/div/ul/li/div/div/div/div[3]/div/div[2]")
	public WebElement infantsMinusIcon;
	
	@FindBy (xpath = "//div[@id='traveler-selector-hp-flight']/div/ul/li/div/div/div/div[3]/div/div[3]")
	public WebElement infantsSelectedValue;
	
	@FindBy (xpath = "//div[@id='traveler-selector-hp-flight']/div/ul/li/div/div/div/div[3]/div/div[4]")
	public WebElement infantsPlusIcon;

	/* Infants Age locator */
	@FindBy (xpath = "//div[@id='traveler-selector-hp-flight']//div[@class='infants-wrapper']/div[2]/label[1]/select")
	public WebElement infantAge1;
	
	@FindBy (xpath = "//div[@id='traveler-selector-hp-flight']//div[@class='infants-wrapper']/div[2]/label[2]/select")
	public WebElement infantAge2;
	
	@FindBy (xpath = "//div[@id='traveler-selector-hp-flight']//div[@class='infants-wrapper']/div[2]/label[3]/select")
	public WebElement infantAge3;
	
	@FindBy (xpath = "//div[@id='traveler-selector-hp-flight']//div[@class='infants-wrapper']/div[2]/label[4]/select")
	public WebElement infantAge4;
	
	@FindBy (xpath = "//div[@id='traveler-selector-hp-flight']//div[@class='infants-wrapper']/div[2]/label[5]/select")
	public WebElement infantAge5;
	
	@FindBy (xpath = "//div[@id='traveler-selector-hp-flight']//div[@class='infants-wrapper']/div[2]/label[6]/select")
	public WebElement infantAge6;	
	/* Infants Age locator end*/
	/* Infants locator end*/
	
	
	/* travellers locators end*/
	
	@FindBy(className = "search-btn-col")
	public WebElement searchButton;

	// error header
	@FindBy(css = "h5.alert-title.no-outline")
	public WebElement alertTitle;

	// error destination
	@FindBy(css = "ul.validation-alert-list > li:nth-child(1) > a")
	public WebElement errorDestination;

	// error departDate
	@FindBy(css = "ul.validation-alert-list > li:nth-child(2) > a")
	public WebElement errorDepartDate;
	
	// error returnDate
	@FindBy(css = "ul.validation-alert-list > li:nth-child(3) > a")
	public WebElement errorReturnDate;
	
}
