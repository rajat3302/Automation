package testingbaba_pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Application_utility;
import baselibrary.BaseLibrary;
import screenshotutility.Screenshotutility;
import waitutility.Waitutility;

public class Autocomplete_page extends BaseLibrary
{
  public Autocomplete_page() 
  {
     PageFactory.initElements(driver, this);
  }
  


  
  @FindBy(xpath="//*[@data-target=\"#widget\"]")
  private WebElement widgets;
  
  @FindBy(xpath="//*[@href=\"#tab_17\"]")
  private WebElement autocomplete;
  
  @FindBy(xpath="//*[@id=\"tab_17\"]/div/iframe")
  private WebElement frame1;
  
  @FindBy(xpath="//*[@id=\"myInput\"]")
  private WebElement autocompleteselectbox;
  
 
  
  public void clickonwidgets()
  {
	  Waitutility.elementtobeclikable(widgets);
	  Application_utility.clickme(widgets);
  }
  
  public void clickonautocomplete()
  {
	  Application_utility.clickme(autocomplete);
  }
  
  public void filldetails() throws InterruptedException
  
  {
	  Thread.sleep(5000);
	  driver.switchTo().frame(frame1);
	  autocompleteselectbox.sendKeys(Keys.TAB);
	  autocompleteselectbox.sendKeys("Indi");
	  autocompleteselectbox.sendKeys(Keys.ARROW_DOWN); // class hai key uske pass method hai arrowdown 
	  autocompleteselectbox.sendKeys(Keys.ENTER);
	  driver.switchTo().defaultContent();
	  
	  
	  
	  
	  
  }
}
