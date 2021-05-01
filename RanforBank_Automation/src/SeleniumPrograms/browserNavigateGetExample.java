package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserNavigateGetExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prave\\OneDrive\\Desktop\\BrowserDrivers\\chromedriver_win32 (3)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		driver.get("https://www.facebook.com");
		driver.get("https://www.naukari.com");

		driver.navigate().to("https://www.google.com");
		driver.navigate().to("https://www.google.com");
		driver.navigate().to("https://www.google.com");

	}

}
