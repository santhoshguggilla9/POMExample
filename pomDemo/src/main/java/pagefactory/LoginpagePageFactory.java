package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginpagePageFactory {
	
	WebDriver driver;

	//Using pagefactory
	//Constructor that will be automatically called as soon as the object of the class is created
	public LoginpagePageFactory(WebDriver driver) {
		this.driver = driver;
		//this method will create web elements
		PageFactory.initElements(driver, this);
	}
	
	
	//Locator for username field
	@FindBy(how = How.ID, using = "userName")
	//@FindBy(id="userName")// annotation 
	WebElement uname;

	//Locator for password field
	@FindBy(id="password")
	WebElement pwd;

	//Locator for login button
	@FindBy(id="login")
	WebElement loginBtn;


	//Method to enter username
	public void enterUsername(String user) {
		uname.sendKeys(user);
	}

	//Method to enter password
	public void enterPassword(String pass) {
		pwd.sendKeys(pass);
	}

	//Method to click on Login button
	public void clickLogin() {
		loginBtn.click();
	}
	
}
