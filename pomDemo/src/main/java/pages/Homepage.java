package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	WebDriver driver;

	//Constructor that will be automatically called as soon as the object of the class is created
		public Homepage(WebDriver driver) {
			this.driver=driver;
		}

		By btnLogin = By.id("login");
		public void clickLogin()
		{
			
			driver.findElement(btnLogin).click();
		}
}
