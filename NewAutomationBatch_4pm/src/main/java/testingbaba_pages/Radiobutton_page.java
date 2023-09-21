package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Radiobutton_page extends BaseLibrary
{
	{
	    PageFactory.initElements(driver, this);
	}
   
	@FindBy(xpath = "//*[@data-target=\"#elements\"]")
	private WebElement elements;
	
	@FindBy(xpath="//*[@id=\"v-pills-tab\"]/a[3]")
	private WebElement radioelements;
	
	@FindBy(xpath="//*[@id=\"yes\"]")
	private WebElement yes;
	
	@FindBy(xpath="//*[@id=\"impressive\"]")
	private WebElement impressive;
	
	@FindBy(xpath="//*[@id=\"no\"]")
	private WebElement no;
	

	public void clickonelements()
	{
		elements.click();
	}
	
	public void clickonradiobutton()
	{
		radioelements.click();
		yes.click();
		impressive.click();
		no.click();
		
		
	}
	
}
