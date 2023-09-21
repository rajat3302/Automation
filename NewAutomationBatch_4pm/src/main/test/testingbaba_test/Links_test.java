package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import propertyutility.Propertyutility;

import testingbaba_pages.Links_page;

public class Links_test extends BaseLibrary
{
	Links_page ob;
	@BeforeTest
	public void getlaunchurlTestingbaba()
	{
		
		getlaunchUrl(Propertyutility.getproperty("url"));
		ob= new Links_page();

	}
	
	@Test(priority= 1)
	public void clickonelements()
	{
		ob.clickonelements();
	}
	@Test(priority= 2)
	public void clickonlinks()
	{
		ob.clickonlinks();
	}
	@Test(priority= 3)
	public void clickondemopagelink()
	{
		ob.clickondemopagelink();
	}
}
