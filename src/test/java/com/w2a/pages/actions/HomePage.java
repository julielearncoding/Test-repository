package com.w2a.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.w2a.base.Page;
import com.w2a.pages.locators.HomePageLocator;

public class HomePage extends Page {

	public HomePageLocator home;

	public HomePage() {
		this.home = new HomePageLocator();
		PageFactory.initElements(driver, this.home);
	}

	public void gotoFlights() {
		home.tabFlights.click();

	}

	public void gotoHotels() {

	}

	public void gotoFlightsAndHotels() {

	}

	public void bookAFlight(String from, String to, String departDate, String returnDate, int noOfAdults, int noOfChildren, int noOfInfants) {
		if (from != "") {
			home.flightFrom.sendKeys(from);
		}
		if (to != "") {
			home.flightDestination.sendKeys(to);
		}
		if (departDate != "") {
			home.departDate.sendKeys(departDate);
		}

		home.returnDate.clear();
		if (departDate != "") {
			home.returnDate.sendKeys(returnDate);
		}

		setNumberOfAdults(noOfAdults);
		
		setNumberOfChildren(noOfChildren);
		
		setNumberOfInfants(noOfInfants);

		home.searchButton.click();
	}

	public String getError() {
		return home.alertTitle.getText() + "/r" + home.errorDestination.getText() + "/r"
				+ home.errorDepartDate.getText() + "/r" + home.errorReturnDate.getText();
	}

	public void setNumberOfAdults(int noOfAdults) {
		home.travellers.click();

		if (noOfAdults > 1 && noOfAdults <= 6) {
			for (int adult = 1; adult < noOfAdults; adult++) {
				home.adultsPlusIcon.click();
			}
		}
	}

	public void setNumberOfChildren(int noOfChildren) {
		if (noOfChildren > 0 && noOfChildren <= 6) {
			for (int child = 1; child <= noOfChildren; child++) {
				home.childrenPlusIcon.click();
			}
		}
	}

	public void setNumberOfInfants(int noOfInfants) {
		if (noOfInfants > 0 && noOfInfants <= 6) {
			for (int infant = 1; infant <= noOfInfants; infant++) {
				home.infantsPlusIcon.click();
			}
		}
	}

	public String getAdultsSelectedValue() {
		return home.adultsSelectedValue.getText();
	}

	public String getChildrenSelectedValue() {
		return home.childrenSelectedValue.getText();
	}

	public String getInfantsSelectedValue() {
		return home.infantsSelectedValue.getText();
	}

	public String getTravellersValue() {
		return home.travellers.getText(); //the locate travellers got too big, need factor to get inner string i.e. 6 adults, 12 children
	}

	public void setChildAge(int childAgeId, String childAgeValue) {
		Select childAgeSelect = null;
		if (childAgeId == 1) {
			childAgeSelect = new Select(home.chidAge1);
		} else if (childAgeId == 2) {
			childAgeSelect = new Select(home.chidAge2);
		} else if (childAgeId == 3) {
			childAgeSelect = new Select(home.chidAge3);
		} else if (childAgeId == 4) {
			childAgeSelect = new Select(home.chidAge4);
		} else if (childAgeId == 5) {
			childAgeSelect = new Select(home.chidAge5);
		} else if (childAgeId == 6) {
			childAgeSelect = new Select(home.chidAge6);
		}

		childAgeSelect.selectByVisibleText(childAgeValue);
	}

	public void setInfantAge(int infantAgeId, String infantAgeValue) {
		Select infantAgeSelect = null;
		if (infantAgeId == 1) {
			infantAgeSelect = new Select(home.infantAge1);
		} else if (infantAgeId == 2) {
			infantAgeSelect = new Select(home.infantAge2);
		} else if (infantAgeId == 3) {
			infantAgeSelect = new Select(home.infantAge3);
			infantAgeSelect.selectByVisibleText(infantAgeValue);
		} else if (infantAgeId == 4) {
			infantAgeSelect = new Select(home.infantAge4);
		} else if (infantAgeId == 5) {
			infantAgeSelect = new Select(home.infantAge5);
		} else if (infantAgeId == 6) {
			infantAgeSelect = new Select(home.chidAge6);
		}

		infantAgeSelect.selectByVisibleText(infantAgeValue);
	}
}
