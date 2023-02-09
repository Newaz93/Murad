package newstepdefinition;

import com.nexttechmetanewPageAction.NewCartPageAction;
import com.nexttechmetanewPageAction.NewHomePageAction;

import cucumber.api.java.en.Then;
import newutility.baseclass;
import newutility.metanewutility;

public class newcart extends baseclass {
	
	NewHomePageAction newHomePageAction = new NewHomePageAction ();
	NewCartPageAction newcartpageaction = new NewCartPageAction ();

	@Then("^Click Nokia lumia$")
	public void click_Nokia_lumia() throws Throwable {
		newHomePageAction.ClickNokialumia();
	}

	@Then("^Click add to cart$")
	public void click_add_to_cart() throws Throwable {
		newHomePageAction.Clickaddtocart();
	}
	
	@Then("^Click cart$")
	public void click_cart() throws Throwable {
		newHomePageAction.Clickcart();
	}

	@Then("^Verify new item added to cart$")
	public void verify_new_item_added_to_cart() throws Throwable {
		newcartpageaction.Verifynewitemaddedtocart();
		metanewutility.takeMyScreenshot(driver, "Cart Page");
	}
	
}
