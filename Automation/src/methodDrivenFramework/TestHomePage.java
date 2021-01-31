package methodDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class TestHomePage extends BaseTest {
	public static void main(String[] args) throws InterruptedException, IOException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();// open the browser

		ActiTimeLogin lp = new ActiTimeLogin(driver);
		Flib flib = new Flib();// method from a class
		String username = flib.getPropertydata("./data/config.properties", "un");
		String password = flib.getPropertydata("./data/config.properties", "psw");
		
		lp.logInToActiTime(username, password);// method from POM class

	}

}
