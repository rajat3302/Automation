package waitutility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baselibrary.BaseLibrary;

public class Waitutility extends BaseLibrary
{

	
	 public static void visibilityofelements(WebElement ele)
	 {
		 WebDriverWait wait= new WebDriverWait(driver, 5);
		 wait.until(ExpectedConditions.visibilityOf(ele));
	 }
	 public static void elementtobeclikable(WebElement ele)
	 {
		 
		 WebDriverWait wait =new WebDriverWait(driver,5);
		 wait.until(ExpectedConditions.elementToBeClickable(ele));
	 }
}
