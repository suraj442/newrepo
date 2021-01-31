package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeLogin {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-smc8hiai/login.do");
		String loginPageTitle = driver.getTitle();
		System.out.println(loginPageTitle);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		String homePageTitle = driver.getTitle();
		
		System.err.println(homePageTitle);
		//explicitelyWait
		 WebDriverWait wait = new WebDriverWait(driver,10);
		 wait.until(ExpectedConditions.titleContains("punter"));
		 System.out.println("test case is pass");
		 System.out.println("a");
		 System.out.println("b");
		 System.out.println("c");
		
		
	}

}
