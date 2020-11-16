package Day01.Selenium_Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Verify_Dates {
	//# Verify the current day and dates are present on the Assertion page.
	  
	@Test
	public void Open_Application() {
		
	
	  WebDriver driver = new FirefoxDriver();
	  
	  driver.get("http://borkotmicrotechna.com/");
	 driver.findElement(By.linkText("Assertion")).click();
		  
	 String x = driver.findElement(By.xpath("//h2/span")).getText();
	 System.out.println(x);
	 
	 Assert.assertNotEquals("Tuesday, 28 January 2017", x);
		  
	}

}
