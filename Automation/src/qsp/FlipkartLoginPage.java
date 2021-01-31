package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLoginPage {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[class='_2zrpKA _1dBPDZ']")).sendKeys("suraj123");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("11234567");
	    Thread.sleep(6000);
	    driver.findElement(By.cssSelector("button[class='_2AkmmA _1LctnI _7UHT_c']")).click();
		
		
	}

}
