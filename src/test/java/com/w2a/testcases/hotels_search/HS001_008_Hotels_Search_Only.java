package com.w2a.testcases.hotels_search;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.SetupAndTearDown;
import com.w2a.pages.actions.HotelHomePage;

public class HS001_008_Hotels_Search_Only extends SetupAndTearDown {

	@Test(dataProvider = "HS001_008")
	public void HS001_008_searchByAllCriteriaWithAddOneMoreRoom(
			String to, String departDate, String returnDate, int noOfAdults, int noOfChildren, int noOfRooms) {

		HotelHomePage home = new HotelHomePage();
//		home.gotoHotels();                                                                                                                                                                                                                                                                                                    

 
																									// reaches exceed
																									// limt, avaible to
																									// book from 1..6
																									// travellers

//		System.out.println(home.getError());

	}

	@DataProvider(name = "HS001_008")
	public Object[][] searchData() {
		return new Object[][] { { "SGN", "", "", 1, 0, 4 } };
	}
}
