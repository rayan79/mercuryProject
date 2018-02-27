package com.Mercury.pages;

public class summaryPage extends pagesFlights {
	public static void summary() {
		selenium.click("//*[@name='reserveFlights']");
		  selenium.click("//input[@name='buyFlights']");
	  }

}
