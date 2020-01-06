package com.app.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DressPageTest {
	public WebDriver driver;
	/*BasePage bp;
	DressPageObjects dp;
	
	public DressPageTest()
	{
		bp = new BasePage();
		dp = new DressPageObjects();
	}
	
	@Test
	public void verifydressestab() {
		dp.getdressestab().click();
		Assert.assertTrue(bp.elementFound(dp.getdressestab()),"dresses Not found");
	}
	
	@Test
	public void verifychkbox()
	{
		dp.getdressestab().click();
		Assert.assertTrue(bp.elementFound(dp.chkboxsmall()),"Not found");
		Assert.assertTrue(bp.elementFound(dp.chkboxmedium()),"Not found");
		Assert.assertTrue(bp.elementFound(dp.chkboxlarge()),"Not found");
	}
	@Test
	public void verifyfiveproductstitle()
	{
		Assert.assertTrue(bp.elementFound(dp.titleproducts())," product not found");
		
	}*/
	@BeforeMethod
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pranith\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	@org.testng.annotations.Parameters({"username","password"})
	public void verifylogin(String username,String password)
	{
		driver.findElement(By.id("txtUsername")).sendKeys("username");
		driver.findElement(By.id("txtPassword")).sendKeys("password");
		driver.findElement(By.id("btnLogin")).click();
	}
}
