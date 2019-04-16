package actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WINDOWS_10\\Desktop\\Selenium\\drivers\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.get("https://accounts.google.com/AccountChooser/identifier?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=AddSession");
		drive.manage().window().maximize();
		drive.findElement(By.linkText("Help")).click();
		Set<String> ids =drive.getWindowHandles();
		Iterator<String> it =ids.iterator();
		String parentId = it.next();
		String childId=it.next();
		drive.switchTo().window(childId);
		System.out.println(drive.getTitle());
		drive.switchTo().window(parentId);
		System.out.println(drive.getTitle());
	}

}
