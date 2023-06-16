package com.jalaAcademy.pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver ldriver;
	public HomePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		}

	@FindBy(xpath="//a[contains(.,'More')]")
	WebElement More;

	@FindBy(xpath="//a[contains(.,'Multiple Tabs')]")
	WebElement MultipleTabs;
	
	@FindBy(xpath="//a[contains(.,'Menu')]")
	WebElement Menu;

	@FindBy(xpath="//a[contains(.,'Autocomplete')]")
     WebElement AutoComplete;

	@FindBy(xpath="//a[contains(.,'Collapsible Content')]")
	WebElement CollapsibleContent;
	
	@FindBy(xpath="//a[contains(.,'Images')]")
	WebElement Images;
	
	@FindBy(xpath="//a[contains(.,'Slider')]")
	WebElement Slider;

	@FindBy(xpath="//a[contains(.,'Tooltips')]")
	WebElement Tooltips;
	
	@FindBy(xpath="//a[contains(.,'Popups')]")
	WebElement Popups;
	
	@FindBy(xpath="//a[contains(.,'Links')]")
	WebElement Links;

	@FindBy(xpath="//a[contains(.,'CSS Properties')]")
	WebElement CSSProperties;
	
	@FindBy(xpath="//a[contains(.,'iFrames')]")
	WebElement iFrames;
	
	
	public void clickMore()
	{
		More.click();
		}
	public void clickMultipleTabs()
	{
		MultipleTabs.click();;
		}
	public void clickMenu()
	{
		Menu.click();
		}
	public void clickAutoComplete()
	{
		AutoComplete.click();
		}
	public void clickCollapsibleContent()
	{
		CollapsibleContent.click();
		}
	public void clickImages()
	{
		Images.click();
		}
	public void clickSlider()
	{
		Slider.click();
		}
	public void clickTooltips()
	{
		Tooltips.click();
		}
	public void clickPopUps()
	{
		Popups.click();
		}
	public void clickLinks()
	{
	     Links.click();
		}
	public void clickCSSProperties()
	{
	    CSSProperties.click();
		}
	public void clickiFrames()
	{
		iFrames.click();
		}
}
