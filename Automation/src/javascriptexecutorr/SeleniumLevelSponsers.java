package javascriptexecutorr;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLevelSponsers {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//to scroll down
		jse.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(3000);
		//to scroll up
		jse.executeScript("window.scrollBy(0,-3000)");
		
		
		
		
		
		
		
		
	    
	    
	}

}
