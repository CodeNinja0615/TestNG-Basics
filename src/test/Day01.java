package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day01 {

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Day01");
	}
	@Test(enabled=true)
	public void Demo() {
		//WebDriver driver = new ChromeDriver();
		System.out.println("Hello World!");
	}
	@Test(groups={"smoke"})
	public void secondTest() {
		//WebDriver driver = new ChromeDriver();
		System.out.println("Second Test!");
	}
	
	@Test
	public void mobileLoginHelicopterLoan() {
		System.out.println("Mobile Helicopter login");
	}
	
	@Parameters({"URL","ApiKey"})
	@Test
	public void urlCheck(String url, String key) {
		System.out.println(url+ " " + key);
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After Day01");
	}
}
