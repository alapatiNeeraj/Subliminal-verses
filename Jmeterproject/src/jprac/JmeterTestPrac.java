package jprac;

import java.util.concurrent.TimeUnit;



import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;



public class JmeterTestPrac {
@Test
	public void jmeterprac(){
		
	
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WINDOWS_10\\Desktop\\Selenium\\drivers\\chromedriver.exe");
		WebDriver drive = new HtmlUnitDriver();
		drive.get("https://www.amazon.com/");
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(drive.getTitle());
		Actions a = new Actions(drive);
		a.moveToElement(drive.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		a.moveToElement(drive.findElement(By.id("icp-nav-flyout"))).contextClick().build().perform();

	}
}
