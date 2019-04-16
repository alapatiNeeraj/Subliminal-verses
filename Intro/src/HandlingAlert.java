import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WINDOWS_10\\Desktop\\Selenium\\drivers\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		drive.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		System.out.println(drive.switchTo().alert().getText());
		drive.switchTo().alert().accept();
		
	}

}
