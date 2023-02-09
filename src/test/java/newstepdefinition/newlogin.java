package newstepdefinition;

import com.nexttechmetanewPageAction.NewAccountPageAction;
import com.nexttechmetanewPageAction.NewHomePageAction;
import com.nexttechmetanewPageAction.NewLoginPageAction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import newutility.baseclass;
import newutility.metanewutility;

public class newlogin extends baseclass {
	
	NewLoginPageAction newLoginPageAction = new NewLoginPageAction();
	NewHomePageAction newHomePageAction = new NewHomePageAction ();
	NewAccountPageAction newAccountPageAction = new NewAccountPageAction();

@Given("^launch \"([^\"]*)\"$")
public void launch(String URL) throws Throwable {
	
	cclaunchURL(URL);	
   
}


@Then("^Click Login Link$")
public void click_Login_Link() throws Throwable {
	
	newHomePageAction.ClickLoginlink();
    
	
}
@Then("^Enter Username and Enter Password and Click Login button$")
public void enter_Username_and_Enter_Password_and_Click_Login_button() throws Throwable {
   
	newLoginPageAction.newmetaLoginCred(ccprop.getProperty("UserName1"), ccprop.getProperty("Password1"));
}

@Then("^Verify user can login with valid crad$")
public void verify_user_can_login_with_valid_crad() throws Throwable {
	newAccountPageAction.Verifyusercanloginwithvalidcrad();
	
	metanewutility.takeMyScreenshot(driver, "New Account Profile Page");
}
}
