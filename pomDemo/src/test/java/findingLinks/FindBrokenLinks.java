package findingLinks;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URI;
import java.net.URL;
import java.nio.file.Paths;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindBrokenLinks {

	public static void main(String[] args) {

		WebDriver driver;
		
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		//Navigate to the demo site
		driver.get("https://demoqa.com/broken");

		  //Storing the links in a list and traversing through the links
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // This line will print the number of links and the count of links.
        System.out.println("No of links are "+ links.size());  
      
        //checking the links fetched.
        for(int i=0;i<links.size();i++)
        {
            WebElement E1= links.get(i);
            String url= E1.getAttribute("href");
            verifyLinks(url);
        }
        
        //driver.quit();

	}
	public static void verifyLinks(String linkUrl)
    {
        try
        {
        	String path = linkUrl;
        	//URI uri=Paths.get(path).toUri();
        	//URL urlNew = new URL(path);
        	
        	URL url = URI.create(path).toURL();
        	              
            //Now we will be creating url connection and getting the response code
            HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
            httpURLConnect.setConnectTimeout(5000);
            httpURLConnect.connect();
            
            if(httpURLConnect.getResponseCode()>=400)
            {
            	System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage()+ "is a broken link");
            }    
       
            //Fetching and Printing the response code obtained
            else{
                System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
        }catch (Exception e) {
      }
   }
}