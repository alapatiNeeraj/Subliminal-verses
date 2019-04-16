package testcases;

import objectrepo.HomePage;
import objectrepo.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppLogin {
	@Test
	//login page is implemented in page object factory methods.
	//home page is implemented in page object pattern style.
	public void login()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WINDOWS_10\\Desktop\\Selenium\\drivers\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.get("https://mail.rediff.com/cgi-bin/login.cgi");
		LoginPage lp= new LoginPage(drive);
		lp.loginid().sendKeys("l098864");
		lp.password().sendKeys("ledzeppelin1234");
		//lp.login().click();
		lp.home().click();
		HomePage hp = new HomePage(drive);
		hp.search().sendKeys("slipknot");
		hp.sclick().click();
	}}
