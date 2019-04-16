package realtime;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WINDOWS_10\\Desktop\\Selenium\\drivers\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.get("http://www.qaclickacademy.com/practice.php");
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(drive.findElements(By.tagName("a")).size());
		WebElement headerdrive = drive.findElement(By.cssSelector("header.jumbotron.text-center.header_style"));
		System.out.println(headerdrive.findElements(By.tagName("a")).size());
		WebElement footerdrive = drive.findElement(By.id("gf-BIG"));
		System.out.println(footerdrive.findElements(By.tagName("a")).size());
		WebElement columnheader=footerdrive.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnheader.findElements(By.tagName("a")).size());
		int count= columnheader.findElements(By.tagName("a")).size();
		for(int i=1;i<count;i++){
			columnheader.findElements(By.tagName("a")).get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		}
			Set<String> b = drive.getWindowHandles();
			Iterator<String> c = b.iterator();
			while(c.hasNext()){
				drive.switchTo().window(c.next());
				System.out.println(drive.getTitle());
			}
		
	}

}
