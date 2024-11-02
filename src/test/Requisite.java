package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Requisite {

	@BeforeTest
	public void prerequisite() {
		System.out.println("Prerequisites");
	}
	
	@AfterTest
	public void postRequisite() {

		System.out.println("PostRequisites");
	}
	
	
	@BeforeSuite
	public void prerequisiteSuite() {
		System.out.println("Prerequisite Suite");
	}
	
	@AfterSuite
	public void postRequisiteSuite() {
		System.out.println("PostRequisite Suite");
	}
}
