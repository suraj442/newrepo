package testpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Parallel3 {
	
	WebDriver driver;
	@Test
	public void Test3()
	{
		Reporter.log("Hi I am Test3 ",true);
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    driver=	new ChromeDriver();
	    driver.get("https://www.gmail.com");
	}

}
