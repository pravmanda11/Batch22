package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class enterURLMaxCloseExmple {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\prave\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");

		WebDriver EDriver = new FirefoxDriver(); // Object Creation for Browser Driver

		EDriver.get("https://www.facebook.com"); // Opening URL
		EDriver.manage().window().maximize(); // To Maximize Browser window
		System.out.println(EDriver.getTitle()); // Print the Page title - "Facebook – log in or sign up

		System.out.println(EDriver.getTitle().equals("Facebook – log in or sign up")); // true

		EDriver.close(); // CLose the Browser

	}

}
