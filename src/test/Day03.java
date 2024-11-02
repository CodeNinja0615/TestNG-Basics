package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day03 {
	@Test(groups={"smoke"})
	public void webLoginCarLoan() {
		System.out.println("Web car login");
	}
	@Parameters({"URL"})
	@Test
	public void mobileLoginCarLoan(String url) {
		System.out.println("Mobile car login "+url);
	}
	
	@Parameters({"ApiKey"})
	@Test(dependsOnMethods={"mobileLoginCarLoan"})
	public void apiLoginCarLoan(String ApiKey) {
		System.out.println("Api car login " + ApiKey);
	}
}
