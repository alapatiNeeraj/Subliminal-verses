package slabs;

import java.net.MalformedURLException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabs {
	public static final String USERNAME = "Metal_is_life";

	  public static final String ACCESS_KEY = "f383ffb3-c4eb-4e5d-b3b5-392b5b5e6e2e";

	  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
DesiredCapabilities cap = new DesiredCapabilities().chrome();
cap.setCapability("platform", "Windows 7");
cap.setCapability("version", "50.0");

WebDriver drive= new RemoteWebDriver(new java.net.URL(URL),cap);
drive.get("https://www.google.com");
System.out.println(drive.getTitle());

	}

}
