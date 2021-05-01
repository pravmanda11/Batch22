package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithTextElement {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prave\\OneDrive\\Desktop\\BrowserDrivers\\chromedriver_win32 (3)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		String text = driver.findElement(By.className("_8eso")).getText();
		
		if (text.equals("Facebook helps you connect and share with the people in your life.")) {
			
			System.out.println("Text is correct");
		} else {
			System.out.println("not matching ");
		}
		
		if(text.contains("share with the people")) {
			System.out.println("text is correct");
		}
		

	}

}
