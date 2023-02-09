package com.nexttechmetanewPageAction;

import com.nexttechmetanewPageLocation.NewLoginPageLocator;

import newutility.baseclass;


public class NewLoginPageAction extends baseclass{

	NewLoginPageLocator newloginpagelocator = new NewLoginPageLocator ();
	 public void newmetaLoginCred (String u, String p) {
		
		 newloginpagelocator.Username.sendKeys(u);
		 newloginpagelocator.Password.sendKeys(p);
		 newloginpagelocator.LoginButton.click();
		 
	 }
	
}
