package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleTest {

	@Test
	public void t(){
		 WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "browsers/geckodriver.exe");
        driver = new FirefoxDriver();
        //test2
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
