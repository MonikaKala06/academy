package com.jalaAcademy.testCases;
import java.time.Duration;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.jalaAcademy.pageObjects.BaseClass;
import com.jalaAcademy.pageObjects.LoginPage;


public class TC_LoginTest001 extends BaseClass
{
	
@Test
public void loginTest() throws InterruptedException
{

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(baseURL);
	LoginPage lp=new LoginPage(driver);
	lp.Login(driver, username, password);
	System.out.println("Title of the Page is "+driver.getTitle());
	if(driver.getTitle().equals("Login"))
	{
		Assert.assertTrue(true);
	}
	else
	{
		Assert.assertTrue(false);
	}
}
}
