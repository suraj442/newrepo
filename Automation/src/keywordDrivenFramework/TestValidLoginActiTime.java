package keywordDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestValidLoginActiTime extends BaseTest{

	public static void main(String[] args) throws InterruptedException, IOException {
	    BaseTest bt = new BaseTest();
	    Flib flib = new Flib();
	    String username = flib.readPropFile("./data/config.properties", "un");
	    String password = flib.readPropFile("./data/config.properties", "psw");
	    bt.openBrowser();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		
		bt.closeBrowser();
		
		
		
		

	}

}
