package testNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class parallelTestEx {

	@Test
	public void chromeLogin() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prave\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");

		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email")).sendKeys("praveen");
		driver.findElement(By.id("passwd")).sendKeys("1234");
		driver.findElement(By.id("SubmitLogin")).click();
		System.out.println(driver.findElement(By.xpath("//p[text()='There is 1 error']")).isDisplayed());
	}
	
	@Test
	public void firefoxLogin() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\prave\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		
		WebDriver driver1 = new FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.get("http://automationpractice.com/index.php");

		driver1.findElement(By.linkText("Sign in")).click();
		driver1.findElement(By.id("email")).sendKeys("praveen");
		driver1.findElement(By.id("passwd")).sendKeys("1234");
		driver1.findElement(By.id("SubmitLogin")).click();
		System.out.println(driver1.findElement(By.xpath("//p[text()='There is 1 error']")).isDisplayed());
	}
	
	
	
}
