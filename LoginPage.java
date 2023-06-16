package com.jalaAcademy.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver ldriver;
public LoginPage(WebDriver rdriver)
{
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
	}

@FindBy(name="UserName")
private WebElement UserName;

@FindBy(name="Password")
private WebElement Password;

@FindBy(id="btnLogin")
private WebElement Login;

public WebElement getUsername()
{
	return UserName;
	}
public WebElement getPassword()
{
	return Password;
	}

public WebElement getSignIn()
{
	return Login;
	}
public void Login(WebDriver driver, String username, String password)
{
	getUsername().sendKeys(username);
	getPassword().sendKeys(password);
	getSignIn().click();
	
	
	}
}
