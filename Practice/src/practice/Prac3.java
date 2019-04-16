package practice;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class Prac3 {
	
	@BeforeClass
	public void aclass(){
		System.out.println("will execute before any  execution in prac3 class");
	}
	
	@AfterClass
	public void bclass(){
		System.out.println("will execute after any execution in prac3 class");
	}
	@Test
	public void webcloan(){
		System.out.println("login via web for car loan");
		Assert.assertTrue(false);
	}

	@Test
	public void mobilecloan(){
		System.out.println("login via mobile for car loan");
	}
	
	@Test(groups={"smoke test"})
	public void apicloan(){
		System.out.println("login via api for car loan");
	}
		@AfterTest
		public void postreq(){
			System.out.println("executed last");
		}
		
		@BeforeMethod
		public void bmethod(){
			System.out.println("will execute before any method execution in prac3 class");
		}
	
		@AfterMethod
		public void amethod(){
			System.out.println("will execute after any method execution in prac3 class");
		}
	}



