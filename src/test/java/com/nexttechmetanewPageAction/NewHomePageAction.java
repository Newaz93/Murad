package com.nexttechmetanewPageAction;

import com.nexttechmetanewPageLocation.NewHomePageLocator;

import newutility.baseclass;

public class NewHomePageAction extends baseclass{
	
	NewHomePageLocator newHomePageLocator = new NewHomePageLocator ();
	
	public void ClickLoginlink () throws Exception {
		
		Thread.sleep(5000);
		
		newHomePageLocator.LoginLink.click();
	
	Thread.sleep(5000);
	}
	
	public void ClickNokialumia () {
		
		newHomePageLocator.Nokialumia.click();	
	}
	
	public void Clickaddtocart () throws Exception {
		
		newHomePageLocator.NokiaAddtoCart.click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
	}
	
	public void Clickcart () {
		
		newHomePageLocator.ClickCartLink.click();
		
	}
}
