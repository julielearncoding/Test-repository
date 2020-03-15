package com.w2a.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightHotelHomePageLocator extends MainPageLocator {

	@FindBy (id = "package-origin-hp-package")
	public WebElement leavingFrom;
	
	@FindBy (id = "package-destination-hp-package")
	public WebElement goingTo;
	
	@FindBy (id = "package-departing-hp-package")
	public WebElement departDate;
	
	@FindBy (id = "package-returning-hp-package")
	public WebElement returnDate;
	
	@FindBy (id = "packageDirectFlight-hp-package")
	public WebElement directFlightCheckBox;
	
	@FindBy (id = "partialHotelBooking-hp-package")
	public WebElement needFlightCheckBox;
	
	@FindBy (id = "gcw-packages-form-hp-package")
	public WebElement flightsHotelsForm;

	public WebElement travellers;
	
	
}
