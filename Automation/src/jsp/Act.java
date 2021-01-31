package jsp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Act {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		Thread.sleep(3000);
		WebElement src=driver.findElement(By.xpath("//img[@id='drag1']"));
		Thread.sleep(3000);
		WebElement dest = driver.findElement(By.xpath("//div[@id='div2']"));
		
		Actions a=new Actions(driver);
		a.dragAndDrop(src, dest).perform();

	}

}
