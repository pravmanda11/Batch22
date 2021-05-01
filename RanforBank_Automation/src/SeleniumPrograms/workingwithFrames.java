package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithFrames {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prave\\OneDrive\\Desktop\\BrowserDrivers\\chromedriver_win32 (3)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); //
		driver.get("https://testautomationpractice.blogspot.com/");// opening browser
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); // waiting
		
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Hello");
		driver.switchTo().frame(0); //By Index
		driver.switchTo().frame("frame-one1434677811"); //By ID
	
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Hello");
		
		driver.switchTo().defaultContent();   
		
		driver.findElement(By.id("field2")).sendKeys("hello");
		
		

	}

}
