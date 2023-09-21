package testingbaba_pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Application_utility;
import baselibrary.BaseLibrary;
import propertyutility.Propertyutility;
import waitutility.Waitutility;

public class Button_page extends BaseLibrary
{

	public Button_page() 
	{
	   PageFactory.initElements(driver, this );
	}
	
	@FindBy(xpath="//*[@data-target=\"#elements\"]")
	private WebElement elements;
	@FindBy(xpath="//*[@href=\"#tab_5\"]")
	private WebElement button;
	@FindBy(xpath="//*[@ondblclick=\"doubletext()\"]")
	private WebElement doublleclick;
	@FindBy(xpath="//*[@oncontextmenu=\"righttext()\"]")
	private WebElement rightclick;
	
	@FindBy(xpath="//*[text()='you have done a double click']")
	private WebElement doubletext;
	
	@FindBy(xpath="//*[text()='you have done a right click']")
	private WebElement singletext;
	
	public void clickonelements()
	{
		elements.click();
	}
	public void clickonbutton()
	{
		try
		{
			Waitutility.elementtobeclikable(button);
			button.click();
		} catch (Exception e)
		{
			System.out.println("issue inclickonbutton"+e);
		}
	}
	public void performdobuleclick()
	{
		Application_utility.doubleclick(doublleclick);
	}
	public void performrightclick()
	{
		Application_utility.rightclick(rightclick);
	}
	public void getverify()
	{
		doublleclick.click();
		String actual = doubletext.getText();
		String expected = Propertyutility.getproperty("doubleclick");
		Assert.assertEquals(actual, expected);
		
		rightclick.click();
		String actual1 = singletext.getText();
		String expected2 = Propertyutility.getproperty("singleclick");
		Assert.assertEquals(actual, expected);
	}
	
	
}
