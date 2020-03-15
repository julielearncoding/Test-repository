
package com.w2a.testcases.flights_search.add_hotel;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.Page;
import com.w2a.base.SetupAndTearDown;
import com.w2a.pages.actions.FlightHomePage;

public class FS001_001_Flights_Search_AH001_Add_A_Hotel extends SetupAndTearDown {

	// Test is OK, the browser isn't closed. Need investigating
	@Test(dataProvider = "FS001_001")
	public void FS001_001_searchFlightsValid(String from, String to, String departDate, String returnDate,
			int noOfAdults, int noOfChildren, int noOfInfants, boolean addHotel, String hotelCheckInDate, String hotelCheckoutDate, int noOfAdultsHotel, int noOfChildrenHotel, int noOfRoomsHotel) {

		FlightHomePage home = Page.gotoFlights();
		home.bookAFlightWithHotel(from, to, departDate, returnDate, noOfAdults, noOfChildren, noOfInfants, addHotel, hotelCheckInDate, hotelCheckoutDate, noOfAdultsHotel, noOfChildrenHotel, noOfRoomsHotel);
		
		//write function to assert the result
	}

	@DataProvider(name = "FS001_001")
	public Object[][] searchData() {
		return new Object[][] { { "SGN", "DAD", "27/03/2020", "05/04/2020", 6, 6, 6, true, "28/03/2020", "01/04/2020", 1, 0, 0 } };
	}
}
