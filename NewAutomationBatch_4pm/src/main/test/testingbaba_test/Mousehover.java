package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import propertyutility.Propertyutility;
import testingbaba_pages.Mousehover_page;


public class Mousehover extends BaseLibrary 
{
	Mousehover_page ob;
	@BeforeTest
	public void getlaunchurlTestingbaba() throws InterruptedException
	{
		
		getlaunchUrl(Propertyutility.getproperty("url"));
		ob= new Mousehover_page();

	}
	@Test(priority=0)
	public void clickonwidgets() throws InterruptedException
	{
		ob.clickonwidgets();
	}
	
	@Test(priority=1)
	public void clickontooltips() throws InterruptedException
	{
		ob.clickontooltips();
	}
	@Test(priority=2)
	public void clickonmousehover()
	{
		ob.clickonmousehover();
	}
	
	
	
}
