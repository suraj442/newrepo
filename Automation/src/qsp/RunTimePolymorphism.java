package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class RunTimePolymorphism {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter which browser you want to open ? ");
		String chosenBrowser = sc.next();

		if(chosenBrowser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.naukri.com/");
			Thread.sleep(2000);
			driver.quit();


		}

		else if(chosenBrowser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("https://www.naukri.com/");
			Thread.sleep(2000);
			driver.quit();

		}
		else
		{
			System.out.println("enter the valid input");
		}




	}
}


