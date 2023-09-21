package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baselibrary.BaseLibrary;
import propertyutility.Propertyutility;

public class Tabs_page extends BaseLibrary
{
  public Tabs_page()
  {
	  PageFactory.initElements(driver, this );
  }
  
  @FindBy(xpath="//*[@data-target=\'#widget\']")
  private WebElement widgets;
  
  @FindBy(xpath="//*[@href=\"#tab_21\"]")
  private WebElement tab;
  
  @FindBy(xpath="//*[@id='home-tab']")
  private WebElement tab1;
  
  @FindBy(xpath="//*[@id=\"home\"]/p")
  private WebElement readdata;
  
  @FindBy(xpath="//*[@id=\"profile-tab\"]")
  private WebElement tab2;

  @FindBy(xpath="//*[@id=\"profile\"]/p[1]")
  private WebElement readdata2;
  
  @FindBy(xpath="//*[@id=\"profile\"]/p[2]")
  private WebElement readdata3;
  public void clickonwidgets()
  {
	  widgets.click();
  }
  
  public void clickontab()
  {
	  tab.click();
  }
  public void clickontab1()
  {
	  
	 
	  tab1.click();
	  String actual= readdata.getText();
	  String expected= Propertyutility.getproperty("tab-1");
	  System.out.println(actual);
	  Assert.assertEquals(actual, expected);
  }
  
  public void clickontab2()
  {
	  tab2.click();
	  String actual2= readdata2.getText();
	  String expected2= Propertyutility.getproperty("tab-2");
	  System.out.println(actual2);
	  Assert.assertEquals(actual2, expected2);
	  
	  String actual3= readdata3.getText();
	  String expected3= Propertyutility.getproperty("tab-3");
	  System.out.println(actual3);
	  Assert.assertEquals(actual3, expected3);
  }
  
  
}
 











