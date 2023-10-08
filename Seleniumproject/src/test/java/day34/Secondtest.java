package day34;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Secondtest

{
	   WebDriver driver; // declaration webdriver 
	//@BeforeClass
   @Test(priority=1)	
   void openapp()
   {
	   WebDriverManager.chromedriver().setup();
	   driver= new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   driver.manage().window().maximize();
   }
	@Test(priority=2)
   void login()
   {
		try 
		{
		  driver.findElement(By.name("username")).sendKeys("Admin");
		  driver.findElement(By.xpath("//*[@type='password']")).sendKeys("admin123");
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		} 
		catch (Exception e) 
		{
			System.out.println("isuue in login"+e);
		}
	
		
   }
	//@AfterClass
	@Test(priority=3)
   void close() 
   {
    
    	 driver.quit();
	  
   } 
 }

