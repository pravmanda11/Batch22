package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class implicitWaitEx {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prave\\OneDrive\\Desktop\\BrowserDrivers\\chromedriver_win32 (3)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");  // refresh browser and launch url ..... 
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // for every driver action
	
		
		WebDriverWait wait10 = new WebDriverWait(driver,10);    
		WebDriverWait wait5 = new WebDriverWait(driver,5);   
		WebDriverWait wait3 = new WebDriverWait(driver,3); 

		wait10.until(ExpectedConditions.visibilityOfElementLocated(By.id("U1234")));  //10sec...
		wait5.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[username]"))); //5 sec
		wait3.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//link"))); // 3 sec
		
}
}