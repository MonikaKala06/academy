package com.jalaAcademy.testCases;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.jalaAcademy.pageObjects.BaseClass;
import com.jalaAcademy.pageObjects.HomePage;
import com.jalaAcademy.pageObjects.LoginPage;
import com.jalaAcademy.pageObjects.PopUp;

public class TC_PromptBox_003  extends BaseClass
{
	@Test
	public void promptBox() throws InterruptedException
	{

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(baseURL);
		LoginPage lp=new LoginPage(driver);
		lp.Login(driver, username, password);
		
		HomePage hp=new HomePage(driver);
		hp.clickMore();
		hp.clickPopUps();
		
		PopUp pu=new PopUp(driver);
		pu.clickPromptBox();
		Alert alert = driver.switchTo().alert();
		//String alertMessage = driver.switchTo().alert().getText();
		//System.out.println(alertMessage);
		//alert.sendKeys("Monika");
		alert.dismiss();
		
			
	}
	}

