package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowsersExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prave\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");

		WebDriver Cdriver = new ChromeDriver();

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\prave\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");

		WebDriver Gdriver = new FirefoxDriver();

		System.setProperty("webdriver.ie.driver", "C:\\Users\\prave\\Downloads\\IEDriv\\IEDriverServer.exe");

		WebDriver EDriver = new InternetExplorerDriver();

	}

}
