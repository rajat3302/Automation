package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import propertyutility.Propertyutility;
import testingbaba_pages.Checkbox_page;
import testingbaba_pages.Textbox_page;

public class Checkbox_test extends BaseLibrary
{
	Checkbox_page ob;
	@BeforeTest
	public void getlaunchurlTestingbaba()
	{
		
		getlaunchUrl(Propertyutility.getproperty("url"));
		ob= new Checkbox_page();
	}
	
	@Test(priority = 0)
	public void clickonelements()
	
	{
		ob.clickonelements();
	}
	@Test(priority= 1)
	public void clickoncheckbox()
	{
		ob.clickoncheckbox();
	}
	@Test(priority= 2)
	public void clickonframe()
	{
		ob.clickonframe();
	}
	
	
	
}
   