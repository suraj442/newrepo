package actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotKeyboardActions {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.craftsvilla.com/");
		driver.findElement(By.id("searchval")).sendKeys("shirts");
		driver.findElement(By.xpath("//i[@class='icon cv-search']")).click();
		Thread.sleep(4000);
		WebElement targetToBECopied = driver.findElement(By.xpath("//li[@class='active']/span[.='Shirts']"));
		Actions act =new Actions(driver);
		act.doubleClick(targetToBECopied).perform();
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		WebElement destToBePasted = driver.findElement(By.id("searchval"));
		destToBePasted.clear();
		destToBePasted.click();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
