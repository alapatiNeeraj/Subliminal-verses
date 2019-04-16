import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WINDOWS_10\\Desktop\\Selenium\\drivers\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.get("http://www.echoecho.com/htmlforms10.htm");
		drive.findElement(By.xpath("//input[@value='Cheese']")).click();
		System.out.println(drive.findElements(By.xpath("//input[@name='group1']")).size());
	}

}
