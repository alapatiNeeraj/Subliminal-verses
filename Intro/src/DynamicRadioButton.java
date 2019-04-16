import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DynamicRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WINDOWS_10\\Desktop\\Selenium\\drivers\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.get("http://www.echoecho.com/htmlforms10.htm");
		
		int count=(drive.findElements(By.xpath("//input[@name='group1']")).size());
		
		for (int i=0;i<count;i++){
		String a=drive.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			if(a.equals("Cheese")){
				drive.findElements(By.xpath("//input[@name='group1']")).get(i).click();
				
			}
			}
		drive.close();
	}

}
