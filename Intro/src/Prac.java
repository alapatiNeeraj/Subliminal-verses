import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WINDOWS_10\\Desktop\\Selenium\\drivers\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.get("https:www.facebook.com");
		drive.findElement(By.xpath("//*[@id='email']")).sendKeys("7093166095");
		drive.findElement(By.xpath("//*[@id='pass']")).sendKeys("uncharted1234");
		drive.findElement(By.xpath("//input[@value='Log In']")).click();
		drive.findElement(By.xpath("//*[@class='_54nh']")).click();
	}

}
