package com.w2a.testcases.hotels_search;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.SetupAndTearDown;
import com.w2a.pages.actions.HotelHomePage;

public class HS001_005_Hotels_Search_Only extends SetupAndTearDown {

	@Test(dataProvider = "HS001_005")
	public void FS001_006_searchByDestinationAndCheckInAndCheckOutAndMaxTravellers(String to, String departDate,
			String returnDate, int noOfAdults, int noOfChildren, int noOfRooms) {

		HotelHomePage home = new HotelHomePage();
//		home.gotoHotels();

		home.bookAHotel(to, departDate, returnDate, noOfAdults, noOfChildren, noOfRooms); // this scenario
																							// reaches exceed
																							// limt, avaible to
																							// book from 1..6
																							// travellers

//		System.out.println(home.getError());

	}

	@DataProvider(name = "HS001_005")
	public Object[][] searchData() {
		return new Object[][] { { "", "", "", 5, 3, 1 } };
	}
}
