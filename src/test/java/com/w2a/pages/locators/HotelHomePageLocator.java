package com.w2a.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelHomePageLocator {

	@FindBy(id = "hotel-destination-hp-hotel")
	public WebElement destination;

	@FindBy(id = "hotel-checkin-hp-hotel")
	public WebElement checkIn;

	@FindBy(id = "hotel-checkout-hp-hotel")
	public WebElement checkOut;

	/* travellers locators */
	@FindBy(xpath = "//div[@id='traveler-selector-hp-hotel']/div/ul/li/button[1]")
	public WebElement travellers;
	
	@FindBy (xpath = "//div[@class='traveler-selector-room-data']/div[2]/div[2]")
	public WebElement adultsMinusIcon;
	
	@FindBy (xpath = "//div[@class='traveler-selector-room-data']/div[2]/div[3]")
	public WebElement adultsNoValue;
	
	@FindBy (xpath = "//div[@class='traveler-selector-room-data']/div[2]/div[4]")
	public WebElement adultsPlusIcon;
	
	@FindBy (xpath = "//div[@class='traveler-selector-room-data']/div[3]/div[2]")
	public WebElement childrenMinusIcon;

	@FindBy (xpath = "//div[@class='traveler-selector-room-data']/div[3]/div[3]")
	public WebElement childrenNoValue;

	@FindBy (xpath = "//div[@class='traveler-selector-room-data']/div[3]/div/div[4]")
	public WebElement childrenPlusIcon;

	
	@FindBy (xpath = "//li[@class='open']//a[text()='Add another room']")
	public WebElement addMoreRoom;
	
	

	/* travellers locators end */

	@FindBy (xpath ="//button[@class='btn-primary btn-action  gcw-submit']")
	public WebElement searchButton;
	
	@FindBy (id = "gcw-hotel-form-hp-hotel")
	public WebElement hotelSearchForm;

}
