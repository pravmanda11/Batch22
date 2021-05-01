package testNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class dataProviderEx2 {
	WebDriver driver;
	
@BeforeTest
public void setup() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\prave\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://automationpractice.com/index.php");
}


@DataProvider
public Object[][] loginTestData() {
  return new Object[][] {
    new Object[] {"Praveen", "prav@123" },
    new Object[] {"Rajesh", "Raj@123"},
    new Object[] {"Kiran", "Kr@123"},
  };
}


@DataProvider
public Object[][] CreateAccount() {
  return new Object[][] {
    new Object[] {"Praveen", "manda", "0912", "praveen@gmail", "prav123","deloitte","hyd" },
    new Object[] {"Rajesh", "S", "0912", "praveen@gmail", "prav123","deloitte","hyd"},
    new Object[] {"Kiran", "D", "0912", "praveen@gmail", "prav123","deloitte","hyd"},
  };
}


@DataProvider
public Object[][] Payment() {
  return new Object[][] {
    new Object[] {"304503495365", "Praveen", "713", "09/22" },
  };
}


@Test(dataProvider = "loginTestData")
public void loginFun(String UN, String PWD) {
	driver.findElement(By.linkText("Sign in")).click();
	driver.findElement(By.id("email")).sendKeys(UN);
	driver.findElement(By.id("passwd")).sendKeys(PWD);
	driver.findElement(By.id("SubmitLogin")).click();
	System.out.println(driver.findElement(By.xpath("//p[text()='There is 1 error']")).isDisplayed());
}

@Test(dataProvider= "CreateAccount")
public void CreateAccountFun(String Fname, String Lname, String DOB, String emal, String pwd, String Off) {
	driver.findElement(By.id("customer_firstname")).sendKeys(Fname);
	driver.findElement(By.id("customer_lastname")).sendKeys(Lname);
	driver.findElement(By.id("dob")).sendKeys(DOB);
	driver.findElement(By.id("email")).sendKeys(emal);
	driver.findElement(By.id("pwd")).sendKeys(pwd);
	driver.findElement(By.id("office")).sendKeys(Off);
	
}
	
@Test(dataProvider="Payment")
public void paymentbyCC(String CarNum, String Name, String CVV, String expdaet) {
	
}
	

}
