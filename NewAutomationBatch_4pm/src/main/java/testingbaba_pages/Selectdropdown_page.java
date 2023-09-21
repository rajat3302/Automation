package testingbaba_pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import baselibrary.BaseLibrary;

public class Selectdropdown_page extends BaseLibrary 
{
  public Selectdropdown_page()
  {
	  PageFactory.initElements(driver, this);
  }
  @FindBy(xpath="//*[@data-target=\"#widget\"]")
  private WebElement widgets;
  @FindBy(xpath="//*[@href=\"#tab_24\"]")
  private WebElement selectmenu;
  @FindBy(xpath="//*[@id=\"tab_24\"]/form/div/div[1]/select")
  private WebElement selectdropdown;
  
  
  public void clickonwidgets() throws InterruptedException
  {
	  Thread.sleep(2000);
	  widgets.click();
	  
  }
  
  public void clickonselctmenu() throws InterruptedException
  {
	  Thread.sleep(2000);
	  JavascriptExecutor js= (JavascriptExecutor) driver;
	  js.executeScript("arguments[0].scrollintoview", selectmenu);
	  selectmenu.click();
  }
  
  public void clickonselctdropdown()
  {
	  selectdropdown.click();
	  Select sel= new Select(driver.findElement(By.name("selectdropdown")));
	  sel.selectByVisibleText("Group 1,Option 2");
  }
  
  
 
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
