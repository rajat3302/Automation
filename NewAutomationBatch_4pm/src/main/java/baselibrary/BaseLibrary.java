package baselibrary;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import screenshotutility.Screenshotutility;

public class BaseLibrary
{
    public static WebDriver driver;
	public void getlaunchUrl(String url)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rshro\\eclipse-workspace\\NewAutomationBatch_4pm\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[1]/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"kt\"]/li[6]/a")).click();
		
		System.out.println("abcd");
		

	}
	
	@AfterTest
	public void teardown()
	{
         //driver.quit();
	}
	
	@AfterMethod
	public void getanalysis(ITestResult result)
	{
		String methodname=result.getMethod().getMethodName();
		try 
		{
			if(result.isSuccess())
			{
				Screenshotutility.getscreenshot("passed", methodname);
			}
			else if(result.getStatus()==ITestResult.FAILURE)
			{
				Screenshotutility.getscreenshot("failed", methodname);
			}
              
			
		}
		catch (Exception e) 
		{
	            System.out.println("isuue in getanlayisis"+e);
	            
		}
	
	}

		
		
	
}
