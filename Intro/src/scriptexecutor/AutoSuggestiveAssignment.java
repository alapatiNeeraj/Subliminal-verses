package scriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveAssignment {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WINDOWS_10\\Desktop\\Selenium\\drivers\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		drive.get("http://www.qaclickacademy.com/practice.php");
	WebElement a=	drive.findElement(By.id("autocomplete"));
	a.sendKeys("uni");
	a.getText();
	JavascriptExecutor j = (JavascriptExecutor)drive;
	String sc =	" return document.getElementById(\"autocomplete\").value";;
String text=(String) j.executeScript(sc);
int i=0;
	while(!text.equalsIgnoreCase("United States")){
		i++;
		a.sendKeys(Keys.DOWN);
		text=(String) j.executeScript(sc);
		if(i>10){
			break;
		}
	}
	a.sendKeys(Keys.ENTER);
	System.out.println(text);
	
	if(i>10){
		System.out.println("element not found");
	}

	else{
		System.out.println("element found");
	}
	}

}
