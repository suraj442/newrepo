package actions;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
		driver.get("file:///C:/Users/HP/Desktop/newseleniumbatch/dragdrop.html");
		WebElement src = driver.findElement(By.id("draggable-2"));
		WebElement dest = driver.findElement(By.id("droppable-2"));
		
		
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dest).perform();
		

	}

}
