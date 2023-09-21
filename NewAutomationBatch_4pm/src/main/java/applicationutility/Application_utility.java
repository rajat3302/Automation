package applicationutility;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import baselibrary.BaseLibrary;

public class Application_utility extends BaseLibrary
{
   public static void doubleclick(WebElement ele)
   {
	   Actions act= new Actions(driver);
	   act.doubleClick(ele).perform();
   }
   
   public static void rightclick(WebElement ele)
   {
	   Actions act= new Actions(driver);
	   act.contextClick(ele).perform();
   }
   public static void switchwindow(int tabno)
   
   {
	   Set<String> windows = driver.getWindowHandles();
	   ArrayList<String> li= new ArrayList<String>(windows);
	   driver.switchTo().window(li.get(tabno));
	   
   }
   public static void clickme(WebElement ele)
   {
	   WebDriverWait wait =new WebDriverWait(driver,5);
		 wait.until(ExpectedConditions.elementToBeClickable(ele));
		 ele.click();
	  
		 
   }
   public static void fileuploading(String path)
   {
	   try 
	   {
		StringSelection sel= new StringSelection(path);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(sel, null);  //cliboard par data set ho gya 
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(250);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
	   } 
	   catch (Exception e) 
	   {
		System.out.println("issue in file uploading"+e);
	   }
   }
   
   public static void Mousehover_action(WebDriver driver, WebElement ele) 
	{
	
		try 
		{
		   Actions action = new Actions(driver);
		   action.moveToElement(ele).perform();
		   
		   
		}
		catch (Exception e)
		{
			System.out.println("issue in mousehover"+e);
		}
	

	
	}
   

   
}
