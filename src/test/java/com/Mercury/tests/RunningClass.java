package com.Mercury.tests;

import org.testng.annotations.Test;

import com.Mercury.pages.summaryPage;

public class RunningClass {
	public static summaryPage page=new summaryPage();

	@Test
	   public static void mainMethod() {
		
		 
		   page.registration();
		   page.flights();
		   try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   page.summary();

}
}