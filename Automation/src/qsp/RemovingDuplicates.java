package qsp;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemovingDuplicates {

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
//		
//		Set<String>s=new HashSet<String>();
//		
//		List<WebElement> allops = dropdown.getOptions();
//		
//		//the order will not be maintained
//		//taking all the options from my list
//		for(WebElement we :allops)
//		{
//			String texttoinsert=we.getText();
//			s.add(texttoinsert);// duplicates will not be added
//		}
//		//reading my hashset
//		for(String text:s)
//		{
//			System.err.println(text);
//		}
		
		//
//		Set<String>s=new LinkedHashSet<String>();
////		
//		List<WebElement> allops = dropdown.getOptions();
//		
//		//the order will be maintained
//		//taking all the options from my list
//		for(WebElement we :allops)
//		{
//			String texttoinsert=we.getText();
//			s.add(texttoinsert);// duplicates will not be added
//		}
//		//reading my hashset
//		for(String text:s)
//		{
//			System.err.println(text);
//		}
		
		
		Set<String>s=new TreeSet<String>();
//		
		List<WebElement> allops = dropdown.getOptions();
		
		//the order will be alphabetical
		//taking all the options from my list
		for(WebElement we :allops)
		{
			String texttoinsert=we.getText();
			s.add(texttoinsert);// duplicates will not be added
		}
		//reading my hashset
		for(String text:s)
		{
			System.err.println(text);
		}
		
		
		
		
		
		
		
		
		

	}

}
