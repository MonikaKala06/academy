package com.jalaAcademy.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoComplete {
	WebDriver ldriver;
	public AutoComplete(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//a[contains(.,'Single Values')]")
	WebElement SingleValues;

	@FindBy(id="txtSingleAutoComplete")
	WebElement SingleTxtBox;

	@FindBy(xpath="//a[contains(.,'Multiple Values')]")
	WebElement MultipleValues;

	@FindBy(id="txtMultipleAutoComplete")
	WebElement MultipleTxtBox;

	public void clickSingle()
	{
		SingleValues.click();
		SingleTxtBox.sendKeys("on");
	}
	public void clickMultiple()
	{
		MultipleValues.click();
		MultipleTxtBox.sendKeys("on");
	}
}