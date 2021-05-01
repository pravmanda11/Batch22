package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingWithTextboxes {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prave\\OneDrive\\Desktop\\BrowserDrivers\\chromedriver_win32 (3)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement userName = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));


		if (userName.isDisplayed()) {
			userName.clear();
			userName.sendKeys("Praveen");  
			System.out.println("USername Entered Successfully");
		} else {
			System.out.println("Usename text box is not displayed");
		}

		
		if(password.isDisplayed()) {
			password.clear();
			password.sendKeys("Hello");
			System.out.println("Password entered successfullu");
		} else
			System.out.println("Password textbox is not displayed");
		
		
	}
		
		
		
		
		
		
		
		
		/*
		 * System.out.println(userName.isDisplayed()); truefalse
		 * userName.sendKeys("Kiran"); userName.clear(); //if data is there it will
		 * clear or empty userName.sendKeys("praveen"); // Enter data in text box
		 */

	}


