package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;



public class Base
{
	
	
	  public static WebDriver driver=null; 
	  public static ExtentReports reports;
	  public static ExtentTest test; 
	  ExtentReports extent;
	 

	@BeforeTest

	public void initialize() throws Exception
	{
		System.out.println("driver initialised");
		 System.setProperty("webdriver.chrome.driver","D:\\Selenium files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 
			 driver=new ChromeDriver();
				 
	}
	
	 @AfterTest 
	 
	 public void tearDown() throws Exception
	 { 
		 driver.quit(); 
		 }
	
}
