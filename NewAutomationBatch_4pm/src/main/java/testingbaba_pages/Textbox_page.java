package testingbaba_pages;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import baselibrary.BaseLibrary;
import excelutility.ExcelUtility;

import propertyutility.Propertyutility;

public class Textbox_page extends BaseLibrary
 {
	public Textbox_page()
	{
		PageFactory.initElements(driver, this );
	}
 
	String path="D:\\Users\\rs47956\\eclipse-workspace\\NewAutomationBatch_4pm\\testdata\\testdata_6pm.xlsx";
	@FindBy(xpath="//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button") 
	private WebElement elements;
	
	@FindBy(xpath="//*[text()='text box']")
	private WebElement textbox;
	
	@FindBy(xpath="//*[@id=\"fullname1\"]")
	private WebElement fullname;
	
	@FindBy(xpath="//*[@id=\"fullemail1\"]")
	private WebElement email;
	
	@FindBy(xpath="//*[@id=\"fulladdresh1\"]")
	private WebElement fulladdress;
	
	@FindBy(xpath="//*[@id=\"paddresh1\"]")
	private WebElement permanentaddress;
	
	@FindBy(xpath="//*[@id=\"tab_1\"]/div/div[1]/form/input[3]")
	private WebElement submit;
	
	@FindBy(xpath="//*[@class=\"col-md-6 mt-5\"]/label")
	private List<WebElement> actualelements;
	
	public void clickonelements()
	{
		elements.click();
	}
	public void clickontextbox()
	{
		textbox.click();
	}
	public void filldetails() 
	{
		/*fullname.sendKeys(ExcelUtility.getReaddata(path, 1, 0));
		email.sendKeys(ExcelUtility.getReaddata(path, 1, 1));
		fulladdress.sendKeys(ExcelUtility.getReaddata(path, 1, 2));
		permanentaddress.sendKeys(ExcelUtility.getReaddata(path, 1, 3));
		submit.click(); */



		fullname.sendKeys(Propertyutility.getproperty("Fullname"));
        email.sendKeys(Propertyutility.getproperty("Email"));
	    fulladdress.sendKeys(Propertyutility.getproperty("Current"));
	    permanentaddress.sendKeys(Propertyutility.getproperty("Permanent"));
		submit.click();
				
	}
	public void getverify()
	{
		ArrayList<String> expected=  new ArrayList<String>();
		ArrayList<String> actual =  new ArrayList<String>();
		for(int i=1;i<=actualelements.size()-1;i++)
		{
			actual.add(actualelements.get(i).getText());
			i++;
		}
		
		/*expected.add(ExcelUtility.getReaddata(path, 1, 0));
		expected.add(ExcelUtility.getReaddata(path, 1, 1));
		expected.add(ExcelUtility.getReaddata(path, 1, 2));
		expected.add(ExcelUtility.getReaddata(path, 1, 3));*/
		
		expected.add(Propertyutility.getproperty("Fullname"));
		expected.add(Propertyutility.getproperty("Email"));
		expected.add(Propertyutility.getproperty("Current"));
		expected.add(Propertyutility.getproperty("Permanent"));
		
	
		SoftAssert assertt = new SoftAssert(); 
		
		for(int i=0;i<=actual.size()-1;i++)
		{
			String abc = actual.get(i);
			System.out.println(abc);
			assertt.assertEquals(actual.get(i), expected.get(i));
		
		}
		assertt.assertAll();
	}
	
 }
