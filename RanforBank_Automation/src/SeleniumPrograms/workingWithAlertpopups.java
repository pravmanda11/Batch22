package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingWithAlertpopups {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prave\\OneDrive\\Desktop\\BrowserDrivers\\chromedriver_win32 (3)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); //
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");// opening browser
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); // waiting

		driver.findElement(By.xpath("//input[@name='proceed']")).click();

		Alert alt = driver.switchTo().alert(); // switch to alert
	    String expPopText  = alt.getText();
		
		if (expPopText.equals("Please enter a valid user name")) {
			System.out.println("Correct pop up displayed");
			alt.accept();
		}
		
		driver.findElement(By.name("login")).sendKeys("hello");
		driver.findElement(By.id("password")).sendKeys("rtreter");

	}

}
