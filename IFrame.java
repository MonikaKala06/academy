package com.jalaAcademy.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IFrame{
	WebDriver ldriver;
	public IFrame(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		}
	
	@FindBy(xpath="//iframe[@id='iframe1']")
	WebElement Frame1;
	
	@FindBy(xpath="//iframe[@id='iframe2']")
	WebElement Frame2;
	
	@FindBy(xpath="//iframe[@id='iframe3']")
	WebElement Frame3;
	
	
	public void iFrameSize()
	{
		int size=ldriver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of frames are "+size);
	}
	
	public void clickFrame1()
	{
		ldriver.switchTo().frame(1);
	}
	
	public void clickFrame2()
	{
		ldriver.switchTo().frame(2);
	}
	
	public void clickFrame3()
	{
		ldriver.switchTo().frame(3);
	}
}
