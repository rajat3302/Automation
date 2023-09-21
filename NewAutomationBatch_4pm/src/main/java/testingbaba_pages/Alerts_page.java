package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;
import propertyutility.Propertyutility;
import waitutility.Waitutility;

public class Alerts_page extends BaseLibrary
{
   public Alerts_page()
   {
	   PageFactory.initElements(driver, this);
   }
   
   @FindBy(xpath="//*[@data-target=\"#alerts\"]")
   private WebElement alertsframe;
   
   @FindBy(xpath="//*[@href=\"#tab_12\"]")
   private WebElement alerts;
   
   @FindBy(xpath="//*[@onclick=\"myalert()\"]")
   private WebElement myalerts;
   
   @FindBy(xpath="//*[@onclick=\"aftersec5()\"]")
   private WebElement myalerts1;
   
   @FindBy(xpath="//*[@onclick=\"myconfirm()\"]")
   private WebElement myalerts2;
   
   @FindBy(xpath="//*[@onclick=\"myprompt()\"]")
   private WebElement myalerts3;
   
   
   public void clickonalertsfrmae() throws InterruptedException
   {
	   Waitutility.elementtobeclikable(alertsframe);
	   alertsframe.click();
	   Thread.sleep(2000);
   }
   public void clickonalerts()
   {
	   
	   alerts.click();
   }
   public void clickonmyalerts()
   {
	   myalerts.click();
	   String data = driver.switchTo().alert().getText();
	   System.out.println(data);
	   driver.switchTo().alert().accept();
   }
   public void clickonmyalerts1() throws InterruptedException
   {
	   
	   myalerts1.click();
	//   Waitutility.visibilityofelements(myalerts1);
	   Thread.sleep(5000);
	   String data1 = driver.switchTo().alert().getText();
	   System.out.println(data1);
	   driver.switchTo().alert().accept();
   }
   public void clickonmyalerts2()
   {
	   myalerts2.click();
	   String data2 = driver.switchTo().alert().getText();
	   System.out.println(data2);
	   driver.switchTo().alert().dismiss();
   }
   public void clickonmyalerts3() throws InterruptedException
   {  
	   Thread.sleep(2000);
	   myalerts3.click();
	   String data3 = driver.switchTo().alert().getText();
	   System.out.println(data3);
	   driver.switchTo().alert().sendKeys(Propertyutility.getproperty("key"));
	   driver.switchTo().alert().accept();
	   
   }
}
