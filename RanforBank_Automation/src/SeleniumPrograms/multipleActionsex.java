package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class multipleActionsex {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prave\\Downloads\\chrm90\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		Actions act = new Actions(driver);
		
		WebElement userName_txt = driver.findElement(By.id("email"));
		
		Action multipleActs = act.moveToElement(userName_txt).click().keyDown(userName_txt, Keys.SHIFT)
				.sendKeys("Praveen").keyUp(userName_txt, Keys.SHIFT).doubleClick(userName_txt).contextClick()
				.doubleClick().moveToElement(userName_txt).contextClick().build();
				              
		multipleActs.perform();
	}

}
