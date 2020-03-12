package com.w2a.pages.actions;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import com.w2a.base.Page;
import com.w2a.pages.locators.HolidayActivitiesHomePageLocator;

public class HolidayActivitiesHomePage extends Page{

	HolidayActivitiesHomePageLocator home;
	
	public HolidayActivitiesHomePage() {
		this.home = new HolidayActivitiesHomePageLocator();
		PageFactory.initElements(driver, this.home);
	}

	public void bookAnActivity(String destination, String from, String to) {
		if (destination != "") {
			home.destination.sendKeys(destination);
			home.destination.sendKeys(Keys.RETURN);
		}
		if (from != "") {
			Page.clearDate(home.from);
			home.from.sendKeys(from);
		}
		if (to != "") {
			Page.clearDate(home.to);
			home.to.sendKeys(to);
		}
		
		home.holidayActivitiesForm.submit();
		
		try {
			Page.captureScreen();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
