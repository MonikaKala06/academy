package com.jalaAcademy.testCases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.jalaAcademy.pageObjects.AutoComplete;
import com.jalaAcademy.pageObjects.BaseClass;
import com.jalaAcademy.pageObjects.HomePage;
import com.jalaAcademy.pageObjects.LoginPage;

	public class TC_AutoComplete_015 extends BaseClass{

		@Test
		public void autoComplete() throws InterruptedException
		{

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(baseURL);
			LoginPage lp=new LoginPage(driver);
			lp.Login(driver, username, password);
			
			HomePage hp=new HomePage(driver);
			hp.clickMore();
			hp.clickAutoComplete();
			
			AutoComplete ac=new AutoComplete(driver);
			ac.clickMultiple();
			
		}
	}

