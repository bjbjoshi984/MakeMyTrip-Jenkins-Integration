package driverScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPage {
	
	@BeforeClass
	public void readFromTheResources()
	{
		System.out.println("Hello Before Class");
	}
	
	@BeforeMethod
	public void openBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com");
    	driver.manage().window().maximize();
    	Thread.sleep(30000);
		
	}
	
	@Test
	public void loginAutomate()
	{
		System.out.println("Hello Test Class");
		
	}

}
