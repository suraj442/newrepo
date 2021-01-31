package popups;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class ClosingTheChilds {

	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String parenTitle = driver.getWindowHandle();
		Set<String> allwhs = driver.getWindowHandles();
		
		for(String wh:allwhs)
		{   Thread.sleep(2000);
			String title = driver.switchTo().window(wh).getTitle();
		  
			if(title.equals("HSBC"))
			{
				Thread.sleep(8000);
				driver.manage().window().maximize();
				break;
				
			}
		}
	}

}
