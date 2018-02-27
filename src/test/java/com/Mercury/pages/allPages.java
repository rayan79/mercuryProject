package com.Mercury.pages;

import com.Mercury.Utility.SeleniumRelated;

public class allPages {
	//registration
	static String RegistrationlinkText="REGISTER";
	static String firstNameXpath="//*[@name='firstName']";
	static String lasttNameXpath="//*[@name='lastName']";
	static String phoneXpath="//*[@name='phone']";
	static String emailXpath="//*[@name='userName']";
	static String addressXpath="//*[@name='address1']";
	static String CityXpath="//*[@name='city']";
	static String StateXpath="//*[@name='state']";
	static String PostalXpath="//*[@name='postalCode']";
	static String CountryXpath="//*[@name='country']";
	static String UsernameXpath="//*[@name='email']";
	static String PasswordXpath="//*[@name='password']";
	static String ConfirmPasswordXpath="//*[@name='confirmPassword']";
	static String SumbitXpath="//*[@name='register']";
	//User info
	static String firstname="ray";
	static String lastname="ah";
	static String phone="23634733";
	static String email="abcd@gmail.com";
	static String address="12-12 45ave";
	static String city ="LIC";
	static String state ="NY";
	static String postal ="11435";
	static String country ="USA";
	static String username="abcd17";
	static String password="password";
	//flights
	static  String DepartingName="fromPort"; 
	
	public static SeleniumRelated selenium=new SeleniumRelated();
	  public static void registration() {
		  selenium.goToUrl();
		  selenium.click("//*[contains(text(),'REGISTER')]");
		  selenium.enterText(firstNameXpath,firstname);
		  selenium.enterText(lasttNameXpath,lastname);
		  selenium.enterText(phoneXpath,phone);
		  selenium.enterText(emailXpath,email);
		  selenium.enterText(addressXpath,address);
		  selenium.enterText(CityXpath,city);
		  selenium.enterText(StateXpath,state);
		  selenium.enterText(PostalXpath,postal);
		  selenium.enterText(CountryXpath,country);
		  selenium.enterText(PasswordXpath,password);
		  selenium.enterText(ConfirmPasswordXpath,password);
		  selenium.click(SumbitXpath);
		   
	   }
	  public static void flights() {
		  selenium.click("//*[contains(text(),'Flights')]");
		  
		  selenium.selectDropDown(DepartingName,"London");
		  selenium.selectDropDown("toDay","26");
		  selenium.click("//*[@name='findFlights']");
		  
		  
	  }
	  
	  

}
