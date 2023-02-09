package com.nexttechmetanewPageLocation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import newutility.baseclass;

public class NewHomePageLocator extends baseclass{
	
	
	
public NewHomePageLocator () {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="login2")
	public WebElement LoginLink;
	
	@FindBy(xpath="//a[text()='Nokia lumia 1520']")
	public WebElement Nokialumia;
	
	@FindBy(xpath="//a[text()='Add to cart']")
	public WebElement NokiaAddtoCart;
	
	@FindBy(xpath="//a[text()='Cart']")
	public WebElement ClickCartLink;
	
	
}
