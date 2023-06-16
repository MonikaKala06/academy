package com.jalaAcademy.pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class CollapsibleContent {
	WebDriver ldriver;
	public CollapsibleContent(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		}
	
	@FindBy(xpath="//a[contains(.,'Know your goals')]")
	WebElement KnowYourGoals;

	@FindBy(xpath="//a[contains(.,'Be focused')]")
	WebElement BeFocused;
	
	@FindBy(xpath="//a[contains(.,'Chose the right')]")
	WebElement ChooseTheRight;
	
	@FindBy(xpath="//a[contains(.,'Collabarote with')]")
	WebElement CollabarateWith;
	
	@FindBy(xpath="//a[contains(.,'Learn Anything')]")
	WebElement LearnAnything;
	
	@FindBy(xpath="//a[contains(.,'Reasons People')]")
	WebElement Reasons;
	
	@FindBy(xpath="//a[contains(.,'Signs of')]")
	WebElement SignsOf;
	
	@FindBy(xpath="//a[contains(.,'Single Collapse')]")
	WebElement SingleCollapse;
	
	@FindBy(xpath="//a[contains(.,'Multiple Collapse')]")
	WebElement MultipleCollapse;
	
	
	public void clickKnowYourGoals()
	{
		SingleCollapse.click();
		KnowYourGoals.click();
		String classname1=KnowYourGoals.getAttribute("class name is +class");
		System.out.println(classname1);
		if(classname1==null) {
			Assert.assertTrue(true,"Test RadioButton is pass");
		}
		else {
			Assert.assertTrue(false,"Test RadioButton is pass");
		}
		}
	
	public void clickBeFocused()
	{
		SingleCollapse.click();
		BeFocused.click();
		String classname=BeFocused.getAttribute("class name is +class");
		System.out.println(classname);
		if(classname==null) {
			Assert.assertTrue(true,"Test RadioButton is pass");
		}
		else {
			Assert.assertTrue(false,"Test RadioButton is pass");
		}
		}
	
	public void clickChooseTheRight()
	{
		SingleCollapse.click();
		ChooseTheRight.click();
		String classname2=ChooseTheRight.getAttribute("class name is +class");
		System.out.println(classname2);
		if(classname2==null) {
			Assert.assertTrue(true,"Test RadioButton is pass");
		}
		else {
			Assert.assertTrue(false,"Test RadioButton is pass");
		}
		}
	
	public void clickCollabarateWith()
	{
		MultipleCollapse.click();
		CollabarateWith.click();
		String classname3=CollabarateWith.getAttribute("class name is +class");
		System.out.println(classname3);
		if(classname3==null) {
			Assert.assertTrue(true,"Test RadioButton is pass");
		}
		else {
			Assert.assertTrue(false,"Test RadioButton is pass");
		}
		}
	
	public void clickLearnAnything()
	{
		MultipleCollapse.click();
		LearnAnything.click();
		String classname4=LearnAnything.getAttribute("class name is +class");
		System.out.println(classname4);
		if(classname4==null) {
			Assert.assertTrue(true,"Test RadioButton is pass");
		}
		else {
			Assert.assertTrue(false,"Test RadioButton is pass");
		}
		}
	public void clickReasons()
	{
		MultipleCollapse.click();
		Reasons.click();
		String classname5=Reasons.getAttribute("class name is +class");
		System.out.println(classname5);
		if(classname5==null) {
			Assert.assertTrue(true,"Test RadioButton is pass");
		}
		else {
			Assert.assertTrue(false,"Test RadioButton is pass");
		}
		}
	public void clickSignsOf()
	{
		MultipleCollapse.click();
		SignsOf.click();
		String classname6=SignsOf.getAttribute("class name is +class");
		System.out.println(classname6);
		if(classname6==null) {
			Assert.assertTrue(true,"Test RadioButton is pass");
		}
		else {
			Assert.assertTrue(false,"Test RadioButton is pass");
		}
		}
}

