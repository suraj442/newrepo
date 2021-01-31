package testpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupExcution {

	@Test(groups = "FUNCTIONAL")
	public void ft4() {
		Reporter.log("Hi I am FUNCTIONAL TEST CASE 4",true);
	}
	@Test(groups = "SMOKE")
	public void st1() {
		Reporter.log("Hi I am SMOKE TEST CASE 1",true);
	}


	@Test(groups = "INTEGRATION")
	public void it1() {
		Reporter.log("Hi I am INTEGRATION TEST CASE 1",true);
	}

	@Test(groups = "SMOKE")
	public void st2() {
		Reporter.log("Hi I am SMOKE TEST CASE 2",true);
	}


	@Test(groups = "SMOKE")
	public void st5() {
		Reporter.log("Hi I am SMOKE TEST CASE 5",true);
	}


	@Test(groups = "SMOKE")
	public void st6() {

		Reporter.log("Hi I am SMOKE TEST CASE 6",true);
	}







	@Test(groups = "INTEGRATION")
	public void it2() {
		Reporter.log("Hi I am INTEGRATION TEST CASE 2",true);
	}


	@Test(groups = "INTEGRATION")
	public void it3() {
		Reporter.log("Hi I am INTEGRATION TEST CASE 3",true);
	}


	@Test(groups = "SMOKE")
	public void st3() {
		Reporter.log("Hi I am SMOKE TEST CASE 3",true);
	}



	@Test(groups = "INTEGRATION")
	public void it4() {
		Reporter.log("Hi I am INTEGRATION TEST CASE 4",true);
	}



	@Test(groups = "INTEGRATION")
	public void it5() {
		Reporter.log("Hi I am INTEGRATION TEST CASE 5",true);
	}


	@Test(groups = "INTEGRATION")
	public void it6() {
		Reporter.log("Hi I am INTEGRATION TEST CASE 6",true);
	}

	@Test(groups = "SMOKE")
	public void st4() {
		Reporter.log("Hi I am SMOKE TEST CASE 4",true);
	}




	@Test(groups = "FUNCTIONAL")
	public void ft1() {
		Reporter.log("Hi I am FUNCTIONAL TEST CASE 1",true);
	}



	@Test(groups = "FUNCTIONAL")
	public void ft2() {
		Reporter.log("Hi I am FUNCTIONAL TEST CASE 2",true);
	}


	@Test(groups = "FUNCTIONAL")
	public void ft3() {
		Reporter.log("Hi I am FUNCTIONAL TEST CASE 3",true);
	}






	@Test(groups = "FUNCTIONAL")
	public void ft5() {
		Reporter.log("Hi I am FUNCTIONAL TEST CASE 5",true);
	}


	@Test(groups = "FUNCTIONAL")
	public void ft6() {Reporter.log("Hi I am FUNCTIONAL TEST CASE 6",true);
	}












}
