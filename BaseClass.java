package com.jalaAcademy.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public String baseURL="https://magnus.jalatechnologies.com/";
	public String username="training@jalaacademy.com";
	public String password="jobprogram";
	public static WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver2.exe" );
		driver=new ChromeDriver();	
	}
	
	@AfterClass
	public void tearDown()
	{
	driver.quit();
		
	}
}
	


