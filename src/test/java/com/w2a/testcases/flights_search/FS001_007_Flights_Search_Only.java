package com.w2a.testcases.flights_search;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.Page;
import com.w2a.base.SetupAndTearDown;
import com.w2a.pages.actions.FlightHomePage;

public class FS001_007_Flights_Search_Only extends SetupAndTearDown {

	//Test is OK
	@Test(dataProvider = "FS001_007")
	public void FS001_007_searchByDepartingOnly(String from, String to, String departDate, String returnDate,
			int noOfAdults, int noOfChildren, int noOfInfants) {

		FlightHomePage home = Page.gotoFlights();
		home.bookAFlight(from, to, departDate, returnDate, noOfAdults, noOfChildren, noOfInfants);

	}

	@DataProvider(name = "FS001_007")
	public Object[][] searchData() {
		return new Object[][] { { "SGN", "", "", "", 1, 0, 0 } };
	}
}
