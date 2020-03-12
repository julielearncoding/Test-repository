package com.w2a.testcases.flights_hotels_search;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.Page;
import com.w2a.base.SetupAndTearDown;
import com.w2a.pages.actions.FlightHotelHomePage;

public class FHS001_001_Flights_Hotels_Search_Only extends SetupAndTearDown {

	//Test is OK
	@Test(dataProvider = "FHS001_001")
	public void FHS001_001_searchFlightsAndHotels(String from, String to, String departDate, String returnDate,
			int noOfAdults, int noOfChildren, int noOfInfants, boolean isDirectFlightOnly, boolean needFlight) {

		FlightHotelHomePage home = Page.gotoFlightsHotels();
		home.bookAFlightAndHotel(from, to, departDate, returnDate, noOfAdults, noOfChildren, noOfInfants,
				isDirectFlightOnly, needFlight); 
	}

	@DataProvider(name = "FHS001_001")
	public Object[][] searchData() {
		return new Object[][] { { "Tan Son Nhat", "Bangkok", "27/03/2020", "29/03/2020", 0, 0, 0, true, false } };
	}
}
