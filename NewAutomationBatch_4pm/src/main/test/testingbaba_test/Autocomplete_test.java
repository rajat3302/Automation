package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import propertyutility.Propertyutility;
import testingbaba_pages.Autocomplete_page;


public class Autocomplete_test extends BaseLibrary
{
	Autocomplete_page ob;
	@BeforeTest
	public void getlaunchurl() throws InterruptedException
	{
		
		getlaunchUrl(Propertyutility.getproperty("url"));
		ob= new Autocomplete_page();

	}
	
	
    @Test(priority=1)
    public void clickonwidgets()
    {
    	ob.clickonwidgets();
    }
    
    @Test(priority=2)
    public void clickonautocomplete()
    {
    	ob.clickonautocomplete();
    }
    
    @Test(priority=3)
    public void filldetails() throws InterruptedException
    {
    	ob.filldetails();
    }
}
