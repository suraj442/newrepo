package code;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import methodDrivenFramework.ActiTimeLogin;
import methodDrivenFramework.Flib;

public class ActiTimeLoginTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-smc8hiai/login.do");
		
	   	ActiTimeLogin lp = new ActiTimeLogin(driver);
	   	
//	   	lp.setUsername();
//	   	
//	   	lp.setpassword();
//	  
//	   	lp.clickLoginBtn();
	   	
	   	String username = new Flib().getPropertydata("./data/config.properties","un");
	   	String password = new Flib().getPropertydata("./data/config.properties","psw");
	   	
	   	lp.logInToActiTime(username, password);
	   
	   	
//	

	}

}
