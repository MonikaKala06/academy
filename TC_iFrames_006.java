package com.jalaAcademy.testCases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.jalaAcademy.pageObjects.BaseClass;
import com.jalaAcademy.pageObjects.HomePage;
import com.jalaAcademy.pageObjects.IFrame;
import com.jalaAcademy.pageObjects.LoginPage;

public class TC_iFrames_006 extends BaseClass{
	@Test
	public void iframe() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(baseURL);
		LoginPage lp=new LoginPage(driver);
		lp.Login(driver, username, password);
		
		HomePage hp=new HomePage(driver);
		hp.clickMore();
		hp.clickiFrames();
		
		IFrame frame=new IFrame(driver);
		frame.iFrameSize();
		frame.clickFrame1();
		frame.clickFrame2();
		frame.clickFrame3();
}}

