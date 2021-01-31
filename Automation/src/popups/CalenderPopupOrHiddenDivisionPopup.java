package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalenderPopupOrHiddenDivisionPopup {

	static
	{
    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//To open the chrome browser
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(co);
		//To maximize the browser
		driver.manage().window().maximize();
		//To enter the URL
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(2000);
		WebElement datePicker = driver.findElement(By.xpath("//div[@class='span span15 datePicker']/input[@title='Depart date']"));
		datePicker.
		//to select 22 nd dec 2020
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@data-month='11']//a[.='22']")).click();
		
		
	

	}

}
