package day37;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.IAssert;

import com.beust.jcommander.Parameter;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParellelTest 

{
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser","url"}) 
    void setup(String br,String appurl ) throws InterruptedException// vlaue is hold in br parameter xml file 
    {
		if(br.equals("chrome"))
		{
	     WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
		}
		else if(br.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		else
		{
			WebDriverManager.firefoxdriver().setup();
			driver=  new FirefoxDriver();
		}
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get(appurl);
    driver.manage().window().maximize();
    Thread.sleep(5000);
    }
	@Test(priority=1)
	void testLogo()
	{
		try
		{
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		org.testng.Assert.assertEquals(status,true);
		}
		catch(Exception e)
		{
			org.testng.Assert.fail();
		}
	}

@Test(priority=2)
void testhomepage()
{
	assertEquals(driver.getTitle(), "OrangeHRM");
}

@AfterClass
void closeapp()
{
	driver.close();
}




}