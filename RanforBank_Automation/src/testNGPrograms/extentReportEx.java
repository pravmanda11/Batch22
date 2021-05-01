package testNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class extentReportEx {
	
ExtentReports report;
ExtentTest test;
WebDriver driver;

@BeforeClass
public void startTest() {

	report = new ExtentReports(System.getProperty("user.dir")+"ExtentReport.html");
	test= report.startTest("extentReportEx");

}

@Test
public void login() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\prave\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://automationpractice.com/index.php");
	driver.findElement(By.linkText("Sign in")).click();
	driver.findElement(By.id("email")).sendKeys("praveen");
	driver.findElement(By.id("passwd")).sendKeys("Hello");
	driver.findElement(By.id("SubmitLogin")).click();
	if(driver.findElement(By.id("SubmitLogin")).isDisplayed()) {
		test.log(LogStatus.PASS, "PassedButton");
	}
	System.out.println(driver.findElement(By.xpath("//p[text()='There is 1 error']")).isDisplayed());
}

@AfterClass
public void endTest() {
	report.endTest(test);
	report.flush();
}


}
