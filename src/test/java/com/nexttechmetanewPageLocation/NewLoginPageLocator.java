package com.nexttechmetanewPageLocation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import newutility.baseclass;

public class NewLoginPageLocator extends baseclass {
 
	public NewLoginPageLocator () {
		
		PageFactory.initElements(driver, this);	
			
	}
	
	@FindBy(id="loginusername")
	public WebElement Username;
	
	@FindBy(id="loginpassword")
	public WebElement Password;
	
	@FindBy(xpath="//button[text()='Log in']")
	public WebElement LoginButton;
}
