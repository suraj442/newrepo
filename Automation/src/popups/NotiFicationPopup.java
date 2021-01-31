package popups;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NotiFicationPopup {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// to use the webDriver methods
		FirefoxOptions ff=new FirefoxOptions();
//		ff.addArguments("-start-maximized");
		ff.addArguments("--disable-notifications");
		WebDriver driver=new FirefoxDriver(ff);
		driver.get("https://www.happyeasygo.com");
		Thread.sleep(5000);
		

	
		
		
		
		
		
		

	}

}
