package grid;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WINDOWS_10\\Desktop\\Selenium\\drivers\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		int sum=0;
		drive.get("https://www.cricbuzz.com/live-cricket-scorecard/22089/ire-vs-ned-5th-match-oman-quadrangular-series-2019");
		WebElement table =drive.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		//int rowcount=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		for (int i=0;i<count-2;i++){
		String a  =	table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
		int b= Integer.parseInt(a);
		sum=sum+b;
		}
		String c=drive.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int d= Integer.parseInt(c);
		int totalsum=sum+d;
		System.out.println(totalsum);
	String e=	drive.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
	int actualsum=Integer.parseInt(e);
	if(totalsum==actualsum){
		System.out.println("count matches");
	}
	else{
		System.out.println("count does not match");
	}
	}

}
