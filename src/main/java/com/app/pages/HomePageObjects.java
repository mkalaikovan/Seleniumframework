package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects extends BasePage{
	@FindBy(xpath = "//a[@title='Women']")
	private WebElement women;
	
	@FindBy(xpath = "(//a[@title='Dresses'])[2]")
	private WebElement dresses;
	
	@FindBy(xpath = "(//a[@title='T-shirts'])[2]")
	private WebElement tshirts;
	
	@FindBy(xpath = "//input[@id='newsletter-input']")
	private WebElement email;
	
	@FindBy(xpath = "//button[@name='submitNewsletter']")
	private WebElement submit;
	
	@FindBy(xpath = "//p[@class='alert alert-success']")
	private WebElement successalert;
					
	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getwomentab() {
		return women;
	}
	
	public WebElement getdressestab() {
		return dresses;
	}

	public WebElement gettshirtstab() {
		return tshirts;
	}
	public WebElement getemail()
	{
		return email;
	}
	public WebElement getsubmit()
	{
		return submit;
	}
	public WebElement successalert()
	{
	return successalert;
	}
	
	
	
	
	
}
