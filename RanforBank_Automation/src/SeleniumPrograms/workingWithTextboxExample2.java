package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingWithTextboxExample2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prave\\OneDrive\\Desktop\\BrowserDrivers\\chromedriver_win32 (3)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		WebElement userName = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.name("pass"));
		WebElement lButton = driver.findElement(By.xpath("//*[@id=\'u_0_2_z1\']"));
		userName.sendKeys("praveen");
		password.sendKeys("94583453h");
		lButton.click();

	}

}
