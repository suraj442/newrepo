package jsp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// to use the webDriver methods
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//a[contains(.,'Rec') and @class='firstLevelMenu']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(.,'Candi') and @id='menu_recruitment_viewCandidates']")).click();
		driver.findElement(By.id("btnAdd")).click();
		Thread.sleep(5000);
		Thread.sleep(2000);
		



	}

}
