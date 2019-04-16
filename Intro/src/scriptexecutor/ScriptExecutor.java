package scriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptExecutor {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WINDOWS_10\\Desktop\\Selenium\\drivers\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.manage().window().maximize();
		
		drive.get("https://www.ksrtc.in/oprs-web/guest/home.do?h=1");
		drive.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebElement a = drive.findElement(By.id("fromPlaceName"));
		a.sendKeys("beng");
		a.sendKeys(Keys.DOWN);
		a.getText();
		JavascriptExecutor j = (JavascriptExecutor)drive;
		String sc =	" return document.getElementById(\"fromPlaceName\").value";;
	String text=(String) j.executeScript(sc);
	
	while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIPORT")){

		a.sendKeys(Keys.DOWN);
		text=(String) j.executeScript(sc);
		}
		a.sendKeys(Keys.ENTER);
		System.out.println(text);


	}

}
