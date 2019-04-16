package realtime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WINDOWS_10\\Desktop\\Selenium\\drivers\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.get("http://www.qaclickacademy.com/practice.php");
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		drive.findElement(By.id("checkBoxOption2")).click();
		String b=drive.findElement(By.id("checkBoxOption2")).getAttribute("value");
		Select s = new Select(drive.findElement(By.id("dropdown-class-example")));
		drive.findElement(By.id("dropdown-class-example")).click();
		s.selectByValue(b);
		drive.findElement(By.id("name")).sendKeys(b);
		drive.findElement(By.id("alertbtn")).click();
	
	String c=drive.switchTo().alert().getText();
		if(c.contains(b)){
			System.out.println("alert message success");
		}
		else{
			System.out.println("somthing went wrong");
	
		}
		drive.switchTo().alert().accept();
	}

}
