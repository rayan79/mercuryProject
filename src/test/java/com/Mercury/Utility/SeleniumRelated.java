package com.Mercury.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class SeleniumRelated {
	 static WebDriver driver;
	 public static void enterText(String xpath,String input) {
		   driver.findElement(By.xpath(xpath)).sendKeys(input);
		   
	   }
	 
	   public static void click(String xpath) {
		   
		   driver.findElement(By.xpath(xpath)).click();
		   
	   }
	   
	   
	   public static void goToUrl() {
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rayhan\\Downloads\\java\\Driver\\chromedriver_win32\\chromedriver.exe");
		   driver=new ChromeDriver();
		 driver.get("http://newtours.demoaut.com/mercurywelcome.php");
	   }
	   public static void selectDropDown(String dropdown,String input) {
		  Select sel =new Select(driver.findElement(By.name(dropdown)));
		  sel.selectByVisibleText(input);
		   
	   }

}
