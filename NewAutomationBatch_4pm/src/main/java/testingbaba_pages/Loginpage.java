package testingbaba_pages;

import baselibrary.BaseLibrary;

public class Loginpage extends BaseLibrary
{
	public void gettiltleTestingbaba()
	{
		String title = driver.getTitle();
		System.out.println("Testing baba title is :"+title);
		
		
	}
		
}
