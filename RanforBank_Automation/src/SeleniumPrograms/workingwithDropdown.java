package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class workingwithDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prave\\OneDrive\\Desktop\\BrowserDrivers\\chromedriver_win32 (3)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.facebook.com/campaign/landing.php?campaign_id=1653993517&extra_1=s%7Cc%7C318504236042%7Ce%7Cfacebook%7C&placement=&creative=318504236042&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D1653993517%26adgroupid%3D63066387003%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-541132862%26loc_physical_ms%3D9062137%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAiAg8OBBhA8EiwAlKw3kkGC0x31KDWe2u6amkqqCnEIv7zmhw8Aoyedu14nV_Za7j8vSmpp8hoC8foQAvD_BwE");

		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		Select month = new Select(driver.findElement(By.id("month")));

		month.selectByIndex(5);
		month.selectByVisibleText("Dec");
		month.selectByValue("3");
		month.selectByIndex(4);
		
	}

}
