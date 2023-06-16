package com.jalaAcademy.pageObjects;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Links {
	WebDriver ldriver;
	public Links(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		}

	@FindBy(xpath="//a[text()='Working Links']")
	@CacheLookup
	WebElement workingLinks;
	
	@FindBy(xpath="//a[text()='Link 1']")
	@CacheLookup
	WebElement link1;
	
	@FindBy(xpath="//a[text()='Link 2']")
	@CacheLookup
	WebElement link2;
	
	@FindBy(xpath="//a[text()='Link 3']")
	@CacheLookup
	WebElement link3;
	
	@FindBy(xpath="//a[text()='Broken Links']")
	@CacheLookup
	WebElement brokenLinks;
	
	@FindBy(xpath="//a[text()='Image Links']")
	@CacheLookup
	WebElement imageLinks;
	
	@FindBy(xpath="@alt='Growic Link'")
	@CacheLookup
	WebElement growicLink;
	
	@FindBy(xpath="@alt='Linkedin Link'")
	@CacheLookup
	WebElement linkedinLink;
	
	@FindBy(xpath="@alt='Goggle Link'")
	@CacheLookup
	WebElement googleLink;
	
	@FindBy(xpath="@alt='Jala Technologies Link'")
	@CacheLookup
	WebElement jalaTechnolgiesLink;
	
	@FindBy(xpath="//a[text()='Status Codes']")
	@CacheLookup
	WebElement statusCodes;
	
	@FindBy(xpath="//a[text()='200']")
	@CacheLookup
	WebElement code200;
	
	@FindBy(xpath="//a[text()='301']")
	@CacheLookup
	WebElement code301;
	
	@FindBy(xpath="//a[text()='404']")
	@CacheLookup
	WebElement code404;
	
	@FindBy(xpath="//a[text()='500']")
	@CacheLookup
	WebElement code500;
	
	public void clickWorkingLinks()
	{
		workingLinks.click();
		}
	public void clickLink1()
	{
		link1.click();
		}
	public void clickLink2()
	{
		link2.click();
		}
	public void clickLink3()
	{
		link3.click();
		}
	public void clickBrokenLinks()
	{
		brokenLinks.click();
		}
	public void clickImageLinks()
	{
		imageLinks.click();
		}
	public void clickGrowicLink()
	{
		growicLink.click();
		}
	public void clickLinkedinLink()
	{
		linkedinLink.click();
		}
	public void clickGoogleLink()
	{
		googleLink.click();
		}
	public void clickJalaTechnolgiesLink()
	{
		jalaTechnolgiesLink.click();
		}
	public void clickStatusCodes()
	{
		statusCodes.click();
		}
	public void clickCode200()
	{
		code200.click();
		}
	public void clickCode301()
	{
		code301.click();
		}
	public void clickCode404()
	{
		code404.click();
		}
	public void clickCode500()
	{
		code500.click();
		}
	
	

    // Find all links on the page
    List<WebElement> links = 

    // Store the URLs in a list
    List<String> urls = new ArrayList<>();
    for (WebElement link : links) {
        String url = link.getAttribute("href");
        if (url != null && !url.isEmpty()) {
            urls.add(url);
        }
    }

    // Check each URL for broken links
    for (String url : urls) {
        ldriver.get(url);
        if (ldriver.getTitle().contains("404") || ldriver.getTitle().contains("Not Found")) {
            System.out.println("Broken link: " + url);
        }
    }

    // Close the browser
    driver.quit();
}
}
	
	//List<WebElement> links=ldriver.findElements(By.tagName("a"));
	
	//List<String> urlList=new ArrayList<String>();
	
	//for(WebElement e:links)
	//{
		//String url=e.getAttribute("href");
		//urlList.add(url);		

   // public void checkBrokenLink() throws IOException 
  //  {
	// url=new URL(linkUrl);
    	//link1.click();
	//HttpURLConnection httpUrlConnection=(HttpURLConnection) url.openConnection();
	//httpUrlConnection.setConnectTimeout(5000);
	//httpUrlConnection.connect();
	
	//if(httpUrlConnection.getResponseCode()>=400)
	//{
	//	System.out.println(linkUrl +"--->" +httpUrlConnection.getResponseMessage()+"is a broken link");
	//}
	//else
	//{
		//System.out.println(linkUrl +"--->" +httpUrlConnection.getResponseMessage());
	//}
//}
//}

