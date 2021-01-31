package hybridFramework;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class TestActitimeSettings extends BaseTest{
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
    wb.waitForTheElement(ITO);
    
    
    
    HomePagePOM hp = new HomePagePOM(driver);
    hp.clickSetting();
    WebElement element = hp.getDropdown1();
    WebElement element2 = hp.getDropdown2();
   
    wb.getoptionsOfDropdown(element);
    wb.getoptionsOfDropdown(element2);
   
	

}
}
