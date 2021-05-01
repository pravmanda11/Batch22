package SeleniumPrograms;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowhandlingExample2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prave\\OneDrive\\Desktop\\BrowserDrivers\\chromedriver_win32 (3)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"globalnavbar-header-container\"]/div[3]/div/div/div/a")).click();

		String parent = driver.getWindowHandle();
		System.out.println("Parent Window:  " + parent);  //CDwindow-98999CFB19DC6ED3177CF9278E86D446

		Set<String> S = driver.getWindowHandles(); // Multiple Windows .... 2 windows recognizd --PAr/Ch

		Iterator<String> it = S.iterator(); // This will iterate (loop) all the windows

		while (it.hasNext()) {
			String child = it.next();
			String driv = driver.switchTo().window(child).getTitle();
			System.out.println(driv);
			if (!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				Thread.sleep(10000);  // it will forcefully asks script to wait for some time 10secs
				driver.findElement(By.name("UserFirstName")).sendKeys("Praveen");
			}

		}
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div/div/div[2]/div[1]/div[1]/div[3]/div/div[1]/div/a/span")).click();
		
	}
}