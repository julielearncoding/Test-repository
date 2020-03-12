package com.w2a.pages.actions;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.w2a.base.Page;
import com.w2a.pages.locators.CarHireHomePageLocator;

public class CarHireHomePage extends Page {

	CarHireHomePageLocator home;

	public CarHireHomePage() {
		this.home = new CarHireHomePageLocator();
		PageFactory.initElements(driver, this.home);
	}

	public void bookACarHire(String pickup, String dropoff, String pickupDate, String pickupTime, String returnDate,
			String returnTime, String age) {
		if (pickup != "") {
			home.pickup.sendKeys(pickup);
		}
		if (dropoff != "") {
			home.dropoff.sendKeys(dropoff);
		}
		if (pickupDate != "") {
			Page.clearDate(home.pickupDate);
			home.pickupDate.sendKeys(pickupDate);
		}
		if (pickupTime != "") {
			Page.clearDate(home.pickupTime);
			home.pickupTime.sendKeys(pickupTime);
		}
		if (returnDate != "") {
			home.returnDate.sendKeys(returnDate);
		}
		if (returnTime != "") {
			home.returnTime.sendKeys(returnTime);
		}
		if (age != "") {
			home.age.sendKeys(age);
		}

		home.carHireForm.submit();
		
		try {
			Page.captureScreen();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
