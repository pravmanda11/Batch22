package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectiorExample {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prave\\OneDrive\\Desktop\\BrowserDrivers\\chromedriver_win32 (3)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement UN = driver.findElement(By.cssSelector("input#email"));
		UN.sendKeys("Hello");
		
		
		WebElement PWD = driver.findElement(By.cssSelector("input#pass"));
		PWD.sendKeys("Hello");

	}

}
