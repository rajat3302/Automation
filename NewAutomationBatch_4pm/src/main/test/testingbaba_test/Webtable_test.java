package testingbaba_test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import propertyutility.Propertyutility;
import testingbaba_pages.Textbox_page;
import testingbaba_pages.Webtable_page;

public class Webtable_test extends BaseLibrary
{
	Webtable_page ob;
	@BeforeTest
	public void getlaunchurlTestingbaba()
	{
		
		getlaunchUrl(Propertyutility.getproperty("url"));
		ob= new Webtable_page();
	}
	@Test(priority=0)
	public void clickonelements() throws InterruptedException
	{
		ob.clickonelements();
	}
	@Test(priority=1)
	 public void clickonwebtables()
	 {
		 ob.clickonwebtables();
	 }
	@Test(priority=2)
	  public void detailsfill()
	  {
		ob.detailsfill();
	  }
	 @Test(priority=3)
	 public void getverify()
	 {
		 ob.getverify();
	 }
	 
	 @Test(priority= 4)
	 public void getupdate() 
	 {
		ob.getupdate(); 
	 }
	 
}
