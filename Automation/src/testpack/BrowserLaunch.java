package testpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserLaunch {
	WebDriver driver;


    @Parameters("browserValue")
	@Test
	
	public void setUp(String browserName) throws InterruptedException
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			Thread.sleep(3000);
			driver.switchTo().activeElement().sendKeys("Hi I have been executed in chrome");
		}


		else if(browserName.equalsIgnoreCase("firefox"));
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			Thread.sleep(3000);
			driver.switchTo().activeElement().sendKeys("Hi I have been executed in firfox");
			
			
		}



	}

}
