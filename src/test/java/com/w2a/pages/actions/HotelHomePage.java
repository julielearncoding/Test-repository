package com.w2a.pages.actions;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.w2a.base.Page;
import com.w2a.pages.locators.HotelHomePageLocator;

public class HotelHomePage extends Page {

	HotelHomePageLocator home;

	public HotelHomePage() {
		this.home = new HotelHomePageLocator();
		PageFactory.initElements(driver, home);

	}

	public void bookAHotel(String to, String checkInDate, String checkOutDate, int noOfAdults, int noOfChildren,
			int child1Age, int child2Age, int child3Age, int child4Age, int child5Age, int child6Age, int noOfRooms) {
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

		setTravellers(noOfAdults, noOfChildren, child1Age, child2Age, child3Age, child4Age, child5Age, child6Age, noOfRooms);

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

	public void setTravellers(int noOfAdults, int noOfChildren, int child1Age, int child2Age, int child3Age, int child4Age, int child5Age, int child6Age, int noOfRooms) {
		if (noOfAdults > 2 || noOfChildren > 0 || noOfRooms > 1) {
			home.travellers.click();

			setNoOfAdults(noOfAdults);
			setNoOfChildren(noOfChildren, child1Age, child2Age, child3Age, child4Age, child5Age, child6Age);
			setNumberOfRooms(noOfRooms);
		}
	}

	public void setNoOfAdults(int noOfAdults) {
		for (int adult = 1; adult <= noOfAdults - 2; adult++) {
			home.adultsPlusIcon.click();
		}
	}

	public void setNoOfChildren(int noOfChildren, int child1Age, int child2Age, int child3Age, int child4Age, int child5Age, int child6Age) {
		for (int child = 1; child <= noOfChildren; child++) {
			home.childrenPlusIcon.click();
		}

		Select child1 = new Select(home.child1Age);
		child1.selectByVisibleText("child1Age");
		
		Select child2 = new Select(home.child2Age);
		child2.selectByVisibleText("child2Age");
		
		Select child3 = new Select(home.child3Age);
		child3.selectByVisibleText("child3Age");
		
		Select child4 = new Select(home.child4Age);
		child4.selectByVisibleText("child4Age");
		
		Select child5 = new Select(home.child5Age);
		child5.selectByVisibleText("child5Age");
		
		Select child6 = new Select(home.child6Age);
		child6.selectByVisibleText("child6Age");

	}

	private void setNumberOfRooms(int noOfRooms) {
		for (int room = 1; room <= noOfRooms - 1; room++) {
			home.addMoreRoom.click();
		}
	}
}
