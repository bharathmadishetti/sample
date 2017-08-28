package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GoogleTest {

	@Test
	public void t(){
		 WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "browsers/geckodriver.exe");
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile myprofile = profile.getProfile("default");
		driver = new FirefoxDriver(myprofile);
        //driver = new FirefoxDriver();
        //not a testing files
        //hello
        driver.get("http://www.flipkart.com");
        String country = "Canada";
        //testing
        //based on country 
        if (country.equalsIgnoreCase("Canada")){
        driver.navigate().to("www.amzon.ca");
        }
        if (country.equalsIgnoreCase("india")){
        driver.navigate().to("www.amazon.com");
        }
        
      

	}
	
	
}
