package qsp;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateActions {
	static
	{
    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//To open the chrome browser
		WebDriver driver=new ChromeDriver();
		//To maximize the browser
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		//driver.switchTo().activeElement().sendKeys("corona vaccine",Keys.ENTER);
//		
//		driver.navigate().back();
//		
//		driver.navigate().forward();
//		
//		driver.navigate().refresh();
		driver.navigate().to("https://www.flipkart.com/");
//		//It is used to close the patrent window/broswer
//		driver.close();
		
		//It is used to close all the windows /browsers including the childs
		driver.quit();
		
		
		
		
		
		

}
}
