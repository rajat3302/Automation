package testingbaba_pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Application_utility;
import baselibrary.BaseLibrary;

public class Upload_page extends BaseLibrary
{
    public String path="C:\\Users\\rshro\\eclipse-workspace\\NewAutomationBatch_4pm\\testdata\\Testtable1.xlsx";
	public Upload_page() 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//*[@data-target=\"#elements\"]")
	private WebElement elements;
	@FindBy(xpath="//*[@href=\"#tab_8\"]")
	private WebElement uploadanddownload;
	@FindBy(xpath="//*[text()='Select a file']")
	private WebElement selcetfile;
	
	public void clickonelements() 
	{
		Application_utility.clickme(elements);
	}
	public void clickonuploadanddownload()
	{
		Application_utility.clickme(uploadanddownload);;
	}
	public void uploadfile()
	{
		Application_utility.clickme(selcetfile);
		Application_utility.fileuploading(path);
	}
	
}
