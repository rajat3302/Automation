package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import propertyutility.Propertyutility;
import testingbaba_pages.Textbox_page;

public class Testbox_test extends BaseLibrary
{

	Textbox_page ob;
	@BeforeTest
	public void getlaunchurlTestingbaba()
	{
		
		getlaunchUrl(Propertyutility.getproperty("url"));
		ob= new Textbox_page();
	}
	@Test(priority = 0)
	public void clickonelements()
	{
		ob.clickonelements();
	}
	@Test(priority = 1)
	public void clickontextbox()
	{
		ob.clickontextbox();
	}
	@Test(priority = 2)
	public void filldetails()
	{
		ob.filldetails();
	}
	@Test(priority = 3)
	public void getverify()

	{
		ob.getverify();
	}
}
