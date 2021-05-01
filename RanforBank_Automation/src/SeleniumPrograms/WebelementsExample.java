package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementsExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prave\\OneDrive\\Desktop\\BrowserDrivers\\chromedriver_win32 (3)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		// driver.findElement(By.id("email")).sendKeys("praveen"); //Textbox --
		// SendKeys()
		// driver.findElement(By.id("pass")).sendKeys("Hello123");

		WebElement userName = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));

		userName.sendKeys("praveen");
		password.sendKeys("Hello@123");

	}

}
