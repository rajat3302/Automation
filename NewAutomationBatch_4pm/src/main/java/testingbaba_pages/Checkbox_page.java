package testingbaba_pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;
import propertyutility.Propertyutility;


public class Checkbox_page extends BaseLibrary
{
	public Checkbox_page() 
	{
	    PageFactory.initElements(driver, this);
	}
   
	@FindBy(xpath = "//*[@data-target=\"#elements\"]")
	private WebElement elements;
	
	@FindBy(xpath = "//*[text()='check box']")
	private WebElement checkbox;
	
	@FindBy(xpath = "//*[@id=\"tab_2\"]/div/iframe")
	private WebElement checkboxframe;
	
	@FindBy(xpath = "//*[@onclick=\"myFunction()\"]")
	private WebElement mobilecheckbox;
	
	@FindBy(xpath = "//*[text()='You are selected Mobile']")
    private WebElement mobiletext;	
	
	@FindBy(xpath = "//*[@onclick=\"myFunction1()\"]")
    private WebElement laptopcheckbox;
	
	@FindBy(xpath = "//*[text()='You are Selected Laptop']")
    private WebElement laptoptext;	
	
	@FindBy(xpath = "//*[@onclick=\"myFunction2()\"]")
    private WebElement desktopcheckbox;
	
	@FindBy(xpath = "//*[text()='You are Selected Desktop']")
    private WebElement desktoptext;
	
	
	
	
	
	public void clickonelements()
	{
		elements.click();
	}
	public void clickoncheckbox()
	{
		checkbox.click();
	}
	public void clickonframe()
	{
		driver.switchTo().frame(checkboxframe);
		mobilecheckbox.click();
		String actual = mobiletext.getText();
		String expected = Propertyutility.getproperty("mobile");
		Assert.assertEquals(actual, expected);	
	
		laptopcheckbox.click();
		String actual1 = laptoptext.getText();
		String expected1 = Propertyutility.getproperty("laptop");
		Assert.assertEquals(actual1, expected1);	
	
     	desktopcheckbox.click();
		String actual2 = desktoptext.getText();
		String expected2 = Propertyutility.getproperty("desktop");
		Assert.assertEquals(actual2, expected2);
	}

	
	
	
}
