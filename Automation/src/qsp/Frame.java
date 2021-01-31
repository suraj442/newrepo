package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	

	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/HP/Desktop/newPage.html");
//		driver.findElement(By.xpath("//input[@id='frid']")).sendKeys("suraj");
//		driver.switchTo().frame("frnm");
		/*
		 * driver.findElement(By.xpath("//input[@id='i4']")).sendKeys("suraj");
		 * driver.switchTo().parentFrame();
		 * driver.findElement(By.id("un")).sendKeys("un");
		 * 
		 * 
		 */
		driver.findElement(By.xpath("//input[@id='un']")).sendKeys("suraj");
		driver.switchTo().frame("frnm");
		driver.findElement(By.xpath("//input[@id='i4']")).sendKeys("sawant");
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@id='un']")).clear();
	}

}
