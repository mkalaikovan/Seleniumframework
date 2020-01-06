package com.app.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.BasePage;
import com.app.pages.HomePageObjects;

public class HomePageTest {
	
	BasePage bp;
	HomePageObjects hp;
	
	public HomePageTest()
	{
		bp = new BasePage();
		hp = new HomePageObjects();
	}
	
	@Test
	public void verifydisplayalltab() {
		Assert.assertTrue(bp.elementFound(hp.getwomentab()),"Not found");
		Assert.assertTrue(bp.elementFound(hp.getdressestab()),"dresses Not found");
		Assert.assertTrue(bp.elementFound(hp.gettshirtstab()),"tshirt Not found");
		//System.out.println();
	}
	
	@Test
	public void verifywomentab()
	{
		hp.getwomentab().click();
		Assert.assertTrue(hp.getTitlte().contains("Women"),"Women not found");
		
	}
	@Test
	public void verifydressestab()
	{
		hp.getdressestab().click();
		Assert.assertTrue(hp.getTitlte().contains("Dresses"),"Dresses not found");
	}
	@Test
	public void verifytshirttab()
	{
		hp.gettshirtstab().click();
		Assert.assertTrue(hp.getTitlte().contains("T-shirt"),"t shirt not found");
	}
	@Test
	public void verifyemailtab()
	{
		hp.setText(hp.getemail(),"mdfhhhsl5dsa1@gmail.com");
		hp.getsubmit().click();
		Assert.assertTrue(hp.elementFound(hp.successalert()),"Failed");
		
	}
	
}
