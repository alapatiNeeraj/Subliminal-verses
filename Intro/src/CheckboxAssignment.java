import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class CheckboxAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WINDOWS_10\\Desktop\\Selenium\\drivers\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.get("http://qaclickacademy.com/practice.php");
		drive.findElement(By.id("checkBoxOption1")).click();
		Assert.assertTrue(drive.findElement(By.id("checkBoxOption1")).isSelected());
		drive.findElement(By.id("checkBoxOption1")).click();
		Assert.assertFalse(drive.findElement(By.id("checkBoxOption1")).isSelected());
		System.out.println(drive.findElements(By.cssSelector("input[type='checkbox']")).size());
		
	}

}
