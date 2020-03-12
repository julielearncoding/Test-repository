package com.w2a.testcases.holiday_activities_search;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.Page;
import com.w2a.base.SetupAndTearDown;
import com.w2a.pages.actions.HolidayActivitiesHomePage;

public class HAS001_003_Holiday_Activities_Search_Only extends SetupAndTearDown {

	@Test(dataProvider = "HAS001_001")
	public void HAS001_001_searchActivities(String destination, String from, String to) {

		HolidayActivitiesHomePage home = Page.gotoHolidayActivities();
		home.bookAnActivity(destination, from, to); 
	}

	//rule: current time must 2 hrs before current
	@DataProvider(name = "HAS001_001")
	public Object[][] searchData() {
		return new Object[][] { { "Ho Chi Minh", "","" } };
	}
}
