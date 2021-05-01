package testNGPrograms;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NewTest {
	
  @Test(dataProvider = "dp")
  public void f(String UN, String PWD) {
	  System.out.println(UN);
	  System.out.println(PWD);
	 
  }
  
 
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"Praveen", "prav@123" },
      new Object[] {"Rajesh", "Raj@123"},
      new Object[] {"Kiran", "Kr@123"},
    };
  }
}
