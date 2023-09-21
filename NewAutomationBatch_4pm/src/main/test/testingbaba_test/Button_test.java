package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import propertyutility.Propertyutility;
import testingbaba_pages.Button_page;


public class Button_test extends BaseLibrary
{
	Button_page ob;
	@BeforeTest
	public void getlaunchurlTestingbaba()
	{
		
		getlaunchUrl(Propertyutility.getproperty("url"));
		ob= new Button_page();
	}
	
	@Test(priority= 1)
	public void clickonelements()
	{
		ob.clickonelements();
	}
	@Test(priority= 2)
	public void clickonebutton()
	{
		ob.clickonbutton();
	}
	@Test(priority= 3)
	public void performdobuleclick()
	{
		ob.performdobuleclick();
	}
	@Test(priority= 4)
	public void performrightclick()
	{
		ob.performrightclick();
	}
	
	@Test(priority=5)
	public void getverify()
	
	{
		ob.getverify();
	}
	
}
