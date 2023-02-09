package newtestrunner;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import newutility.baseclass;

@CucumberOptions(features = {"src/test/resources/featurefilesnew"},
plugin = {"json:target/cucumber.json"},
glue = "newstepdefinition" , tags = {"@newcart"})

public class newtestrunnerclass extends AbstractTestNGCucumberTests{
	

	@BeforeTest
	
	public void ccsetup () {
		
		baseclass test = new baseclass ();
		test.ccbrowserinit();
		
	}
	
	
	@AfterTest
	
	public void cccloseURL () {
		baseclass test = new baseclass ();
		test.driver.quit();
		
		
	}

}