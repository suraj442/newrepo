package hybridFramework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import methodDrivenFramework.Flib;

public class BaseTest implements IAutoConsts{
	
	static WebDriver driver;
	public void openBrowser() throws IOException
	{
		Flib flib=new Flib();
		String browserValue = flib.getPropertydata(PROPERTY_PATH, "browser");
		String url = flib.getPropertydata(PROPERTY_PATH, "url");

		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY,CHEOME_PATH);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
		}

		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY,GECKO_PATH);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
		}
		else
		{
			System.out.println("invalid input");
		}




	}



	public void closeBrowser()
	{
		driver.close();
	}
	
	
	public void quitBrowser()
	{
		driver.quit();
	}
}

