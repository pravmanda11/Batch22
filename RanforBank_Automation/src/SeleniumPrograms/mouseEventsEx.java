package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class mouseEventsEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prave\\Downloads\\chrm90\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");

		Actions act = new Actions(driver);

		WebElement hello_lnk = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		WebElement signIN_Link = driver.findElement(By.xpath("//*[@id='nav-flyout-ya-signin']/a"));
		WebElement signout = driver.findElement(By.id("nav-link-accountList-nav-line-1"));

		// Mouse Hover ||  moveToElement 
		Action mouseHover = act.moveToElement(hello_lnk).build();
		mouseHover.perform();
		signIN_Link.click();
		
		//Double Click || doubleClick
		Action sigout = act.doubleClick(signout).build();
		sigout.perform();
		

	}

}
