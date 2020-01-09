package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressPageObjects extends BasePage {


	@FindBy(xpath = "(//a[@title='Dresses'])[2]")
	private WebElement dresses;
	
	@FindBy(xpath = "(//a[contains(@href,'size-s')])[1]")
	private WebElement sizesmall;
	
	@FindBy(xpath = "//a[contains(@href,'size-m')]")
	private WebElement sizemedium;
	
	@FindBy(xpath = "//a[contains(@href,'size-l')]")
	private WebElement sizelarge;
	
	@FindBy(xpath = "//span[@class='heading-counter']")
	private WebElement 	fiveproducts;
	
	
	public DressPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getdressestab3() {
		return dresses;
	}
	public WebElement chkboxsmall()
	{
		return sizesmall;
	}
	public WebElement chkboxmedium()
	{
		return sizemedium;
	}
	public WebElement chkboxlarge()
	{
		return sizelarge;
	}
	
	public WebElement titleproducts()
	{
		return fiveproducts;
	}
	
}
