package objectrepo;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	WebDriver drive;
	
	public HomePage(WebDriver drive){
		this.drive=drive;
	}
	By search = By.id("srchword");
	By sclick = By.className("newsrchbtn");
	
	public WebElement search(){
		return drive.findElement(search);
	}
	public WebElement sclick(){
		return drive.findElement(sclick);
	}
}