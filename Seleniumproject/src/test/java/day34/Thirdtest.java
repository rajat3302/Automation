package day34;

import org.testng.annotations.Test;

public class Thirdtest 
{
     @Test(priority=1)
	 void test1()
	 {
		System.out.println("testing1"); 
	 }
	 @Test(priority=2)
	 void test2 ()
	 {
		 System.out.println("testing 2");
	 }
	 @Test(priority=3)
	 void test3()
	 {
		 System.out.println("testing 3");
	 }
	
}
