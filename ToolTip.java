package com.jalaAcademy.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToolTip {
	WebDriver ldriver;
	public ToolTip(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		}

	@FindBy(id="btnTooltip")
	@CacheLookup
	WebElement btnTooltip;
	
	public void movetoToolTip()
	{
		Actions actions = new Actions(ldriver);
		 actions.moveToElement(btnTooltip).build().perform();
		}
	public void clickToolTip()
	{
		btnTooltip.click();
		}
}
