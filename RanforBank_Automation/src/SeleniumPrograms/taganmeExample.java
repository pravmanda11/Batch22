package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class taganmeExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prave\\OneDrive\\Desktop\\BrowserDrivers\\chromedriver_win32 (3)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

		/*WebElement Gimage = driver.findElement(By.tagName("img"));
          System.out.println(Gimage.getAttribute("alt"));
          System.out.println(Gimage.getAttribute("height"));*/
          
        WebElement LuckyButton = driver.findElement(By.tagName("input"));
        System.out.println(LuckyButton.getAttribute("value"));
        
	}

}
