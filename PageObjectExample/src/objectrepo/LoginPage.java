package objectrepo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver drive;
	
	public LoginPage(WebDriver drive){
		this.drive=drive;
		PageFactory.initElements(drive,this);
	}
/*By username=By.name("login");
By password=By.name("passwd");
By login=By.name("proceed");
By home= By.linkText("Home");*/
	
@FindBy(name="login")
WebElement username;
@FindBy(name="passwd")
WebElement password;
@FindBy(name="proceed")
WebElement login;
@FindBy(linkText="Home")
WebElement home;


public WebElement loginid(){
	return username;
}

public WebElement password(){
	return password;
}

public WebElement login(){
	return login;
}
public WebElement home(){
	return home;
	
}
}
