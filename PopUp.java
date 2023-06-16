package com.jalaAcademy.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PopUp {

	WebDriver ldriver;
	public PopUp(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		}
	
	@FindBy(xpath="//a[contains(.,'Popups')]")
	WebElement PopUps;

	@FindBy(id="btn-one")
	WebElement PopupOne;
	
	@FindBy(id="btn-two")
	WebElement PopupTwo;
	
	@FindBy(id="btn-three")
	WebElement PopupThree;
	
	@FindBy(id="btn-four")
	WebElement PopupDuplicate;
	
	@FindBy(id="btn-five")
	WebElement DuplicateTab;
	
	@FindBy(id="btn-six")
	WebElement WindowPopUp;
	
	@FindBy(id="alertBox")
	WebElement AlertBox;
	
	@FindBy(id="confirmBox")
	WebElement ConfirmBox;
	
	@FindBy(id="promptBtn")
	WebElement PromptBox;
	
	public void clickPopUps()
	{
		PopUps.click();
		}
	
	public void clickPopupOne()
	{
		PopupOne.click();
		}
	public void clickPopupTwo()
	{
		PopupTwo.click();
		}
	public void clickPopupThree()
	{
		PopupThree.click();
		}
	public void clickPopupDuplicate()
	{
		PopupDuplicate.click();
		}
	
	public void clickDuplicateTab()
	{
		DuplicateTab.click();
		}
	public void clickWindowPopUp()
	{
		WindowPopUp.click();
		
		}
	public void clickAlertBox()
	{
		AlertBox.click();
		}
	public void clickConfirmBox()
	{
		ConfirmBox.click();
		}
	public void clickPromptBox()
	{
		PromptBox.click();
		String buttonText=PromptBox.getAttribute("id");
		System.out.println(buttonText);
		}
}

