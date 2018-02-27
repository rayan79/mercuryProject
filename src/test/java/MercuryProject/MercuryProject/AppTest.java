package MercuryProject.MercuryProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest 
    
{
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
	
	
	
	
	
   static WebDriver driver;
   
   @Test
   public static void mainMethod() {
	   driver.findElement(By.linkText("REGISTER")).click();
	   registration();
	   
	 
	 
	 
	   
   }
   public static void registration() {
	   enterText(firstNameXpath,firstname);
	   enterText(lasttNameXpath,lastname);
	   enterText(phoneXpath,phone);
	   enterText(emailXpath,email);
	   enterText(addressXpath,address);
	   enterText(CityXpath,city);
	   enterText(StateXpath,state);
	   enterText(PostalXpath,postal);
	   enterText(CountryXpath,country);
	   enterText(PasswordXpath,password);
	   enterText(ConfirmPasswordXpath,password);
	   click(SumbitXpath);
	   
   }
  @BeforeTest
   public static void goToUrl() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rayhan\\Downloads\\java\\Driver\\chromedriver_win32\\chromedriver.exe");
	   driver=new ChromeDriver();
	 driver.get("http://newtours.demoaut.com/mercurywelcome.php");
   }
   public static void enterText(String xpath,String input) {
	   driver.findElement(By.xpath(xpath)).sendKeys(input);
	   
   }
   public static void click(String xpath) {
	   
	   driver.findElement(By.xpath(xpath)).click();
	   
   }
}
