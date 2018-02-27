package com.Mercury.pages;

public class pagesFlights extends allPages {
	  public static void flights() {
		  selenium.click("//*[contains(text(),'Flights')]");
		  
		  selenium.selectDropDown(DepartingName,"London");
		  selenium.selectDropDown("toDay","26");
		  selenium.click("//*[@name='findFlights']");
		  
		  
	  }
	

}
