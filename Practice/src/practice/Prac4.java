package practice;

import org.testng.annotations.Test;

public class Prac4 {
	@Test(timeOut=4000)
	public void webhloan(){
		System.out.println("login via web for home loan");
	}

	@Test(enabled=false)
	public void mobilehloan(){
		System.out.println("login via mobile for home loan");
	}
	
	@Test(dependsOnMethods={"webhloan"})
	public void apihloan(){
		System.out.println("login via api for home loan");
	}
}


