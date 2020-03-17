package com.w2a.pages.actions;

import org.openqa.selenium.support.PageFactory;

import com.w2a.base.Page;
import com.w2a.pages.locators.FlightsSearchResultPageLocator;

public class FlightsSearchResultPage extends Page {
	FlightsSearchResultPageLocator home ;
	
	public FlightsSearchResultPage() {
		this.home = new FlightsSearchResultPageLocator();
		PageFactory.initElements(driver, home);
	}
	
	public String getSelectionSummary() {
		return home.selectionSummary.getText();
		
	}

}
