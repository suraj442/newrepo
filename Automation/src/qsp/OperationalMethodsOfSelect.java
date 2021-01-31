package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OperationalMethodsOfSelect {


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
		/*
		 * dropdown.selectByValue("i1"); dropdown.selectByValue("i3");
		 * dropdown.selectByValue("i6");
		 */
		
//		WebElement firstSelectedOption = dropdown.getFirstSelectedOption();
//		System.out.println(firstSelectedOption.getText());
//		
		
//		Thread.sleep(2000);
//		List<WebElement> selectedOps = dropdown.getAllSelectedOptions();
//		
//		for(WebElement selectedOptions :selectedOps)
//		{
//			String selectedoptiontoprint = selectedOptions.getText();
//			System.out.println(selectedoptiontoprint);
//		}
		
		
		WebElement wrappedText = dropdown.getWrappedElement();
		String wrappedTexts = wrappedText.getText();
		System.out.println(wrappedTexts);
		
		
		

	}

}
