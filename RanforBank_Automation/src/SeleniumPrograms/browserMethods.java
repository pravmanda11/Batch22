package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserMethods {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prave\\OneDrive\\Desktop\\BrowserDrivers\\chromedriver_win32 (3)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");

		driver.manage().window().maximize();

		driver.navigate().to("https://www.naukri.com/");

		driver.navigate().back();

		driver.navigate().forward();

		driver.navigate().refresh();

	}

}
