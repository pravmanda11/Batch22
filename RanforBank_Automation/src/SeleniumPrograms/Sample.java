package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prave\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");

		WebDriver Cdriver = new ChromeDriver();
        /*Cdriver.get("https://www.google.com");
        Cdriver.findElement(By.name("q")).sendKeys("iphone");
        Thread.sleep(10000);
        Cdriver.findElement(By.xpath("(//div[@class='sbtc'])[3]//span/b")).click();*/
        
        Cdriver.get("https://www.redbus.in/bus-tickets/hyderabad-to-khammam?fromCityName=Hyderabad%20%28All%20Locations%29&fromCityId=124&toCityName=Khammam&toCityId=401&onward=11-Feb-2021&srcCountry=IND&destCountry=IND&opId=0&busType=Any");
        Thread.sleep(10000);
        Cdriver.findElement(By.xpath("(//div[@class='clearfix m-top-16'])[1]/div")).click();
        

	}

}
