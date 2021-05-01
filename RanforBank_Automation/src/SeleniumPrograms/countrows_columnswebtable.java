package SeleniumPrograms;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class countrows_columnswebtable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prave\\OneDrive\\Desktop\\BrowserDrivers\\chromedriver_win32 (3)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/sql/sql_and_or.asp");

		List col = driver.findElements(By.xpath("//table[@class='w3-table-all notranslate']/tbody/tr[1]/th"));
		System.out.println("columns = " + col.size());

		List row = driver.findElements(By.xpath("//table[@class='w3-table-all notranslate']/tbody/tr"));
		System.out.println("rows =   " + row.size());
		
		WebElement  name= driver.findElement(By.xpath("//table[@class='w3-table-all notranslate']/tbody/tr[3]/td[2]"));
		System.out.println(name.getText());
	}

}
