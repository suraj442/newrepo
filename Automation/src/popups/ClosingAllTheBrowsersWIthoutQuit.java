package popups;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClosingAllTheBrowsersWIthoutQuit {

	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Set<String> allwhs = driver.getWindowHandles();
		//closing all the browser windows without quit()
		for(String wh :allwhs)
		{
			Thread.sleep(2000);
			driver.switchTo().window(wh).close();
			driver.switchTo().window(wh);// NoSuchWindowException
			
		}

}
}
