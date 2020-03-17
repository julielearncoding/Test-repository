package com.w2a.testcases.flights_search;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.Page;
import com.w2a.base.SetupAndTearDown;
import com.w2a.pages.actions.FlightHomePage;

public class FS001_007_Flights_Search_Only extends SetupAndTearDown {

	@Test(dataProvider = "FS001_007")
	public void FS001_007_searchFlightsValid(String from, String to, String departDate, String returnDate,
			int noOfAdults, int noOfChildren, String child1Age,String child2Age,String child3Age,String child4Age,String child5Age,String child6Age,  int noOfInfants, String infant1Age, String infant2Age, String infant3Age, String infant4Age, String infant5Age, String infant6Age) {

		FlightHomePage home = Page.gotoFlights();
		home.bookAFlight(from, to, departDate, returnDate, noOfAdults
				, noOfChildren,child1Age,child2Age,child3Age,child4Age,child5Age,child6Age
				, noOfInfants, infant1Age, infant2Age, infant3Age, infant4Age, infant5Age, infant6Age);
		
		home.verifySuccessResults(Integer.toString(noOfAdults + noOfChildren + noOfInfants));

	}

	//Conidtiions for On lap, in seat, need more cases
	@DataProvider(name = "FS001_007")
	public Object[][] searchData() {
		return new Object[][] {
		{ "SGN", "DAD", "27/03/2020", "27/04/2020"
		, 1
		, 0,"0","0","0","0","0","0"
		, 5,"1","Under 1","Under 1","1","1",""
		} 
	};
}


}
