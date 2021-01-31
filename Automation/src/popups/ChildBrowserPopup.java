package popups;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChildBrowserPopup {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		//		driver.close(); /// used to close only the parennt window 
		//		driver.quit();// used to close all the windows including child windows
		String parentTitle = driver.getWindowHandle();
		System.err.println("The window handle of parent browser :"+parentTitle);// It is used to get the Window handle of only the parennt window
		Set<String> allWindowHandles = driver.getWindowHandles();
//		System.out.println("The number of browsers opened "+allWindowHandles.size());
//		System.out.println("The number of child browsers opened "+(allWindowHandles.size()-1));
		for(String winhandles:allWindowHandles)
		{   
			String title = driver.switchTo().window(winhandles).getTitle();
			if(!title.equals(parentTitle))
			{
				System.err.println(title);
				driver.switchTo().window(winhandles).close();
			}
			
			
			
			System.out.println("The window handle of individaul window :"+winhandles + " and the title is    "+title);

		}


	}
}
