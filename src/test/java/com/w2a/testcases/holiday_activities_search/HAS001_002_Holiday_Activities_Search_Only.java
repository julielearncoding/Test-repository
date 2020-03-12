package com.w2a.testcases.holiday_activities_search;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.Page;
import com.w2a.base.SetupAndTearDown;
import com.w2a.pages.actions.HolidayActivitiesHomePage;

public class HAS001_002_Holiday_Activities_Search_Only extends SetupAndTearDown {

	@Test(dataProvider = "HAS001_002")
	public void HAS001_002_searchActivities(String destination, String from, String to) {
	
		HolidayActivitiesHomePage home = Page.gotoHolidayActivities();
		home.bookAnActivity(destination, from, to); // this scenario

//		System.out.println(home.getError());

	}

	//rule: current time must 2 hrs before current
	@DataProvider(name = "HAS001_002")
	public Object[][] searchData() {
		return new Object[][] { { "Ho Chi Minh", "27/03/2020","" } };
	}
}
