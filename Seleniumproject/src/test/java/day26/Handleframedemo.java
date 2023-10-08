package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handleframedemo 
{

	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("org.openqa.selenium")).click();

	}

}
