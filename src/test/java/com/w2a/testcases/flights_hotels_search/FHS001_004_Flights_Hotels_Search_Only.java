package com.w2a.testcases.flights_hotels_search;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.Page;
import com.w2a.base.SetupAndTearDown;
import com.w2a.pages.actions.FlightHotelHomePage;

public class FHS001_004_Flights_Hotels_Search_Only extends SetupAndTearDown {

	@Test(dataProvider = "FHS001_004")
	public void FHS001_004_searchByDepartingAndDesitnationAndDepartingDateAndReturnDateAnd7TravellersDirectFlight(
			String from, String to, String departDate, String returnDate, int noOfAdults, int noOfChildren,
			int noOfInfants, int noOfRooms, boolean isDirectFlightOnly, boolean needFlight) {

		FlightHotelHomePage home = Page.gotoFlightsHotels();
		home.bookAFlightAndHotel(from, to, departDate, returnDate, noOfAdults, noOfChildren, noOfInfants, noOfRooms
				,isDirectFlightOnly, needFlight); 
	}

	@DataProvider(name = "FHS001_004")
	public Object[][] searchData() {
		return new Object[][] { {"SGN", "DAD", "27/03/2020", "27/04/2020", 7, 0, 0, 0 , true, false } };
	}
}
