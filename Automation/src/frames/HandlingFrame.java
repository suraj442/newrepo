package frames;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingFrame {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/username1.html");
		driver.findElement(By.id("i01")).sendKeys("admin");
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);// we need to pass the index of the frame which has that webelement
		driver.findElement(By.id("i02")).sendKeys("manager");
		driver.switchTo().defaultContent(); // it is used to take the control to the default webpage from any frame
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.findElement(By.id("i01")).clear();
		
		
}
}
