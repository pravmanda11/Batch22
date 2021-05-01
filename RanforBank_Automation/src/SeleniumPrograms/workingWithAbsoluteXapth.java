package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingWithAbsoluteXapth {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prave\\OneDrive\\Desktop\\BrowserDrivers\\chromedriver_win32 (3)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		WebElement button = driver.findElement(By.xpath("//*[@name='login']"));
		
		userName.sendKeys("hello");
		password.sendKeys("Hello123");
		button.click();
		
	}
		
		
		
		
		
		
		
		
		/*
		 * System.out.println(userName.isDisplayed()); truefalse
		 * userName.sendKeys("Kiran"); userName.clear(); //if data is there it will
		 * clear or empty userName.sendKeys("praveen"); // Enter data in text box
		 */

	}


