package testngprac;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Prac4 {
	@Test
	public void homecarloan(){
		System.out.println("login via web");
	}
@Test
	public void mobilehomeloan(){
		System.out.println("login via mobile");
	}
@Test
	public void loginapihomeloan(){
		System.out.println("login via API");
	}
@BeforeTest
public void first(){
	System.out.println(" i will execute first");
}
}
