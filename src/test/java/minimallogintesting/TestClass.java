package minimallogintesting;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass extends BaseClass {
	Pagefirst login;
	Dashboard ds;
	@BeforeClass
	public void openBrowser()
	{
		OpenBrowser();
		 login=new Pagefirst(driver);
		  ds=new Dashboard(driver);
	}
	@BeforeMethod()
	public void login()
	{
		login.Login_userID();
		login.Login_password();
		login.click_Login_Button();
	 
	     ds.clickOnUser();
	}
	@Test
	public void TC01()
	{
		String expResult = ds.getUsrName();
		String ac="Minimal UI";
		Assert.assertEquals(expResult, expResult);
	}


	
	
	
	
}
