package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import testingbaba_pages.Loginpage;

public class Logintest  extends BaseLibrary
{

	Loginpage ob;
	
	@BeforeTest
	public void getlaunchurlTestingbaba()
	{
		
		getlaunchUrl("https://margadarshi.smarttvm.in:3045/index.html");
		ob= new Loginpage();
	}
	
	@Test
	public void gettitle()
	{
		ob.gettiltleTestingbaba();
	}
	
}
