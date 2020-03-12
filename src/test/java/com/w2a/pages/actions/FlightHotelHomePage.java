package com.w2a.pages.actions;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.w2a.base.Page;
import com.w2a.pages.locators.FlightHotelHomePageLocator;

public class FlightHotelHomePage extends Page {

	FlightHotelHomePageLocator home;

	public FlightHotelHomePage() {
		this.home = new FlightHotelHomePageLocator();
		PageFactory.initElements(driver, this.home);
	}

	public void bookAFlightAndHotel(String from, String to, String departDate, String returnDate, int noOfAdults,
			int noOfChildren, int noOfInfants, boolean isDirectFlightOnly, boolean needFlight) {

		if (from != "") {
			home.leavingFrom.sendKeys(from);
		}
		if (to != "") {
			home.goingTo.sendKeys(to);
		}
		if (departDate != "") {
			home.departDate.sendKeys(departDate);
		}
		if (returnDate != "") {
			Page.clearDate(home.returnDate);
			home.returnDate.sendKeys(returnDate);
		}
//		if (noOfAdults) {
//
//		}
//		if (noOfChildren) {
//
//		}
//		if (noOfInfants) {
//
//		}
		if (isDirectFlightOnly) {
			home.directFlightCheckBox.click();
		}
		if (needFlight) {
			home.needFlightCheckBox.click();
		}

		home.flightsHotelsForm.submit();

		try {
			Page.captureScreen();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//	public void gotoFlightsHotels() {
//		home.flightsHotelsTabBtn.click();
//		
//	}

}
