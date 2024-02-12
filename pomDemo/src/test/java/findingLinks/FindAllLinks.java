package findingLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllLinks {

	public static void main(String[] args) {
		
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(WebElement link : links)
		{
			System.out.println("Link text: " + link.getText());
		}
		System.out.println("no of link in a page is " + links.size());
	}

}
