package com.w2a.pages.actions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.w2a.base.Page;
import com.w2a.pages.locators.FlightHomePageLocator;

public class FlightHomePage extends Page {

	public FlightHomePageLocator home;

	public FlightHomePage() {
		this.home = new FlightHomePageLocator();
		PageFactory.initElements(driver, this.home);
	}

	public void bookAFlight(String from, String to, String departDate, String returnDate, int noOfAdults,
			int noOfChildren, String child1Age, String child2Age, String child3Age, String child4Age, String child5Age,
			String child6Age, int noOfInfants, String infant1Age, String infant2Age, String infant3Age,
			String infant4Age, String infant5Age, String infant6Age) {

		enterDeparture(from);
		enterDestination(to);
		enterDepartDate(departDate);
		enterReturnDate(returnDate);
		setTravellers(noOfAdults, noOfChildren, child1Age, child2Age, child3Age, child4Age, child5Age, child6Age,
				noOfInfants, infant1Age, infant2Age, infant3Age, infant4Age, infant5Age, infant6Age);
		submitSearch();

		try {
			Page.captureScreen();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void submitSearch() {
		home.flightSearchForm.submit();
	}

	private void enterReturnDate(String returnDate) {
		if (returnDate != "") {
			Page.clearDate(home.returnDate);
			home.returnDate.sendKeys(returnDate);
		}
	}

	private void enterDepartDate(String departDate) {
		if (departDate != "") {
			home.departDate.sendKeys(departDate);
		}
	}

	private void enterDestination(String to) {
		if (to != "") {
			home.flightDestination.sendKeys(to);
		}
	}

	private void enterDeparture(String from) {
		if (from != "") {
			home.flightFrom.sendKeys(from);
		}
	}

	private void setTravellers(int noOfAdults, int noOfChildren, String child1Age, String child2Age, String child3Age,
			String child4Age, String child5Age, String child6Age, int noOfInfants, String infant1Age, String infant2Age,
			String infant3Age, String infant4Age, String infant5Age, String infant6Age) {

		if (noOfAdults > 1 || noOfChildren > 0 || noOfInfants > 0) {
			home.travellers.click();
		}
		setNumberOfAdults(noOfAdults);
		setNumberOfChildren(noOfChildren, child1Age, child2Age, child3Age, child4Age, child5Age, child6Age);
		setNumberOfInfants(noOfInfants, infant1Age, infant2Age, infant3Age, infant4Age, infant5Age, infant6Age);

	}

	public String getError() {
		return home.alertTitle.getText() + "/r" + home.errorDestination.getText() + "/r"
				+ home.errorDepartDate.getText() + "/r" + home.errorReturnDate.getText();
	}

	public void setNumberOfAdults(int noOfAdults) {
		if (noOfAdults >= 1) {
			for (int adult = 1; adult <= noOfAdults - 1; adult++) {
				home.adultsPlusIcon.click();
			}
		}
	}

	public void setNumberOfChildren(int noOfChildren, String child1Age, String child2Age, String child3Age,
			String child4Age, String child5Age, String child6Age) {
		if (noOfChildren > 0) {
			for (int child = 1; child <= noOfChildren; child++) {
				home.childrenPlusIcon.click();
			}
		}
		setChildrenAge(noOfChildren, child1Age, child2Age, child3Age, child4Age, child5Age, child6Age);
	}

	private void setChildrenAge(int noOfChildren, String child1Age, String child2Age, String child3Age,
			String child4Age, String child5Age, String child6Age) {
		if (noOfChildren == 1) {
			setChildAge(1, child1Age);
		}
		if (noOfChildren == 2) {
			setChildAge(1, child1Age);
			setChildAge(2, child2Age);
		}
		if (noOfChildren == 3) {
			setChildAge(1, child1Age);
			setChildAge(2, child2Age);
			setChildAge(3, child3Age);
		}
		if (noOfChildren == 4) {
			setChildAge(1, child1Age);
			setChildAge(2, child2Age);
			setChildAge(3, child3Age);
			setChildAge(4, child4Age);
		}
		if (noOfChildren == 5) {
			setChildAge(1, child1Age);
			setChildAge(2, child2Age);
			setChildAge(3, child3Age);
			setChildAge(4, child4Age);
			setChildAge(5, child5Age);
		}
		if (noOfChildren >= 6) {
			setChildAge(1, child1Age);
			setChildAge(2, child2Age);
			setChildAge(3, child3Age);
			setChildAge(4, child4Age);
			setChildAge(5, child5Age);
			setChildAge(6, child6Age);
		}
	}

	public void setNumberOfInfants(int noOfInfants, String infant1Age, String infant2Age, String infant3Age,
			String infant4Age, String infant5Age, String infant6Age) {
		if (noOfInfants > 0) {
			for (int infant = 1; infant <= noOfInfants; infant++) {
				home.infantsPlusIcon.click();
			}
		}

		if (noOfInfants == 1) {
			setInfantAge(1, infant1Age);
		}
		if (noOfInfants == 2) {
			setInfantAge(1, infant1Age);
			setInfantAge(2, infant2Age);
		}
		if (noOfInfants == 3) {
			setInfantAge(1, infant1Age);
			setInfantAge(2, infant2Age);
			setInfantAge(3, infant3Age);
		}
		if (noOfInfants == 4) {
			setInfantAge(1, infant1Age);
			setInfantAge(2, infant2Age);
			setInfantAge(3, infant3Age);
			setInfantAge(4, infant4Age);
		}
		if (noOfInfants == 5) {
			setInfantAge(1, infant1Age);
			setInfantAge(2, infant2Age);
			setInfantAge(3, infant3Age);
			setInfantAge(4, infant4Age);
			setInfantAge(5, infant5Age);
		}
		if (noOfInfants >= 6) {
			setInfantAge(1, infant1Age);
			setInfantAge(2, infant2Age);
			setInfantAge(3, infant3Age);
			setInfantAge(4, infant4Age);
			setInfantAge(5, infant5Age);
			setInfantAge(6, infant6Age);
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
		return home.travellers.getText(); // the locate travellers got too big, need factor to get inner string i.e. 6
											// adults, 12 children
	}

	public void setChildAge(int childAgeId, String childAgeValue) {
		Select childAgeSelect = null;
		if (childAgeId == 1) {
			childAgeSelect = new Select(home.chid1Age);
		} else if (childAgeId == 2) {
			childAgeSelect = new Select(home.chid2Age);
		} else if (childAgeId == 3) {
			childAgeSelect = new Select(home.chid3Age);
		} else if (childAgeId == 4) {
			childAgeSelect = new Select(home.chid4Age);
		} else if (childAgeId == 5) {
			childAgeSelect = new Select(home.chid5Age);
		} else if (childAgeId == 6) {
			childAgeSelect = new Select(home.chid6Age);
		}

		childAgeSelect.selectByVisibleText(childAgeValue);
	}

	public void setInfantAge(int infantAgeId, String infantAgeValue) {
		Select infantAgeSelect = null;
		if (infantAgeId == 1) {
			infantAgeSelect = new Select(home.infant1Age);
		} else if (infantAgeId == 2) {
			infantAgeSelect = new Select(home.infant2Age);
		} else if (infantAgeId == 3) {
			infantAgeSelect = new Select(home.infant3Age);
			infantAgeSelect.selectByVisibleText(infantAgeValue);
		} else if (infantAgeId == 4) {
			infantAgeSelect = new Select(home.infant4Age);
		} else if (infantAgeId == 5) {
			infantAgeSelect = new Select(home.infant5Age);
		} else if (infantAgeId == 6) {
			infantAgeSelect = new Select(home.infant5Age);
		}

		infantAgeSelect.selectByVisibleText(infantAgeValue);
	}

	public void bookAFlightWithHotel(String from, String to, String departDate, String returnDate, int noOfAdults,
			int noOfChildren, int noOfInfants, boolean addHotel, String checkinDateFlightHotel,
			String checkoutDateFlightHotel, int noOfAdultsHotel, int noOfChildrenHotel, int noOfRoomsHotel) {

		enterDeparture(from);
		enterDestination(to);
		enterDepartDate(departDate);

		enterReturnDate(returnDate);

//		setTravellers(noOfAdults, noOfChildren, noOfInfants);

		/* enter flight info finished */

		/* enter additional hotel info */
		if (addHotel) {
			home.addHotel.click();

			if (checkinDateFlightHotel != "") {
//				Page.clearDate(home.checkinDateFlightHotel);
				home.checkinDateFlightHotel.sendKeys(checkinDateFlightHotel);
			}
			if (checkoutDateFlightHotel != "") {
				Page.clearDate(home.checkoutDateFlightHotel);
				home.checkoutDateFlightHotel.sendKeys(checkoutDateFlightHotel);
			}

//			setTravellers(noOfAdultsHotel, noOfChildrenHotel, noOfRoomsHotel);
		}

		/* enter additional hotel info finished */

		submitSearch();

		try {
			Page.captureScreen();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void verifySuccessResults(String expectedResult) {
		FlightsSearchResultPage fsr = new FlightsSearchResultPage();
		boolean actual = fsr.getSelectionSummary().contains(expectedResult);
		Assert.assertTrue(actual);
	}

	public void verifyUnSuccessError(String expectedTitleMessage, String expectedTravellersMessage, String expectedChildAgeMessage) {

//		String expectedTitleMessage = "Please correct the errors below.";
//		String expectedTravellersMessage = "We are only able to book between 1 and 6 travellers. Please adjust the number of travellers for your search.";
//		String expectedChildAgeMessage = "Please provide the ages of children below.";

		assertEquals(home.alertTitle.getText(), expectedTitleMessage);
		assertEquals(home.alertTravellers.getText(), expectedTravellersMessage);
//		assertEquals(home.alertChildAge.getText(), expectedChildAgeMessage);
	}

}
