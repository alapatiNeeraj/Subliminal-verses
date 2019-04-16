package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WINDOWS_10\\Desktop\\Selenium\\drivers\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.get("https://jqueryui.com/droppable/");
		drive.manage().window().maximize();
		System.out.println(drive.findElements(By.tagName("iframe")).size());
		drive.switchTo().frame(0);
		Actions a = new Actions(drive);
		WebElement source = drive.findElement(By.id("draggable"));
		WebElement target = drive.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		drive.switchTo().defaultContent();
		drive.findElement(By.linkText("Accept")).click();
	}

}
