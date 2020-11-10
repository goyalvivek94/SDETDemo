package testNGSample;

import org.testng.annotations.*;


public class AllAnnotation {
	
	@Test
	public void testMethod() {
		System.out.println("This is the test method");
	}
	
	@Test
	public void testMethod1() {
		System.out.println("This is the test method1");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is the BeforeMethod");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is the AfterMethod");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is the BeforeClass");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("This is the AfterClass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("This is the BeforeTest");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("This is the AfterTest");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is the BeforeSuite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("This is the AfterSuite");
	}

}
