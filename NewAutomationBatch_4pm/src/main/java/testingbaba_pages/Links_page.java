package testingbaba_pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Application_utility;
import baselibrary.BaseLibrary;

public class Links_page extends BaseLibrary 
{

  public Links_page()
  {
	  PageFactory.initElements(driver, this);
  }
  
  @FindBy(xpath="//*[@data-target=\"#elements\"]")
  private WebElement elements;
  
  @FindBy(xpath="//*[@href=\"#tab_6\"]")
  private WebElement links;
  
  @FindBy(xpath="//*[text()='Demo Page']")
  private WebElement demopagelink;
  
  @FindBy(xpath="//*[text()=' Register Now']")
  private WebElement registerlink;
  public void clickonelements()
  {
	  elements.click();
  }
  public void clickonlinks()s
  {
      try 
      {
		Thread.sleep(1000);
		links.click();
	  } 
      catch (Exception e)
      {
		System.out.println("issue in links "+e);
	  }
  }
  public void clickondemopagelink()
  {
	  try 
	  {
		  demopagelink.click();
		  Application_utility.switchwindow(1);
		  Thread.sleep(2000);
		  registerlink.click();
		  driver.close();
		  Application_utility.switchwindow(0);
	  } 
	  catch (Exception e)
	  {
		System.out.println("issue in tab"+e);
	  }
  }
}
