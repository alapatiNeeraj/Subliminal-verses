package scriptexecutor;

import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;


public class DeleteCookies {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WINDOWS_10\\Desktop\\Selenium\\drivers\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		drive.manage().deleteAllCookies();
		
		drive.get("https://www.google.com/?gws_rd=ssl");
		File s = ((TakesScreenshot)drive).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(s, new File("C:\\Users\\Public\\Downloads\\screen.png"));

	}

}
