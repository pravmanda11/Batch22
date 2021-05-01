package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptEx {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prave\\Downloads\\chrm90\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		WebElement userName = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		WebElement loginBtn = driver.findElement(By.name("login"));
		WebElement lnk =  driver.findElement(By.xpath("//span[text()=' Facebook © 2021']"));

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].value='praveen';", userName);
		js.executeScript("arguments[0].value='hello123';", password);
		js.executeScript("arguments[0].click();",loginBtn);
		Thread.sleep(5000);
		js.executeScript("arguments[0].scrollIntoView();", lnk);
		Thread.sleep(5000);
		js.executeScript("arguments[0].scrollIntoView();", userName);

	}
}
