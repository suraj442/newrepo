package methodDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestInvalidActitimeInput extends BaseTest{
  
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();// oepn the browser
		
		ActiTimeLogin lp = new ActiTimeLogin(driver);
		Flib flib = new Flib();
		int rc = flib.rowCount("./data/TestDataNew.xlsx", "InvalidCredentials");// take the rowcount to use for for loop
		
		for (int i=1;i<=rc-1;i++) // to iterate the rows
		{
		String username = flib.readcellData("./data/TestDataNew.xlsx", "InvalidCredentials", i, 0);
		String password = flib.readcellData("./data/TestDataNew.xlsx", "InvalidCredentials", i, 1);
		lp.logInToActiTime(username,password);// login
		}
		
		
		bt.closeBrowser();// close the browser
		
		

	}

}
