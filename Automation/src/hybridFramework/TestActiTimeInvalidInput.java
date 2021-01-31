package hybridFramework;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestActiTimeInvalidInput extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();// oepn the browser
		
		LoginPagePOM lp = new LoginPagePOM(driver);
		Flib flib = new Flib();
		int rcount = flib.rowCount(EXCEL_PATH, "InvalidCredentials");// take the rowcount to use for for loop
		WebDriverCommonLib wb = new WebDriverCommonLib();
		for (int i=1;i<=rcount;i++) // to iterate the rows
		{
		String username = flib.readcellData(EXCEL_PATH, "InvalidCredentials", i, 0);
		String password = flib.readcellData(EXCEL_PATH, "InvalidCredentials", i, 1);
		lp.loginProcess(username, password);
		wb.waitForTheElement(ITO);
		WebElement element = lp.getErrMsg();
		wb.presenceOfElement(element, username, password,i);
	
		
		
		}
		
		
		bt.closeBrowser();// close the browser
		
		
	}

}
