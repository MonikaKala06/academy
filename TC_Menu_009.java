package com.jalaAcademy.testCases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.jalaAcademy.pageObjects.BaseClass;
import com.jalaAcademy.pageObjects.HomePage;
import com.jalaAcademy.pageObjects.LoginPage;
import com.jalaAcademy.pageObjects.Menu;

public class TC_Menu_009 extends BaseClass {

	@Test
	public void singleMenu() throws InterruptedException
	{
     	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(baseURL);
		LoginPage lp=new LoginPage(driver);
		lp.Login(driver, username, password);
		
		HomePage hp=new HomePage(driver);
		hp.clickMore();
		hp.clickMenu();
		
		Menu m=new Menu(driver);
		m.clickTesting();
	}		
}
