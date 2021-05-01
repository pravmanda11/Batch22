package testNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class loginamazon {
	WebDriver driver;
	@BeforeClass
	public void testSetup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prave\\OneDrive\\Desktop\\BrowserDrivers\\chromedriver_win32 (3)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@BeforeMethod
	public void OpenBrowser() {
		driver.get("http://automationpractice.com/index.php");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}

	@Test
	public void LoginApp() {
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email")).sendKeys("jashwanthreddy26@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("jashwanth26");  //Hardcoding of Testdata
		driver.findElement(By.id("SubmitLogin")).click();
		System.out.println(driver.getTitle());
		WebElement profileName = driver
				.findElement(By.xpath("//div[@class='header_user_info']/a/span[text()='jashwanth reddy']"));
		System.out.println("Profile Name is = " + profileName.isDisplayed()); // true
	}

	@Test
	public void verifyErrorMessages() {
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email")).sendKeys("jashwanthreddy26@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Hell0123");
		driver.findElement(By.id("SubmitLogin")).click();
		String errText = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li/text()")).getText();
		System.out.println(errText);
	}

	@AfterMethod
	public void Logout() {
		driver.findElement(By.xpath("//a[@class='logout']")).click();
		System.out.println(driver.getTitle());
	}

	@AfterClass
	public void closeBrowser() {
		driver.manage().deleteAllCookies();
		driver.close();
	}

}
