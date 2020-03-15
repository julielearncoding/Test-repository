package com.w2a.testcases.flights_hotels_search;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.Page;
import com.w2a.base.SetupAndTearDown;
import com.w2a.pages.actions.FlightHotelHomePage;

public class FHS001_009_Flights_Hotels_Search_Only extends SetupAndTearDown {

	@Test(dataProvider = "FHS001_008")
	public void FHS001_008_searchByDepartingAndDesitnationAndDepartingDateAndReturnDateAnd7TravellersDirectFlight(
			String from, String to, String departDate, String returnDate, int noOfAdults, int noOfChildren,
			int noOfInfants, int noOfRooms, boolean isDirectFlightOnly, boolean needFlight) {

		FlightHotelHomePage home = Page.gotoFlightsHotels();
		home.bookAFlightAndHotel(from, to, departDate, returnDate, noOfAdults, noOfChildren, noOfInfants, noOfRooms
				,isDirectFlightOnly, needFlight); 
	}

	@DataProvider(name = "FHS001_008")
	public Object[][] searchData() {
		return new Object[][] { {"SGN", "DAD", "27/03/2020", "29/03/2020", 6, 6, 6, 10 , true, false } };
	}
}
