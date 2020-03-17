package com.w2a.testcases.hotels_search;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.Page;
import com.w2a.base.SetupAndTearDown;
import com.w2a.pages.actions.HotelHomePage;

public class HS001_008_Hotels_Search_Only extends SetupAndTearDown {

	@Test(dataProvider = "HS001_008")
	public void HS001_001(String to, String checkinDate, String checkoutDate, int noOfAdults, int noOfChildren,
			int child1Age, int child2Age, int child3Age, int child4Age, int child5Age, int child6Age, int noOfRooms) {

		HotelHomePage home = Page.gotoHotels();
		home.bookAHotel(to, checkinDate, checkoutDate, noOfAdults, noOfChildren, child1Age, child2Age, child3Age,
				child4Age, child5Age, child6Age, noOfRooms);
	}

	@DataProvider(name = "HS001_008")
	public Object[][] searchData() {
		return new Object[][] { { "Wellington, New Zealand", "27/03/2020", "29/03/2020", 1, 0,0,0,0,0,0,0, 8 } };
	}
}
