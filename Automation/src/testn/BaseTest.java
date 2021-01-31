package testn;


	import java.io.File;
	import java.io.IOException;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

import keywordDrivenFramework.Flib;

	public class BaseTest {
		static WebDriver driver;

		public void openBrowser() throws IOException
		{
			
		Flib flib = new Flib();
		String browserValue = flib.readPropFile("./data/config.properties", "browser");
		String url = flib.readPropFile("./data/config.properties", "url");
		
		if(browserValue.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(url);
		}
		else if(browserValue.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get(url);
		}
		else
		{
			System.out.println("enter valid input");
		}
		}
		
		
		public void closeBrowser()
		{
			driver.close();
		}
		
		
		public void quitBrowsers()
		{
			driver.close();
		}

	}


}
