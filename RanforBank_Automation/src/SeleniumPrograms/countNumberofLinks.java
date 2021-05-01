package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class countNumberofLinks {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prave\\OneDrive\\Desktop\\BrowserDrivers\\chromedriver_win32 (3)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

		List<WebElement> lnk = driver.findElements(By.tagName("a"));

		System.out.println(lnk.size()); // 25 .... 0,1,2,3,4,5,---24

		for (int i = 0; i < lnk.size(); i++) {

			System.out.println(lnk.get(i).getText());

		}

	}

}
