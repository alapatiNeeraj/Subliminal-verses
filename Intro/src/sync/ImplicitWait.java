package sync;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WINDOWS_10\\Desktop\\Selenium\\drivers\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		drive.get("https://alaskatrips.poweredbygps.com/");
		drive.findElement(By.id("package-origin-hp-package")).sendKeys("hyderabad");
		drive.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.TAB);
		drive.findElement(By.id("package-destination-hp-package")).sendKeys("bengaluru");
		drive.findElement(By.id("package-destination-hp-package")).sendKeys(Keys.TAB);
		drive.findElement(By.id("package-departing-hp-package")).click();
		drive.findElement(By.cssSelector("button.datepicker-cal-date.start")).click();
		drive.findElement(By.id("search-button-hp-package")).click();
		System.out.println(drive.findElement(By.id("alert7")).getText());

	}

}
