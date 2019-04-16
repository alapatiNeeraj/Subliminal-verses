package sync;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WINDOWS_10\\Desktop\\Selenium\\drivers\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		drive.findElement(By.linkText("Click to load get data via Ajax!")).click();
		WebDriverWait a = new WebDriverWait(drive, 10);
		a.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("results")));
	    System.out.println(drive.findElement(By.id("results")).getText());
	}

}
