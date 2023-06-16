package com.jalaAcademy.testCases;

import java.awt.AWTException;
import java.time.Duration;

import org.testng.annotations.Test;

import com.jalaAcademy.pageObjects.BaseClass;
import com.jalaAcademy.pageObjects.HomePage;
import com.jalaAcademy.pageObjects.Images;
import com.jalaAcademy.pageObjects.LoginPage;

public class TC_Images_018 extends BaseClass{
	@Test
	public void alertBox() throws InterruptedException, AWTException
	{

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(baseURL);
		LoginPage lp=new LoginPage(driver);
		lp.Login(driver, username, password);
		
		HomePage hp=new HomePage(driver);
		hp.clickMore();
		hp.clickImages();
		
		Images i=new Images(driver);
		i.clickChooseFile();
	
	}}
	
