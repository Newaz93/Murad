package com.nexttechmetanewPageAction;

import org.testng.Assert;

import com.nexttechmetanewPageLocation.NewAccountPageLocator;

import newutility.baseclass;

public class NewAccountPageAction extends baseclass{

	NewAccountPageLocator newaccountPageLocator =new NewAccountPageLocator ();
	
	public void Verifyusercanloginwithvalidcrad () throws Exception {
		
		Thread.sleep(5000);
		boolean newverfiyaccountprofile= newaccountPageLocator.Accountprofile.isDisplayed();
		Assert.assertTrue(newverfiyaccountprofile);
	}
}
