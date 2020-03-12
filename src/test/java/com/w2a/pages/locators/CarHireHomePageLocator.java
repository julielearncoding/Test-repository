package com.w2a.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarHireHomePageLocator extends MainPageLocator{

	@FindBy(id = "car-pickup-hp-car")
	public WebElement pickup;

	@FindBy(id = "car-dropoff-hp-car")
	public WebElement dropoff;

	@FindBy(id = "car-pickup-date-hp-car")
	public WebElement pickupDate;

	@FindBy(id = "car-pickup-time-hp-car")
	public WebElement pickupTime;

	@FindBy(id = "car-dropoff-date-hp-car")
	public WebElement returnDate;

	@FindBy(id = "car-dropoff-time-hp-car")
	public WebElement returnTime;

	@FindBy(id = "car-age-of-driver-hp-car")
	public WebElement age;

	@FindBy(id = "gcw-cars-form-hp-car")
	public WebElement carHireForm;
}
