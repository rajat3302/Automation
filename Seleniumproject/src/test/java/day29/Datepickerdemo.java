package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepickerdemo 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().window().maximize();
		 
		driver.switchTo().frame(0); // switch frmae
		
		//approach1
		
		//driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).sendKeys("15/27/2023");// mm/dd/yy
		
		//approach2
		
	 //wil open the date picker
		
		String year="2024";  // future date
		String month="June";
		String date="30";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		
		//select month and year
		while(true)
		{
		String	mon = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
		String yr= driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
		
		if(mon.equals(month) && yr.equals(year))
		{
			break;
		}
		
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();// next button 
		
		
	//	driver.quit();
		}
		
		//select date 
		
	List<WebElement> alldates 	= driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//tr/td"));
    
	for(WebElement dt:alldates)
	{
		if(dt.getText().equals(date))
		{
			dt.click();
			break;
		}
	}
	}

}
