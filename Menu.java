package com.jalaAcademy.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Menu {
	WebDriver ldriver;
	public Menu(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		}

	@FindBy(xpath="//a[contains(text(),'Single Menus')]")
	WebElement SingleMenu;
	
	@FindBy(xpath="//a[contains(text(),'Sub Menus')]")
	WebElement SubMenu;
	
	@FindBy(id="b1")
	WebElement Testing;
	
	@FindBy(id="b2")
	WebElement Java;
	
	@FindBy(id="b3")
	WebElement DotNet;
	
	@FindBy(id="b4")
	WebElement Database;
	
	@FindBy(xpath="//a[contains(.,'Testing')]")
	WebElement subTesting;
	
	@FindBy(xpath="//a[contains(.,'Selenium')]")
	WebElement Selenium;
	
	@FindBy(xpath="//a[contains(.,'Manual Testing')]")
	WebElement Manualtesting;
	
	@FindBy(xpath="//a[contains(.,'DB Testing')]")
	WebElement DbTesting;
	
	@FindBy(xpath="//a[contains(.,'Unit Testing')]")
	WebElement UnitTesting;
	
	@FindBy(xpath="//a[contains(.,'JAVA')]")
	WebElement subJava;
	
	@FindBy(xpath="//a[contains(.,'.Net')]")
	WebElement subDotNet;
	
	@FindBy(xpath="//a[contains(.,'Database')]")
	WebElement subDatabase;
	
	public void clickSingleMenu()
	{
		SingleMenu.click();
	}
	public void clickSubMenu()
	{
		SubMenu.click();
	}	
	public void clickTesting()
	{
		Testing.click();
		System.out.println(Testing.getText());
	}
	public void clickJava()
	{
		Java.click();
	}
	public void clickDotNet()
	{
		DotNet.click();
	}
	public void clickDataBase()
	{
		Database.click();
	}	
	public void clicksubTesting()
	{
		Testing.click();
	}
	
	public void clickSelenium()
	{
		Selenium.click();
	}
	public void clickManualTesting()
	{
		Manualtesting.click();
	}
	public void clickDBTesting()
	{
		DbTesting.click();
	}	
	public void clickUnitTesting()
	{
		UnitTesting.click();
	}
	public void clicksubJava()
	{
		Java.click();
	}
	public void clicksubDotNet()
	{
		DotNet.click();
	}
	public void clicksubDataBase()
	{
		Database.click();
		
	}	
	public void clicksubUnitTesting()
	{
		UnitTesting.click();
	}
	}
