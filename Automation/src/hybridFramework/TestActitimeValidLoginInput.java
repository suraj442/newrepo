package hybridFramework;

import java.io.IOException;

public class TestActitimeValidLoginInput extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		WebDriverCommonLib wb = new WebDriverCommonLib();
		String actualTitle = wb.getTitleOfTheWebPage();
		
		wb.verifyThePage("actiTIME - Login", actualTitle, " login page");
		Flib flib = new Flib();
		
		String username = flib.getPropertydata(PROPERTY_PATH,"un");
		String password = flib.getPropertydata(PROPERTY_PATH,"psw");
		
	    LoginPagePOM lp = new LoginPagePOM(driver);
	    lp.loginProcess(username, password);
	    wb.WaitForPageLoad(ETO, "actiTIME - Enter Time-Track");
	  
	    
	    String actualTitleHomePage = wb.getTitleOfTheWebPage();
	    wb.verifyThePage("actiTIME - Enter Time-Track", actualTitleHomePage, "Home Page");
	    bt.closeBrowser();
	}

}
