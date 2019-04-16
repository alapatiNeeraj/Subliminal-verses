import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MorePrac {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WINDOWS_10\\Desktop\\Selenium\\drivers\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.get("https:www.gmail.com");
		drive.findElement(By.cssSelector("input[type='email']")).sendKeys("alapatisaineeraj@gmail.com");
		drive.findElement(By.cssSelector("content.CwaK9")).click();
		drive.findElement(By.cssSelector("input[type='password']")).sendKeys("speedforce1234");
		drive.findElement(By.cssSelector("content.CwaK9")).click();

	}

}
