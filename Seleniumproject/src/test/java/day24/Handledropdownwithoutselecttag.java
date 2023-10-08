package day24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handledropdownwithoutselecttag
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
	      WebDriver driver= new ChromeDriver();
	      
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      
	      driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
	      driver.manage().window().maximize();
	      
	      
	      //clicking on the dropdown
	      driver.findElement(By.xpath("//button[@data-toggle=\"dropdown\"]/span")).click();
	   List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
	   
	   // find total no. of optins
	   
	   System.out.println("total no of options:"+options.size());
	      
	     // print all options from dropdown
	   
	   // using normal for loop
	   
	   for(int i=0;i<options.size();i++)
	   {
		   System.out.println(options.get(i).getText());
	   }
	   
	      // select options from dropdown
	   
	   for(int i=0;i<options.size();i++)
	   {
		   if(options.get(i).getText().equals("java"))
		   {
			   options.get(i).click();
		   break;
	   }}
	      

	}

}
