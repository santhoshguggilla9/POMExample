package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Homepage;
import pages.Loginpage;
import pages.Dashboard;

public class Login_TC1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/login");

		//Creating object of home page
		Homepage home = new Homepage(driver);

		//Creating object of Login page
		Loginpage login = new Loginpage(driver);

		//Creating object of Dashboard
		Dashboard dashboard = new Dashboard(driver);

		//Click on Login button
		home.clickLogin();

		//Enter username & password
		login.enterUsername("santhoshg");
		login.enterPassword("Vishu@23");

		
		//Click on login button
		login.clickLogin();
		Thread.sleep(3000);


		//Capture the page heading and print on console
		System.out.println("The page heading is --- " + dashboard.getHeading());

		//Click on Logout button
		dashboard.clickLogout();

		//Close browser instance
		//driver.quit();
	}


}
