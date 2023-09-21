package screenshotutility;



import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import baselibrary.BaseLibrary;

public class Screenshotutility extends BaseLibrary
{
   public static void getscreenshot(String foldername, String filename)
   {
	   String loction=System.getProperty("user.dir");
	   try 
	   {
		   String path= loction+"\\screenshots\\"+foldername+"\\"+filename+".jpeg";
		   EventFiringWebDriver efw= new EventFiringWebDriver(driver);
		   File src=efw.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(src, new File(path));
		   
	   } 
	   catch (Exception e)
	   {
		System.out.println("issue in getscrreenshot"+e);
	   }
   }
	
}
