package day39;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage

{
	WebDriver driver;
	// constuctor 
	
	Loginpage(WebDriver driver)
	{
	   this.driver=driver;
	}
	
	
   // locators
	
By logo_img	=By.xpath("//img[@alt='company-branding']");
By txt_username_loc=By.name("username");
By txt_password_loc=By.cssSelector("input[placeholder='Password']");
By btn_submit_loc=By.xpath("//button[normalize-space()='Login']");	
	
	
	// actions method 

    public void setUsername(String username )
    {
    	driver.findElement(txt_username_loc).sendKeys(username);
    
    }
    public void setPassword(String Password )
    {
    	driver.findElement(txt_password_loc).sendKeys(Password);
    
    }
    public void clickSubmit()
    {
    	driver.findElement(btn_submit_loc).click();
    
    }
    public boolean ChecklogoPresence ()
    {
    boolean status	=driver.findElement(logo_img).isDisplayed();
    return status;
    }
    
}
