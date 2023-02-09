package com.nexttechmetanewPageLocation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import newutility.baseclass;

public class NewAccountPageLocator extends baseclass{

public NewAccountPageLocator () {
		
		PageFactory.initElements(driver, this);	
			
	}
	
	@FindBy(id="nameofuser")
	public WebElement Accountprofile;
	
}
