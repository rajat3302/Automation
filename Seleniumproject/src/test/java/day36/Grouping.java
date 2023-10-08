package day36;

import org.testng.annotations.Test;

/*
loginByEmail  - sanity & regression
loginByfacebook - sanity
loginBytwitter  - sanity

signupbyemail - sanity & regression
signupbyfacebook  - regression
signupbytwitter  - regression

paymentinrupees - sanity & regression
paymentindollar - sanity  
paymentReturnbyBank  - regression
*/



public class Grouping 
{
    @Test(priority=1,groups= {"sanity","regression"})
	void loginByEmail()
	{
		System.out.println("this is login by email");
	}
	
    @Test(priority=2,groups= {"sanity"})
	void loginByFacebook()
	{
		System.out.println("this is facebook");
		
	}
    @Test(priority=3,groups= {"sanity"})
	void loginByTwitter()
	{
		System.out.println("this is twitter");
	}
    @Test(priority=4,groups= {"sanity","regression"})
	void signupByemail()
	{
		System.out.println("signup by email");
	}
    @Test(priority=5,groups= {"regression"})
	void SignByFacebook()
	{
		System.out.println("this signup is facebook");
		
	}
    @Test(priority=6,groups= {"regression"})
	void SignByTwitter()
	{
		System.out.println("this signup is twitter");
	}
    @Test(priority=7,groups= {"sanity","regression"})
	void paymentindollar()
	{
		System.out.println("this is paymentin dolar");
	}
    @Test(priority=8,groups= {"sanity"})
	void paymentinrupess()
	{
		System.out.println("this is paymnent in rupees");
	}
	
    @Test(priority=9,groups= {"regression"})
	void paymentreturnbyBank()
	{
		System.out.println("this is payment by bank ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
