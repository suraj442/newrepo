package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownCountries {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/DropDownList1.html");
		WebElement sel = driver.findElement(By.id("i0"));
		Select dropdown=new Select(sel);
		Thread.sleep(5000);
//		//selecting the option with  index value
//		dropdown.selectByIndex(6);
//		Thread.sleep(3000);
//		//selecting the option with visible text
//		dropdown.selectByVisibleText("South Africa");
//		//selecting the option with the value //expected o/p Bangladesh
		dropdown.selectByValue("i7");
		Thread.sleep(2000);
//		dropdown.deselectByValue("i7");// this line of code will give one exception that is UnsupportedOperationException (RTE)
		
		//we cannot deselect any option which is already selected in single select
		
		boolean tf1=dropdown.isMultiple();
		System.out.println(tf1);
		
		List<WebElement> allOps = dropdown.getOptions();
	   
		
//		for(int i=allOps.size()-1;i>=0;i--)
//		{
//			String optionsOfDropdown=allOps.get(i).getText();
//			System.out.println(optionsOfDropdown);
		
//		}
		
		//using for each loop
		
			
	
		Collections.reverse(allOps);
		for(WebElement we:allOps) {
			String opstionsOfDropdownByForeach=we.getText();
			System.out.println(opstionsOfDropdownByForeach);
		}
		
		
		
		
		
	

		
		

		
		
	}

	}

