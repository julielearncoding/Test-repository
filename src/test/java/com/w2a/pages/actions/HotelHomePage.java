package com.w2a.pages.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import com.w2a.base.Page;
import com.w2a.pages.locators.HotelHomePageLocator;

public class HotelHomePage extends Page {

	HotelHomePageLocator home;

	public HotelHomePage() {
		this.home = new HotelHomePageLocator();
		PageFactory.initElements(driver, home);

	}

	public void gotoHotels() {
		// TODO Auto-generated method stub

	}

	public void bookAHotel(String to, String checkInDate, String checkOutDate, int noOfAdults, int noOfChildren,
			int noOfRooms) {
		if (to != "") {
			home.destination.sendKeys(to);
			home.destination.sendKeys(Keys.RETURN);
		}
		;

		if (checkInDate != "") {
			home.checkIn.sendKeys(checkInDate);
		}
		;

		if (checkOutDate != "") {
			Page.clearDate(home.checkOut);
			home.checkOut.sendKeys(checkOutDate);
		}
		if (noOfAdults > 2) {
			home.travellers.click();
			setNoOfAdults(noOfAdults);
		}

		if (noOfChildren > 0) {
			setNoOfChildren(noOfChildren);
		}

		if (noOfRooms > 1) {
			home.travellers.click();
			for (int room = 0; room < noOfRooms - 1; room++) {
				home.addMoreRoom.click();
				System.out.println(home.addMoreRoom.getText());
			}
		}
//		home.searchButton.click();

	}

	public char[] getError() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setNoOfAdults(int noOfAdults) {
		for (int adult = 1; adult <= noOfAdults - 2; adult++) {
			home.adultsPlusIcon.click();
		}
	}

	public void setNoOfChildren(int noOfChildren) {
		for (int child = 1; child <= noOfChildren; child++) {
			home.childrenPlusIcon.click();
		}
	}

}
