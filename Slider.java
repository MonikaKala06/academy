package com.jalaAcademy.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Slider {
	WebDriver ldriver;
	public Slider(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		}

	@FindBy(xpath="//div[contains(@class='slider-handle')]")
	@CacheLookup
	WebElement slider;
	
	public void moveSlider()
	{
		Actions action = new Actions(ldriver);
		action.dragAndDropBy(slider, 50, 0).build().perform();
		 
		}
}
