package com.w2a.pages.actions;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.w2a.base.Page;
import com.w2a.pages.locators.HotelHomePageLocator;

public class HotelHomePage extends Page {

	HotelHomePageLocator home;

	public HotelHomePage() {
		this.home = new HotelHomePageLocator();
		PageFactory.initElements(driver, home);

	}

	public void bookAHotel(String to, String checkInDate, String checkOutDate, int noOfAdults, int noOfChildren,
			int noOfRooms) {
		if (to != "") {
			home.destination.sendKeys(to);
			home.destination.click();
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

		setTravellers(noOfAdults, noOfChildren, noOfRooms);

		home.hotelSearchForm.submit();

		try

		{
			Page.captureScreen();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public char[] getError() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setTravellers(int noOfAdults, int noOfChildren, int noOfRooms) {
		if (noOfAdults > 2 || noOfChildren > 0 || noOfRooms > 1)  {
			home.travellers.click(); 
			
			setNoOfAdults(noOfAdults);
			setNoOfChildren(noOfChildren);
			setNumberOfRooms(noOfRooms);
		}
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

	private void setNumberOfRooms(int noOfRooms) {
		for (int room = 1; room <= noOfRooms - 1; room++) {
			home.addMoreRoom.click();
		}
	}
}
