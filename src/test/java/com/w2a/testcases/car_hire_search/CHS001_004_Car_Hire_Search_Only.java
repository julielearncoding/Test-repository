package com.w2a.testcases.car_hire_search;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.Page;
import com.w2a.base.SetupAndTearDown;
import com.w2a.pages.actions.CarHireHomePage;

public class CHS001_004_Car_Hire_Search_Only extends SetupAndTearDown {

	@Test(dataProvider = "CHS001_004")
	public void CHS001_004_searchByDepartingAndDesitnationAndDepartingDateAndReturnDateAnd7Travellers(String pickup,
			String dropoff, String pickupDate, String pickupTime, String returnDate, String returnTime, String age) {

		CarHireHomePage home = Page.gotoCarHire();
		home.bookACarHire(pickup, dropoff, pickupDate, pickupTime, returnDate, returnTime, age); 

	}

	@DataProvider(name = "CHS001_004")
	public Object[][] searchData() {
		return new Object[][] { { "Ho Chi Minh", "Da Lat", "27/03/2020", "10:30" ,"29/03/2020", "", "100" } };
	}
}
