package testNGPrograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class LoginTestcase {
	
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prave\\OneDrive\\Desktop\\BrowserDrivers\\chromedriver_win32 (3)\\chromedriver.exe");

	}

	@BeforeClass
	public void beforeClass() {
		 driver = new ChromeDriver();
	}

	@BeforeMethod
	public void beforeMethod() {
		driver.get("https://www.facebook.com");
	}

	@Test
	public void VerifyTitle() {
		System.out.println(driver.getTitle());
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Logout ");
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
