package com.w2a.testcases.hotels_search;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.SetupAndTearDown;
import com.w2a.pages.actions.HotelHomePage;

public class HS001_002_Hotels_Search_Only extends SetupAndTearDown {

	@Test(dataProvider = "HS001_002")
	public void HS001_002_searchByDestinationAndCheckIn(
			String to, String checkInDate, String checkOutDate, int noOfAdults, int noOfChildren, int noOfRooms) {

		HotelHomePage home = new HotelHomePage();
//		home.gotoHotels();

		home.bookAHotel(to, checkInDate, checkOutDate, noOfAdults, noOfChildren, noOfRooms); // this scenario
																									// reaches exceed
																									// limt, avaible to
																									// book from 1..6
																									// travellers

//		System.out.println(home.getError());

	}

	@DataProvider(name = "HS001_002")
	public Object[][] searchData() {
		return new Object[][] { { "Ho Chi Minh City", "27/03/2020", "", 0, 0, 1 } };
	}
}
