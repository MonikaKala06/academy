package com.jalaAcademy.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MultipleTabs {
	WebDriver ldriver;
	public MultipleTabs(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		}
	
	@FindBy(xpath="//a[contains(.,'Plan to Succeed')]")
	WebElement PlanToSucceed;
	
	@FindBy(xpath="//a[contains(.,'UnLearning')]")
	WebElement UnLearning;
	
	@FindBy(xpath="//a[contains(.,'Ways of Unlearning')]")
	WebElement WaystoUnLearning;
	
	public void clickPlanToSucceed()
	{
		PlanToSucceed.click();
		Actions action=new Actions(ldriver);
		action.contextClick();
		action.sendKeys(Keys.ARROW_DOWN);
		}
	public void clickUnLearning()
	{
		UnLearning.click();
		Actions action=new Actions(ldriver);
		action.contextClick();
		action.sendKeys(Keys.ARROW_DOWN);
		}
	public void clickWaystoUnLearning()
	{
		WaystoUnLearning.click();
		Actions action=new Actions(ldriver);
		action.contextClick();
		action.sendKeys(Keys.ARROW_DOWN);
		}
}
	
	
