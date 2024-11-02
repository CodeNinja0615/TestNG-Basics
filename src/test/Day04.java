package test;

import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day04 {
	@Test
	@Ignore
	public void webLoginBikeLoan() {
		System.out.println("Web bike login");
	}
	
	@Parameters({"ApiKey"})
	@Test(groups={"smoke"})
	public void mobileLoginBikeLoan(String ApiKey) {
		System.out.println("Mobile bike login Key" + ApiKey);
	}
	
	@Test
	public void apiLoginBikeLoan() {
		System.out.println("Api bike login");
	}
}
