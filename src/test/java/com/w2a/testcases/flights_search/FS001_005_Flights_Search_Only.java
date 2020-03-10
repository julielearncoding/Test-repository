package com.w2a.testcases.flights_search;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.SetupAndTearDown;
import com.w2a.pages.actions.FlightHomePage;

public class FS001_005_Flights_Search_Only extends SetupAndTearDown {

	@Test(dataProvider = "FS001_005")
	public void FS001_005_searchByDepartingAndDesitnationAndDepartingDateAndReturnDateAnd6TravellersWithChildAgeSet(
			String from, String to, String departDate, String returnDate, int noOfAdults, int noOfChildren,
			int noOfInfants) {
		FlightHomePage home = new FlightHomePage();
		home.gotoFlights();

		home.bookAFlight(from, to, departDate, returnDate, noOfAdults, noOfChildren, noOfInfants); // The SUT shows
																									// error coz child
																									// age are missed,
																									// need refactor to
																									// assert the error

		System.out.println(home.getError());

	}

	@DataProvider(name = "FS001_005")
	public Object[][] searchData() {
		return new Object[][] { { "SGN", "DAD", "27/03/2020", "27/04/2020", 2, 1, 3 } };
	}
}
