package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day05 {
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		
		data[0][0] = "FirstUserName";
		data[0][1] = "Sameerking";
		
		data[1][0] = "SecondUserName";
		data[1][1] = "Sameerking01";
		
		data[2][0] = "ThirdUserName";
		data[2][1] = "Sameerking01!";
		
		return data;
	}
	
	
	@Test(dataProvider="getData")
	public void dataProvider(String userName, String password) {
		System.out.println(userName + " " + password);
	}
	
}

