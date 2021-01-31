package dataDrivenFrameWorkActiTime;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-smc8hiai/login.do");
		Thread.sleep(2000);
		Thread.sleep(5000);
		Flib flib = new Flib();
		String username = flib.readcellData("./data/TestDataToRead.xlsx", "Credentials", 1, 0);
		String password = flib.readcellData("./data/TestDataToRead.xlsx", "Credentials", 1, 1);
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		String homePageTitle = driver.getTitle();
		if(homePageTitle.equals("actiTIME - Enter Time-Track"))
		{

			flib.writeData("./data/TestDataToRead.xlsx", "Credentials", 1, 2,"pass");
		}
		else
		{
			flib.writeData("./data/TestDataToRead.xlsx", "Credentials", 1, 2,"fail");
		}
	}














}

