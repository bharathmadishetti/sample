package test;

import java.text.SimpleDateFormat;

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
			
			driver = new FirefoxDriver();
	        //driver = new FirefoxDriver();
	        //not a testing files
	        //hello
	        driver.get("http://www.flipkart.com");
	        

	}
	
	
}
