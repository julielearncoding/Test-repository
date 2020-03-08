package com.w2a.rough;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.w2a.base.Page;
import com.w2a.pages.actions.HomePage;

public class H002_Search_Flights_Only {
	
	@BeforeMethod
	public static void setUp() {
			
		Page.initConfiguration();
	}
	
	@Test(enabled=false)
	public void H002_001_searchByDeparting() {
		HomePage home = new HomePage(); 
		home.gotoFlights();

		home.bookAFlight("SGN", "", "", "",1,0,0);
		
		System.out.println(home.getError());
		
	}
	
	@Test(enabled=false)
	public void H002_002_searchByDepartingAndDesitnation() {
		HomePage home = new HomePage(); 
		home.gotoFlights();

		home.bookAFlight("SGN", "DAD", "27/03/2020", "",1,0,0);
		
		System.out.println(home.getError());
		
	}
	
	@Test(enabled=false)
	public void H002_003_searchByDepartingAndDesitnationAndDepartingDate() {
		HomePage home = new HomePage(); 
		home.gotoFlights();

		home.bookAFlight("SGN", "DAD", "27/03/2020", "",1,0,0);
		
		System.out.println(home.getError());
	}
	
	@Test(enabled=false)
	public void H002_004_searchByDepartingAndDesitnationAndDepartingDateAndReturnDateAndDefault1Travellers() {
		HomePage home = new HomePage(); 
		home.gotoFlights();

		home.bookAFlight("SGN", "DAD", "27/03/2020", "27/04/2020",0,0,0);
		
		System.out.println(home.getError());
		
	}
	
	@Test
	public void H002_005_searchByDepartingAndDesitnationAndDepartingDateAndReturnDateAnd6TravellersWithChildAgeSet() {
		HomePage home = new HomePage(); 
		home.gotoFlights();

		home.bookAFlight("SGN", "DAD", "27/03/2020", "27/04/2020",2,1,3); //The SUT shows error coz child age are missed, need refactor to assert the error
		
		System.out.println(home.getError());
		
	}
	
	@Test(enabled=false)
	public void H002_005_searchByDepartingAndDesitnationAndDepartingDateAndReturnDateAnd6Travellers() {
		HomePage home = new HomePage(); 
		home.gotoFlights();

		home.bookAFlight("SGN", "DAD", "27/03/2020", "27/04/2020",2,1,3); //The SUT shows error coz child age are missed, need refactor to assert the error
		
		System.out.println(home.getError());
		
	}
	
	@Test(enabled=false)
	public void H002_005_searchByDepartingAndDesitnationAndDepartingDateAndReturnDateAnd7Travellers() {
		HomePage home = new HomePage(); 
		home.gotoFlights();

		home.bookAFlight("SGN", "DAD", "27/03/2020", "27/04/2020",3,1,3); //this scenario reaches exceed limt, avaible to book from 1..6 travellers
		
		System.out.println(home.getError());
		
	}
	
	@AfterMethod
	public void quitBrowser() {
//		Page.quitBrowser();
	}

}
