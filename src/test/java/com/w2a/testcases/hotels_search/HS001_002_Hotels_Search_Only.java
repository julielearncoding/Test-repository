package com.w2a.testcases.hotels_search;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.SetupAndTearDown;
import com.w2a.pages.actions.HotelHomePage;

public class HS001_002_Hotels_Search_Only extends SetupAndTearDown {

	@Test(dataProvider = "HS001_002")
	public void HS001_002_searchByAllCriteriaWithAddOneMoreRoom(
			String to, String departDate, String returnDate, int noOfAdults, int noOfChildren, int noOfRooms) {

		HotelHomePage home = new HotelHomePage();
		home.bookAHotel(to, departDate, returnDate, noOfAdults, noOfChildren, noOfRooms);
		
	}

	@DataProvider(name = "HS001_002")
	public Object[][] searchData() {
		return new Object[][] { { "Ho Chi Minh", "", "", 3, 3, 2 } };
	}
}
