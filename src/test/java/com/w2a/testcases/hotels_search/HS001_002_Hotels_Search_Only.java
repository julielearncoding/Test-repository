package com.w2a.testcases.hotels_search;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.SetupAndTearDown;
import com.w2a.pages.actions.HotelHomePage;

public class HS001_002_Hotels_Search_Only extends SetupAndTearDown {

	@Test(dataProvider = "HS001_002")
	public void HS001_002_searchByAllCriteriaWithAddOneMoreRoom(
			String to, String checkinDate, String checkoutDate, int noOfAdults, int noOfChildren, int noOfRooms) {

		HotelHomePage home = new HotelHomePage();
		home.bookAHotel(to, checkinDate, checkoutDate, noOfAdults, noOfChildren, noOfRooms);
		
	}

	@DataProvider(name = "HS001_002")
	public Object[][] searchData() {
		return new Object[][] { { "Wellington, New Zealand", "27/03/2020", "29/03/2020", 1, 0, 0  } };
	}
}
