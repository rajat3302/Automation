package testingbaba_pages;




import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Application_utility;
import baselibrary.BaseLibrary;

public class Mousehover_page extends BaseLibrary
{
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@data-target='#widget']")
	private WebElement widgets;
	
	@FindBy(xpath="//*[@href='#tab_22']")
	private WebElement tooltips;
	
	@FindBy(xpath="//*[@data-toggle=\"tooltip\"][2]")
	private WebElement mousehover;
	
	public void clickonwidgets() throws InterruptedException 
	{
		Thread.sleep(2000);
		widgets.click();
		
	}
	
	public void clickontooltips() throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", tooltips);
		tooltips.click();
		System.out.println("xyz");
	}
	
	public void clickonmousehover()
	{
		Application_utility.clickme(mousehover);
		String tooltips =mousehover.getAttribute("title");
	//	assertEquals(tooltips, "you hovered over the input");
		System.out.println(tooltips);
		
		
		
		
	
	}
}
