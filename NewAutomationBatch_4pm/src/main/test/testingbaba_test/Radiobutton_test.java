package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import propertyutility.Propertyutility;

import testingbaba_pages.Radiobutton_page;

public class Radiobutton_test extends BaseLibrary
{
	Radiobutton_page ob;
	@BeforeTest
	public void getlaunchurlTestingbaba()
	{
		
		getlaunchUrl(Propertyutility.getproperty("url"));
		ob= new Radiobutton_page();
	}
	@Test(priority = 0)
	public void clickonelements()
	
	{
		ob.clickonelements();
	}
	
	@Test(priority=  1)
	
		public void clickonradiobutton()		
	    {
		ob.clickonradiobutton();
		}
				
	}

