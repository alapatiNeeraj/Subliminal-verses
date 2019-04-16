package realtime;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WINDOWS_10\\Desktop\\Selenium\\drivers\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.makemytrip.com/flights/");
		drive.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		drive.manage().window().maximize();
		
	
		drive.findElement(By.id("hp-widget__depart")).click();
		
		while(!drive.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month']")).getText().contains("MARCH")&& drive.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']")).getText().contains("2019")){
			drive.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
		}
		List<WebElement> a = drive.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/table[@class='ui-datepicker-calendar']/tbody/tr/td/a[@class='ui-state-default']"));
		int count=a.size();
		
		for(int i=0;i<count;i++){
		String b=a.get(i).getText();
		if(b.equalsIgnoreCase("15")){
			a.get(i).click();
			break;
		}
	}

}
}