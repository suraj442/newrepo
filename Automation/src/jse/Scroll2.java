package jse;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll2 {
	public static void main(String[] args) throws InterruptedException, IOException {
		// to use the webDriver methods
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.craftsvilla.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		WebElement target = driver.findElement(By.xpath("//span[.='BLOG']"));
		Point loc = target.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-100)+")");
		
		
	}

}


