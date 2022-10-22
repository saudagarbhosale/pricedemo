package minimallogintesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1xk5apd']") private WebElement user;
	@FindBy(xpath="(//h6[@class='MuiTypography-root MuiTypography-subtitle2 MuiTypography-noWrap css-1k96qjc'])[1]") private WebElement UserName;
	
	public Dashboard(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnUser()
	{
		user.click();
	}
	public String getUsrName()
	{
	String us=UserName.getText();
	return us;
	}
}
