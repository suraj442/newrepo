package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsAll {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/login/");
		Thread.sleep(5000);
//		driver.findElement(By.tagName("a")).click();
//		driver.findElement(By.tagName("input")).click();
		
		
//		driver.findElement(By.id("c2")).click();
		
		driver.findElement(By.id("email")).sendKeys("suraj@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("56552366");
		Thread.sleep(2000);
		driver.findElement(By.id("loginbutton")).click();
		
		
		

	}

}
