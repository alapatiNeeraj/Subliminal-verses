package testngprac;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Prac3 {
@Test
	public void mobilesignincarloan(){
		System.out.println("login via web");
	}
@Test
	public void mobilesignoutcarloan(){
		System.out.println("login via mobile");
	}
@Test
	public void loginapicarloan(){
		System.out.println("login via API");
	}
@AfterTest
public void last(){
	System.out.println("bro,i will execute last");
}
}
