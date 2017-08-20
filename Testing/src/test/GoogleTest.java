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
        driver.get("http://www.flipkart.com");
        String country = "Canada";
        if (country.equalsIgnoreCase("Canada")){
        driver.navigate().to("www.amzon.ca");
        }
        if (country.equalsIgnoreCase("india")){
        driver.navigate().to("www.amazon.in");
        }

	}

}
