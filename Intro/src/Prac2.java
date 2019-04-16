import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Prac2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WINDOWS_10\\Desktop\\Selenium\\drivers\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.qaclickacademy.com");
		drive.findElement(By.xpath("//a[@href='interview.php']")).click();
        drive.findElement(By.xpath("//li[@id='tablist1-tab1']")).click();
       drive.findElement(By.xpath("//*[@id='tablist1-tab2']/following-sibling::li[1]")).click();
       drive.findElement(By.xpath("//*[@id='tablist1-tab2']/following-sibling::li[2]")).click();
       System.out.println(drive.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));
       drive.findElement(By.xpath("//*[text()= ' Appium ']")).click();
	}

}
