package testNGPrograms;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.*;

public class FirsttestNGclass {

	@BeforeSuite
	public void BS() {
		System.out.println("This is Before Suite");
	}

	@BeforeClass
	public void BC() {
		System.out.println("This is Before Class");
	}

	@BeforeTest
	public void BT() {
		System.out.println("This is Before Test");
	}

	@BeforeMethod
	public void BM() {
		System.out.println("This is Before Method ");
	}

	@Test
	public void Test1() {
		System.out.println("This is Test ");
	}

	@AfterClass
	public void AC() {
		System.out.println("After Class");
	}

	@AfterTest
	public void AT() {
		System.out.println("After Test");
	}

	@AfterSuite
	public void AS() {
		System.out.println("After Suite");
	}

	@AfterMethod
	public void AM() {
		System.out.println("After Method");
	}

}
