package testingbaba_pages;

import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baselibrary.BaseLibrary;
import excelutility.ExcelUtility;

public class Webtable_page extends BaseLibrary
{
	{
		PageFactory.initElements(driver, this);
	}
    String path="D:\\Users\\rs47956\\eclipse-workspace\\NewAutomationBatch_4pm\\rajatexcel.xlsx";
    @FindBy(xpath = "//*[@data-target=\"#elements\"]")
	private WebElement elements;
    
    @FindBy(xpath="//*[@href='#tab_4']")
    private WebElement webtables;
    
    @FindBy(xpath="//*[@id='tab_4']/div/iframe")
    private WebElement iframebox;
    
    @FindBy(xpath="//*[@pattern=\"^[a-zA-Z][\\sa-zA-Z]{2,32}\"]")
    private WebElement name;
    
    @FindBy(xpath="//*[@name='email']")
    private WebElement email;
    
    @FindBy(xpath="/html/body/div/form/button")
    private WebElement save;
    
    @FindBy(xpath="//*[@class=\"table table-bordered data-table\"]/thead/following::tbody/tr/td[1]")
    private List<WebElement> actualname;
    
    @FindBy(xpath="//*[@class=\"table table-bordered data-table\"]/thead/following::tbody/tr/td[2]")
    private List<WebElement> actualemail;
    
    @FindBy (xpath="//*[@class=\"btn btn-info btn-xs btn-edit\"]")
	private List<WebElement> edit;
	

	@FindBy(xpath="//*[@id=\"tab_4\"]/div/iframe")
	private WebElement iframe2;
	
	
	@FindBy(xpath="//*[@name=\"edit_name\"]")
	private WebElement editname;
	
	@FindBy(xpath="//*[@name=\"edit_email\"]")
	private WebElement editemail;
	
	@FindBy(xpath="//*[@class=\"btn btn-info btn-xs btn-update\"]")
	private WebElement updatekey;
    
    public void clickonelements() throws InterruptedException
	{
		elements.click();
		Thread.sleep(2000);
	}
   
    public void clickonwebtables()
    {
    	webtables.click();
    }
    public void detailsfill()
    {
    	driver.switchTo().frame(iframebox);
    	for(int i=1;i<=8;i++)
    	{
    	
    	name.sendKeys(ExcelUtility.getReaddata( path,0, i, 0));
    	email.sendKeys(ExcelUtility.getReaddata( path,0, i, 1));
    	save.click();
    	}
    	driver.switchTo().defaultContent();
    }
    public void getverify()
    {
		driver.switchTo().frame( iframe2);
		ArrayList<String> expected = new ArrayList<String>(); //verifyname
		ArrayList<String> actual = new ArrayList<String>();

		ArrayList<String> expected2 = new ArrayList<String>();//veryfyemail
		ArrayList<String> actual2 = new ArrayList<String>();
		ArrayList<String> edit1 = new ArrayList<String>();//edit
		
		
		 System.out.println(actual);
		 System.out.println(expected);
		for(int i=0;i<=actualname.size()-1;i++)
		 {
			 actual.add(actualname.get(i).getText());
			
		 }
		for(int i =1;i<=8;i++)
		{
		expected.add(ExcelUtility.getReaddata(path, 0, i, 0));
		System.out.println("bc");
		}
		
		for(int i=0;i<=actual.size()-1;i++)
		{
			Assert.assertEquals(actual.get(i), expected.get(i)); 
			
			System.out.println(i);
		}
		
			for(int i=0;i<=actualemail.size()-1;i++)//verifyemail
			 {
				 actual2.add(actualemail.get(i).getText());
			 }
			for(int i=1;i<=8;i++)
			{
			expected2.add(ExcelUtility.getReaddata(path, 0, i, 1));
			}
			 
			for(int i=0;i<actual2.size()-1;i++)
			{
				Assert.assertEquals(actual2.get(i), expected2.get(i));
		
			}
			for(int i=0;i<=edit.size()-1;i++)
			 {
				 edit1.add(edit.get(i).getText());
			 } 
	}
		
			public void getupdate()
			{
				
				System.out.println("poin");
			for(int i=0;i<8;i++)
			{
				edit.get(i).click();
	
				editname.clear();
				editname.sendKeys(ExcelUtility.getReaddata(path, 0, i+1, 2));	
				editemail.clear();
				editemail.sendKeys(ExcelUtility.getReaddata(path, 0, i+1, 3));
				updatekey.click();
				
				
			}
    	
    	
    	
    	
    	
    
			}    
}