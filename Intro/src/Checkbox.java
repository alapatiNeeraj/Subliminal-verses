import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WINDOWS_10\\Desktop\\Selenium\\drivers\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.spicejet.com");
	int a =	drive.findElements(By.cssSelector("input[type='checkbox']")).size();
for (int i=0;i<a;i++){
	String b=drive.findElements(By.cssSelector("input[type='checkbox']")).get(i).getAttribute("name");
	if(b.equals("ctl00$mainContent$chk_StudentDiscount")){
		drive.findElements(By.cssSelector("input[type='checkbox']")).get(i).click();
		Assert.assertTrue(drive.findElements(By.cssSelector("input[type='checkbox']")).get(i).isSelected());
	}
}
	}

}
