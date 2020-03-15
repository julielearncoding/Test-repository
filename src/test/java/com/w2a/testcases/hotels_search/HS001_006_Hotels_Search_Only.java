package com.w2a.testcases.hotels_search;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.Page;
import com.w2a.base.SetupAndTearDown;
import com.w2a.pages.actions.HotelHomePage;

public class HS001_006_Hotels_Search_Only extends SetupAndTearDown {

	@Test(dataProvider = "HS001_006")
	public void HS001_006_searchByDestinationAndCheckInAndCheckOutAndDefaultTravellers(
			String to, String checkinDate, String checkoutDate, int noOfAdults, int noOfChildren, int noOfRooms) {

		HotelHomePage home = Page.gotoHotels();
		home.bookAHotel(to, checkinDate, checkoutDate, noOfAdults, noOfChildren, noOfRooms); 
		
	}

	@DataProvider(name = "HS001_006")
	public Object[][] searchData() {
		return new Object[][] { { "Wellington, New Zealand", "27/03/2020", "29/03/2020", 1, 6, 0 } };
	}
}
