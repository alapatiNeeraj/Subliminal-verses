import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WINDOWS_10\\Desktop\\Selenium\\drivers\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.rediff.com");
		drive.findElement(By.cssSelector("a[title*='Sign in']")).click();
		drive.findElement(By.xpath("//input[contains(@id,'login')]")).sendKeys("login");
		drive.findElement(By.xpath("//input[@id='password']")).sendKeys("pass");
		drive.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println(drive.getCurrentUrl());
		
	}

}
