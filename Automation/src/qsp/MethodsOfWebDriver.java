package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsOfWebDriver {
	static
	{
    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//To open the chrome browser
		WebDriver driver=new ChromeDriver();
		//To maximize the browser
		driver.manage().window().maximize();
		//To enter the URL
		driver.get("https://www.google.com/");
		//To get the current URL
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		//to get the source code of the page
//		String pageSource = driver.getPageSource();
//		System.out.println(pageSource);
		
		//to display the title of  the webpage
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(4000);
	
	
		
		
		
		
		
		

	}

}
