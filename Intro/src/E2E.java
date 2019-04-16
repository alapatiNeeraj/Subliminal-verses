import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class E2E {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WINDOWS_10\\Desktop\\Selenium\\drivers\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.spicejet.com/Default.aspx");
		
		
		drive.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		drive.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='JSA']")).click();
		Thread.sleep(2000L);
		drive.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='HYD']")).click();
		drive.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click();
		if(drive.findElement(By.id("Div1")).getAttribute("style").contains("0.5")){
			System.out.println("disabled");
			Assert.assertTrue(true);
			}
		 drive.findElement(By.id("divpaxinfo")).click();
	        Thread.sleep(2000L);
	        for(int i=1; i<5;i++){
	        	drive.findElement(By.id("hrefIncChd")).click();
	    
	       }
	        
	        drive.findElement(By.id("btnclosepaxoption")).click();
	       Assert.assertEquals(drive.findElement(By.id("divpaxinfo")).getText(), "1 Adult, 4 Child" ); 
	       Select s = new Select(drive.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
	        drive.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
	       s.selectByVisibleText("INR");
	       int a =	drive.findElements(By.cssSelector("input[type='checkbox']")).size();
	       for (int i=0;i<a;i++){
	       	String b=drive.findElements(By.cssSelector("input[type='checkbox']")).get(i).getAttribute("name");
	       	if(b.equals("ControlGroupSearchView$AvailabilitySearchInputSearchView$FamilyAndFriends")){
	       		drive.findElements(By.cssSelector("input[type='checkbox']")).get(i).click();
	       		Assert.assertTrue(drive.findElements(By.cssSelector("input[type='checkbox']")).get(i).isSelected());
	       		
	       	}
	       }
	        
drive.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();

	}
}
