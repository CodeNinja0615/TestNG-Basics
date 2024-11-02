package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day02 {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method");
	}
	@Test(groups={"smoke"})
	public void personalLoanTest() {
		System.out.println("Personal Loan");
	}

	@Test(timeOut=400)
	public void first() {
		System.out.println("first " );
	}
}
