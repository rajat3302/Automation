package day31;

import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlinks
{

	public static void main(String[] args) 
	{
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		//find total no. of links 
List<WebElement >	links	=driver.findElements(By.tagName("a"));
System.out.println("total no. of links"+links.size());//48

 int brokenlinks=0;
 for(WebElement linkele:links)
 {
	String hrefattributevalue = linkele.getAttribute("href");
   // System.out.println(hrefattributevalue); 
    
    if(hrefattributevalue==null || hrefattributevalue.isEmpty());
    {
    	System.out.println("href attributes value is empty");
    	continue;
    	
    }
    
    // convert string into url format 
     //URL linkurl= new URL(hrefattributevalue); 
    
    		}

	}

}
