import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WINDOWS_10\\Desktop\\Selenium\\drivers\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.spicejet.com");
		drive.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		drive.findElement(By.xpath("//a[@value='JSA']")).click();
		Thread.sleep(2000L);
		drive.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
	}

}