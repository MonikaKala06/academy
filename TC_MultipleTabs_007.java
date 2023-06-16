package com.jalaAcademy.testCases;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.testng.annotations.Test;

import com.jalaAcademy.pageObjects.BaseClass;
import com.jalaAcademy.pageObjects.HomePage;
import com.jalaAcademy.pageObjects.LoginPage;
import com.jalaAcademy.pageObjects.MultipleTabs;

public class TC_MultipleTabs_007 extends BaseClass
{
	@Test
	public void multipletabs() throws InterruptedException
	{

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(baseURL);
		LoginPage lp=new LoginPage(driver);
		lp.Login(driver, username, password);
		
		HomePage hp=new HomePage(driver);
		hp.clickMore();
		hp.clickMultipleTabs();
		
		MultipleTabs mt=new MultipleTabs(driver);
		mt.clickPlanToSucceed();
		
		Set<String> windowIDs=driver.getWindowHandles();
		System.out.println(windowIDs);
		
		ArrayList windowIDsList=new ArrayList(windowIDs);
		
		String firstWindowID= (String) windowIDsList.get(0);
		String secondWindowID = (String) windowIDsList.get(1);
		String thirdWindowID = (String) windowIDsList.get(2);
		
		System.out.println("First Window Id" +firstWindowID);
		System.out.println("Second Window Id" +secondWindowID);
		System.out.println("Third Window Id" +thirdWindowID);
		
		driver.switchTo().window(thirdWindowID);
		
}}
