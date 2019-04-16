package scriptexecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandlingSSLcertifications {

	public static void main(String[] args) {
		DesiredCapabilities c = DesiredCapabilities.chrome();
		//c.acceptInsecureCerts();
		c.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		c.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions d= new ChromeOptions();
		d.merge(c);
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WINDOWS_10\\Desktop\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(d);
		driver.manage().window().maximize();
	}

}
