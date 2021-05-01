package collectionProg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exampleList {

	public static void main(String[] args) {
	
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prave\\OneDrive\\Desktop\\BrowserDrivers\\chromedriver_win32 (3)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); 
		
	List<WebElement> colcnt = driver.findElements(By.xpath("//table[@class='w3-table-all notranslate']/tbody/tr/th"));
	
	System.out.println(colcnt.size());

	}

}
