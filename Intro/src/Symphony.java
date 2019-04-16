import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Symphony {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\WINDOWS_10\\Desktop\\Selenium\\drivers\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.get("https:www.youtube.com");
		System.out.println(drive.getTitle());
		System.out.println(drive.getCurrentUrl());
		//System.out.println(drive.getPageSource());
		drive.get("https:www.google.com");
		drive.navigate().back();
		drive.navigate().forward();
		drive.close();
	}
}
