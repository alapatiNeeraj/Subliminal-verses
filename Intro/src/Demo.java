import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver","C:\\Users\\WINDOWS_10\\Desktop\\Selenium\\drivers\\MicrosoftWebDriver.exe");
		WebDriver drive = new InternetExplorerDriver();
		drive.get("https:www.google.com");
		drive.findElement(By.xpath("//div[@class='jhp']/div/div/div/div/div/div/div[2]/a")).click();
	
	}

}
