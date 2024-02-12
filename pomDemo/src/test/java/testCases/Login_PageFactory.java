package testCases;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pagefactory.LoginpagePageFactory;

public class Login_PageFactory {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver;
		driver = new ChromeDriver();

//		Properties properties;
//		final String propertyFilePath= "C:\\Users\\santh\\git\\repository7\\PraticeMaven\\config.properties";
		
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/login");
		
//		 FileReader reader=new FileReader(propertyFilePath); 
//		 properties=new Properties(); 
//		 properties.load(reader); 
	 
		
		//Creating object of Login page
		LoginpagePageFactory login = new LoginpagePageFactory(driver);

//		//Enter username & password
//		login.enterUsername(properties.getProperty("username"));
//		login.enterPassword(properties.getProperty("password"));
		
		//Enter username & password
				login.enterUsername("santhoshg");
				login.enterPassword("Vishu@23");

		//Click on login button
		login.clickLogin();
		Thread.sleep(3000);

		//Close browser instance
		//driver.quit();

	}

}
