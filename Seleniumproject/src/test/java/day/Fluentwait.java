package day;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fluentwait 
{

	public static void main(String[] args) 
	{
		  WebDriverManager.chromedriver().setup();
		     WebDriver driver= new ChromeDriver();
		     
		     
		     //declaration of fluent wait 
		     Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		    		    .withTimeout(Duration.ofSeconds(30))
		    		    .pollingEvery(Duration.ofSeconds(5))
		    		    .ignoring(NoSuchElementException.class);
		 
		     WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(10));
		     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}  //  driver.manage().window().maximize();
		     
}	/*     WebElement username = wait.until(new Function<WebDriver, WebElement>() 
		     {
		         public WebElement apply(WebDriver driver) 
		         {
		           return driver.findElement(By.id("//input[@name=\"username\"]"));
		         }
		     }*/
		  //         username.sendKeys("Admin");
		         
		     
		
	//	    driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		    
		  
		//    driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("admin123");
		     
		     
		     	     


