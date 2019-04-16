import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WINDOWS_10\\Desktop\\Selenium\\drivers\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.spicejet.com");
		drive.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		drive.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='JSA']")).click();
		Thread.sleep(2000L);
		drive.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='HYD']")).click();
		drive.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click();
		drive.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		if(drive.findElement(By.id("Div1")).getAttribute("style").contains("1")){
			System.out.println("enabled");
			Assert.assertTrue(true);
		}
	}

}
