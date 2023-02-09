package com.nexttechmetanewPageAction;

import org.testng.Assert;

import com.nexttechmetanewPageLocation.NewCartPageLocator;

import newutility.baseclass;

public class NewCartPageAction extends baseclass{
	
	NewCartPageLocator newcartpageLocator = new NewCartPageLocator ();

	public void Verifynewitemaddedtocart () throws Exception{
		Thread.sleep(4000);
		
		boolean newverifycart = newcartpageLocator.VerifynewCart.isDisplayed();
		Assert.assertTrue(newverifycart);
		
	}

}
