import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WINDOWS_10\\Desktop\\Selenium\\drivers\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.spicejet.com");
        Select s = new Select(drive.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
        drive.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
        s.selectByValue("AED");
        s.selectByVisibleText("INR");
        s.selectByIndex(3);
        
        drive.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L);
        for(int i=1; i<5;i++){
        	drive.findElement(By.id("hrefIncChd")).click();
    
       }
        
        drive.findElement(By.id("btnclosepaxoption")).click();
       Assert.assertEquals(drive.findElement(By.id("divpaxinfo")).getText(), "1 Adult, 4 Child" ); 
       drive.close();
	}

}
