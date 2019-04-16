package practice;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class prac extends prac2 {
	@Test
	public void test() throws IOException{
		login();
		System.out.println("pracice example");
		
	}
	@Parameters({"URL"})
	@Test(groups={"smoke test"})
	public void speed(String urlname){
		
		
		System.out.println("speed force");
		System.out.println(urlname);
	}

	@AfterSuite
	public void asuite(){
		System.out.println("after suite");
	}
}

