package parallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ActiTimeTest {
	WebDriver driver;

	@Test
	public void createUser()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		//Reporter.log("Hi I Have created the user"+" | "+Thread.currentThread().getId(),true);
	}

	
	
	@Test
	public void createReport()
	{
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		//Reporter.log("Hi I Have created the user"+" | "+Thread.currentThread().getId(),true);
	}
	
	
	
	
	@Test
	public void testSeleniumdev()
	{
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		//Reporter.log("Hi I Have created the user"+" | "+Thread.currentThread().getId(),true);
	}
	
	
	
	
	
	
	
	
	
	
}
