package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Redbus {

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
		driver.get("https://www.redbus.com/");
		driver.findElement(By.id("return_cal"))
		
		
		
	}

}
