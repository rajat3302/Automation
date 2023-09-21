package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import propertyutility.Propertyutility;
import testingbaba_pages.Alerts_page;


public class Alerts_test extends BaseLibrary
{

	Alerts_page ob;
	@BeforeTest
	public void getlaunchurlTestingbaba()
	{
		
		getlaunchUrl(Propertyutility.getproperty("url"));
		ob= new Alerts_page();
	}
	
	@Test(priority=1)
	public void clickonAlertsframe() throws InterruptedException
	{
		ob.clickonalertsfrmae();
	}
	@Test(priority=2)
	public void clickonalerts()
	{
		ob.clickonalerts();
	}
	@Test(priority=3)
	public void clickonmyalerts()
	{
		ob.clickonmyalerts();
	}
	@Test(priority=4)
	public void clickonmyalerts1() throws InterruptedException
	{
		ob.clickonmyalerts1();
	}
	@Test(priority=5)
	public void  clickonmyalerts2()
	{
		ob.clickonmyalerts2();
	}
	@Test(priority=6)
	public void clickonmyalerts3() throws InterruptedException
	{
		ob.clickonmyalerts3();
	}
}
