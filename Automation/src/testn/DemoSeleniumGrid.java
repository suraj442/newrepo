package testn;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.testng.annotations.Test;


public class DemoSeleniumGrid {
  @Test
//  @Parameters({"nodeURL","browserName"})
  public void demoGridString() throws MalformedURLException {
	  
	 URL url = new URL("http://192.168.0.33:4444/wd/hub");
	 DesiredCapabilities ds = new DesiredCapabilities();
	 ds.setBrowserName("firefox");
	 
	 
	WebDriver driver = new RemoteWebDriver(url, ds) ;
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.google.com");
	
	driver.switchTo().activeElement().sendKeys("selenium Grid");
	
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
