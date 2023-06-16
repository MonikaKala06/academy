package com.jalaAcademy.testCases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.jalaAcademy.pageObjects.BaseClass;
import com.jalaAcademy.pageObjects.CollapsibleContent;
import com.jalaAcademy.pageObjects.HomePage;
import com.jalaAcademy.pageObjects.LoginPage;

public class TC_CollapsibleContent_017 extends BaseClass{

	@Test
	public void collapsibleContent() throws InterruptedException
	{

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(baseURL);
		LoginPage lp=new LoginPage(driver);
		lp.Login(driver, username, password);
		
		HomePage hp=new HomePage(driver);
		hp.clickMore();
		hp.clickCollapsibleContent();
		
		CollapsibleContent cc=new CollapsibleContent(driver);
		cc.clickSignsOf();
	
	
		
}
}
