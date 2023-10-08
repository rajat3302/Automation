package day39;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest 

{
	WebDriver driver;
	Loginpage lp;
	
	@BeforeClass
	void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority=1)
	void tochecklogo()
	{
		lp=new Loginpage(driver);
		Assert.assertEquals(lp.ChecklogoPresence(), true);
	}
	@Test(priority=2)
   void testlogin()
   {
		lp=new Loginpage(driver);
		lp.setUsername("Admin");
		lp.setPassword("admin123");
		lp.clickSubmit();
		
		Assert.assertEquals(driver.getTitle(),"OrangeHRM"); 
		
   }
	
	@AfterClass
	void teardown()
	{
		  driver.close(); 
	}
}
