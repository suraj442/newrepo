package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {


	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/multiselectdropdown.html");
		WebElement sel = driver.findElement(By.id("i0"));
		Select dropdown=new Select(sel);
		Thread.sleep(5000);
//		dropdown.selectByIndex(7);
//		Thread.sleep(4000);
//		//deselect by index
//		dropdown.deselectByIndex(7);
		
		
		//deselect by visble text
//		dropdown.selectByVisibleText("singapur");
//		Thread.sleep(2000);
//		dropdown.deselectByVisibleText("singapur");
		
		//deselect the option by value
//		dropdown.selectByValue("i5");
//		Thread.sleep(2000);
//		dropdown.deselectByValue("i5");
		System.out.println(dropdown.isMultiple());
		
		List<WebElement> selectedOps = dropdown.getAllSelectedOptions();
		for(WebElement we : selectedOps) {
			System.out.println(we.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
//		dropdown.selectByVisibleText("singapur");
//		Thread.sleep(4000);
//		dropdown.selectByValue("i9");
//		
//		
//		
		//how to select multiple options 
		for(int d=0;d<=7;d++)
		{    
			dropdown.selectByIndex(d);
			Thread.sleep(2000);
		}
		
		dropdown.deselectAll();
//		for(int d=7;d>=0;d--)
//		{    
//			dropdown.deselectByIndex(d);
//			Thread.sleep(2000);
//		}
		
		boolean tf = dropdown.isMultiple();
		System.out.println(tf);
		
		
//		
//		
//		}
		

	}
}

