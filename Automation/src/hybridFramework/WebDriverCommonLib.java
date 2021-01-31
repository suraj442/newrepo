package hybridFramework;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class WebDriverCommonLib extends BaseTest{


	public String getTitleOfTheWebPage()
	{
		String title = driver.getTitle();
		return title;
	}



	public void verifyThePage(String expectedTitle,String actualTitle,String pageName)
	{
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("The Test case is PASS  " +pageName+" is displayed");
		}

		else
		{
			System.out.println("The Test case is Failed  " +pageName+" is not displayed");
		}
	}

	public void waitForTheElement(long time)
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}


	public void WaitForPageLoad(long eto,String currentTitle)
	{
		WebDriverWait wait = new WebDriverWait(driver, eto);
		wait.until(ExpectedConditions.titleContains(currentTitle));

	}
	public void WaitForTheWebElement(int time,String text,WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.textToBePresentInElement(element, ""));

	}



	public void selectDropdownByIndex(WebElement element,int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}


	public void selectDropdownByValue(WebElement element,String value)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);
	}


	public void selectDropdownByVisibleText(WebElement element,String text)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}



	public void switchToFrameByIndex(int index)
	{
		driver.switchTo().frame(index);
	}


	public void switchToFrameByIdOrName(String idOrName)
	{
		driver.switchTo().frame(idOrName);
	}


	public void switchToFrameByFrameAddress(String frameadd)
	{
		driver.switchTo().frame(frameadd);

	}



	public void takeScreenShot(String nameOfTheWebPage,String folderName) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./"+folderName+"/"+nameOfTheWebPage+".png");
		Files.copy(src, dest);
	}


	public void presenceOfElement(WebElement element,String username,String password,int rowcount) throws EncryptedDocumentException, IOException
	{

		Flib flib = new Flib();
		if(element.isDisplayed())
		{
			System.out.println("username  " +username +" password " +password+ " are invalid and Test Case is pass");
			flib.writeData("./data/TestDataNew.xlsx", "InvalidCredentials", rowcount, 2, "pass");
		}

		else
		{
			System.out.println("username " +username +" password " +password+ " are valid and Test Case is fail");
			flib.writeData("./data/TestDataNew.xlsx", "InvalidCredentials", rowcount, 2, "fail");
		}
	}


	public void getoptionsOfDropdown(WebElement ele)
	{
		Select sel = new Select(ele);
		List<WebElement> allops = sel.getOptions();
		
		
		for(WebElement we:allops)
		{
			String options = we.getText();
			System.out.println(options);
		}
	}



}
