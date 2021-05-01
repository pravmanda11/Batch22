package SeleniumPrograms;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingInBrowser {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prave\\OneDrive\\Desktop\\BrowserDrivers\\chromedriver_win32 (3)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//ul[@class='bannerList ']//child::li[3]")).click();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		String parent = driver.getWindowHandle();
		System.out.println("Parent Window:  " + parent); // lets print parent window name/id for reference

		Set<String> S = driver.getWindowHandles(); // Multiple Windows ....

		Iterator<String> it = S.iterator(); // This will iterate (loop) all the windows

		while (it.hasNext()) {
			String child = it.next(); // 5 id

			if (!parent.equalsIgnoreCase(child)) {
				String childText = driver.switchTo().window(child).getTitle();
				if (childText.equalsIgnoreCase("Events | Genpact")) {
					driver.switchTo().window(child);
					Thread.sleep(10000);
					driver.findElement(By.linkText("Register Here")).click();
				}
			}

		}

	}

}
