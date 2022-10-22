package minimallogintesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	WebDriver driver;
	public static void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "H:\\Javaprograms\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://minimals.cc/auth/login-unprotected");
	}

}
