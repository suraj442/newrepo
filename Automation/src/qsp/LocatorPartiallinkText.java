package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPartiallinkText {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/HtmlElements.html");
		Thread.sleep(2000);
		//driver.findElement(By.linkText("QSpiders is a place where businesses find talent and dreams take flight.")).click();
		driver.findElement(By.partialLinkText("businesses")).click();
		driver.findElement(By.partialLinkText("Inbox")).click();
}
}
