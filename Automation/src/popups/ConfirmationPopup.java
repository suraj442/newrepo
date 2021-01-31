package popups;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {

	public static void main(String[] args) throws InterruptedException, IOException {
		// to use the webDriver methods
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/confirmpopupupdated.html");
		driver.findElement(By.xpath("//button[contains(.,'Hungry')]")).click();
		Alert a = driver.switchTo().alert();
		Thread.sleep(5000);
		a.accept();
		
	}

}
