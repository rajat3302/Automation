package day24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlecheckboxes
{

	public static void main(String[] args) 
	{
      WebDriverManager.chromedriver().setup();
      WebDriver driver= new ChromeDriver();
      
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      
      driver.get("https://www.testingbaba.com/");
      driver.manage().window().maximize();
      
      
      //select specific one checkbox
      
     
      driver.findElement(By.xpath("//button[@class='close']")).click();
      driver.findElement(By.xpath("//ul[@id=\"kt\"]/child::li[6]/a")).click();
      driver.findElement(By.xpath("//button[@data-target='#elements']")).click();
      driver.findElement(By.xpath("//a[contains(text(),'check box')]")).click();
      
   WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"tab_2\"]/div/iframe"));
     
      driver.switchTo().frame(checkbox);
      driver.findElement(By.xpath("//input[@id='myCheck']")).click();
   String text = driver.findElement(By.xpath("//*[@id=\"text\"]")).getText();
   System.out.println(text);  
   driver.switchTo().defaultContent();
      
      
      
	}

}
