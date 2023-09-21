package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import propertyutility.Propertyutility;

import testingbaba_pages.Tabs_page;

public class Tabs_test extends BaseLibrary
{
	Tabs_page ob;
	@BeforeTest
	public void getlaunchurlTestingbaba()
	{
		
		getlaunchUrl(Propertyutility.getproperty("url"));
		ob= new Tabs_page();

	}
	@Test(priority= 0)
	public void clickonwidgwts()
	{
		ob.clickonwidgets();
	}
	
	@Test(priority= 1)
	public void clickontab()
	{
		ob.clickontab();
	}
		
	@Test(priority= 2)
	public void clickontab1() 
	{
		ob.clickontab1();
	}
	
	@Test(priority= 3)
	public void clickontab2() 
	{
		ob.clickontab2();
	}
	
	
	
}
