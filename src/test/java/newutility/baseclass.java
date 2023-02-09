package newutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {
	
	public static Properties ccprop;
	public static WebDriver driver;
	
	public baseclass () {
		
		
		try {
			FileInputStream files = new FileInputStream (System.getProperty("user.dir") + "\\src\\test\\java\\com\\nexttechmetanewConfig\\nexttechmetanew.properties");
			
			ccprop = new Properties ();
			ccprop.load(files);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void ccbrowserinit () {
		
		
	String ccbrowser = ccprop.getProperty("Browser1");
	
	if(ccbrowser.equalsIgnoreCase("Chrome")) {
		
		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\WebDriver\\chromedriver.exe" );
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));  

	}
		
	else if (ccbrowser.equalsIgnoreCase("Firefox")) {
		
	}	
		
	}
	
	
	 public static void cclaunchURL( String URL) {
		 
		 driver.get(ccprop.getProperty("URL1"));
		 
		 
	 }
		
		
		
		
	}


