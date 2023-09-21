package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import propertyutility.Propertyutility;
import testingbaba_pages.Upload_page;

public class Upload_test extends BaseLibrary
{
	Upload_page ob;
	
	@BeforeTest
	public void getlaunchurl()
	{
		getlaunchUrl(Propertyutility.getproperty("url"));
		ob= new Upload_page();
		
	}
	@Test(priority=1)
	public void clickonelements()
	{
		ob.clickonelements();
	}
	@Test(priority=2)
	public void clickonuploadanddownload()
	{
		ob.clickonuploadanddownload();
	}
	@Test(priority=3)
	public void clickonslectfile()
	{
		ob.uploadfile();
	}
}