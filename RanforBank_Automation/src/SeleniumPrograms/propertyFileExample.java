package SeleniumPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class propertyFileExample {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prave\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		Properties obj = new Properties(); // Create Object with Properties Class

		FileInputStream PropFile = new FileInputStream(System.getProperty("user.dir")+"\\config.properties");

		obj.load(PropFile);

		String emailid = obj.getProperty("EMAILID");
		String URL = obj.getProperty("AppQAUrl");
		String UN = obj.getProperty("USERNAME");
		String PWD = obj.getProperty("PASSWORD");
		String PWDID = obj.getProperty("PASSWORDID");
		String SubmitBtn = obj.getProperty("SUBMITBTNID");
		String ErrMsgXpath = obj.getProperty("ERRMSGXPATH");

		driver.get(URL);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText(obj.getProperty("SignInLink"))).click();
		driver.findElement(By.id(emailid)).sendKeys(UN);
		driver.findElement(By.id(PWDID)).sendKeys(PWD);
		driver.findElement(By.id(SubmitBtn)).click();
		System.out.println(driver.findElement(By.xpath(ErrMsgXpath)).isDisplayed());

	}

}
