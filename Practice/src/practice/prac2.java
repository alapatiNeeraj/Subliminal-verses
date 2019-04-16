package practice;


import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;










import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class prac2 {
	public WebDriver drive =null;
	
	@Test(groups={"smoke test"})
	public void webploan(){
		System.out.println("login via web for personal loan");
	}
@Parameters({"URL2","APIkey/username"})
	@Test
	public void mobileploan(String uname, String key){
		System.out.println("login via mobile for personal loan");
		System.out.println(uname);
		System.out.println(key);
	}
	
	@Test
	public void apiploan(){
		System.out.println("login via api for personal loan");
	
	}
	
	@Test(dataProvider="getData")
	public void mobilesignin(String username,String password){
		System.out.println(username);
		System.out.println(password);
		System.out.println("sign in successful");
	}
	
	@BeforeTest
	public void prereq(){
		System.out.println("executed first");
	}
	
	@Test
	public void login() throws IOException {
		Properties p = new Properties();
		FileInputStream f = new FileInputStream("F:\\New folder (3)\\Practice\\src\\practice\\datadriven.properties");
		p.load(f);
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("password"));
		System.out.println(p.getProperty("url"));
		if(p.getProperty("browser").equals("firefox")){
			System.setProperty("webdriver.gecko.driver","C:\\Users\\WINDOWS_10\\Desktop\\Selenium\\drivers\\geckodriver.exe");
			drive = new FirefoxDriver();
		}
		else if (p.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\WINDOWS_10\\Desktop\\Selenium\\drivers\\chromedriver.exe");
			drive = new ChromeDriver();
		}
		else{
			System.setProperty("webdriver.ie.driver","C:\\Users\\WINDOWS_10\\Desktop\\Selenium\\drivers\\MicrosoftWebDriver.exe");
			drive = new InternetExplorerDriver();
		}
		drive.get(p.getProperty("url"));
	}
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data = new Object[4][2];
		
		data[0][0]="firstuser";
		data[0][1]="firstpassword";
		

		data[1][0]="2nduser";
		data[1][1]="2ndpassword";
		

		data[2][0]="3rduser";
		data[2][1]="3rdpassword";
		
		data[3][0]="3rduser";
		data[3][1]="3rdpassword";
		
		return data;
	}
}
