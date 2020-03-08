package com.w2a.rough;

import com.w2a.base.Page;
import com.w2a.pages.actions.HomePage;

public class FlightTest {
	public static void main(String[] args) throws InterruptedException {
			
		Page.initConfiguration();
		
		HomePage home = new HomePage(); 
		home.gotoFlights();

		home.setNumberOfAdults(4);
		
		System.out.println(home.getAdultsSelectedValue());
		
		home.setNumberOfChildren(1);
		Thread.sleep(3000);
		
		System.out.println(home.getChildrenSelectedValue());
		
//		home.setChildAge(1,"11");
//		
		home.setNumberOfInfants(1);
		
		System.out.println(home.getInfantsSelectedValue());
		
//		home.setInfantAge(6, "1");
//		home.setInfantAge(1, "1");

		System.out.println(home.getTravellersValue());
		
		Page.quitBrowser();
	}

}
