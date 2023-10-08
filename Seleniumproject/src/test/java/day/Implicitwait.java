package day;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Implicitwait 
{

	public static void main(String[] args) throws InterruptedException
	{
     WebDriverManager.chromedriver().setup();
     WebDriver driver= new ChromeDriver();
     
    // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // implicit command 
     
     
     // declaration explicit wait 
 
     WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(10));
     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     driver.manage().window().maximize();
     
   WebElement  username =mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']"))); 
     username.sendKeys("Admin");
   //  driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
    
    WebElement password =mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name=\"password\"]")));
    password.sendKeys("admin");
     //driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("admin123");
     
     
     
     
     
     
     
	}

}
;