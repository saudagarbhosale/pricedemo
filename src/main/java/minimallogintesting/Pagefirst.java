package minimallogintesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pagefirst {
	
	@FindBy(css="input[type='text']") private WebElement UID;
	@FindBy(css="input[type='password']") private WebElement pass;
	@FindBy (css="button[type='submit']") private WebElement Lo;
	
	public Pagefirst(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void Login_userID()
	{
		UID.sendKeys("demo@minimals.cc");
	}
	
	public void Login_password()
	{
		pass.sendKeys("demo1234");
	}
	public void click_Login_Button()
	{
		Lo.click();
	}
}
