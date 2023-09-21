package testingbaba_test;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import propertyutility.Propertyutility;
import testingbaba_pages.Selectdropdown_page;

public class Selectdropdown_test extends BaseLibrary
{
	Selectdropdown_page ob;
	@BeforeTest
	public void getlaunchtestingbabulr()
	{
		getlaunchUrl(Propertyutility.getproperty("url"));
		ob=new Selectdropdown_page();
	}
	
	@Test(priority=1)
	
		public void clickonwidgets() throws InterruptedException
		{
			ob.clickonwidgets();
		}
	
	@Test(priority=2)
	
		public void clickonselectmenu() throws InterruptedException
		{
			ob.clickonselctmenu();
		}
	
	@Test(priority=3)
	
	    public void clickonselctdropdown()
	    {
		 ob.clickonselctdropdown();
	    }
	

	}
	
	

