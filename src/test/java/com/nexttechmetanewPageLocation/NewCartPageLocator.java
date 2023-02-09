package com.nexttechmetanewPageLocation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import newutility.baseclass;

public class NewCartPageLocator extends baseclass {

public NewCartPageLocator () {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//td[text()='Nokia lumia 1520']")
	public WebElement VerifynewCart;
	
	
	

}	
	
	

