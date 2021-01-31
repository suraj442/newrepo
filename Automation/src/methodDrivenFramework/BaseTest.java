package methodDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

	static WebDriver driver;
	public void openBrowser() throws IOException
	{
		Flib flib=new Flib();
		String browserValue = flib.getPropertydata("./data/config.properties", "browser");
		String url = flib.getPropertydata("./data/config.properties", "url");

		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
		}

		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
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
}
