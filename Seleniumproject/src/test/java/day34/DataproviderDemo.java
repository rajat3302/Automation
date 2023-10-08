package day34;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataproviderDemo 
{
	WebDriver driver;
	
	
   @BeforeClass
   void setup()
   {
	   WebDriverManager.chromedriver().setup();
	   driver= new ChromeDriver();
   }
   
   @Test(dataProvider="dp")// here dataprovider is one of the parameter of test anatoations
   void testlogin(String email, String pwd)
   {
	    driver.get("https://demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		
		String exp_title = "nopCommerce demo store";
		String act_title = driver.getTitle();
		
		assertEquals(exp_title, act_title);
   }
	
   @AfterClass
	void teardown()
	{
		driver.close();
	}
   
 /*  @DataProvider(name="dp") // here staprovider is annotations
   String [][] logindata() // data have string type so, we provide rwturn type string 
   {    
	   //this is data in two diminsional array
	   String data[][]= 
		   {  
				{ "abc@gmail.com", "test123" },   // invalid
				{ "rshrotriya3@gmail.com", "Rajat@3302" }, //valid
				{ "pavanoltraining@gmail.com", "test3" },  // invalid
				{ "pavanoltraining@gmail.com", "test@123" }, // invalid
				{ "rshrotriya3@gmail.com", "Rajat@3302" }  // invalid
			};
	   return data;   */
   
 /*  @DataProvider(name="dp")
   public static Object[][] readdata(String path,int sheetno, int rowno, int colno ) throws IOException
   {
	   String value;
	   path="R:\\newgitrepo\\Seleniumproject\\testdata\\execeldata.xlsx";
	  try 
	  {
		  FileInputStream fis= new FileInputStream(path);
		  XSSFWorkbook wb= new XSSFWorkbook(fis);
		  XSSFSheet sheet= wb.getSheetAt(0);
	      value= sheet.getRow(rowno).getCell(colno).getStringCellValue();
	 
	  
	        Object[][] data = new Object[rowno][colno];

	        for (int i = 0; i < rowno; i++) {
	            Row row = sheet.getRow(i);
	            for (int j = 0; j < colno; j++) {
	                Cell cell = row.getCell(j);
	                data[i][j] = cell.toString();

	            }
	        }  } 
	  catch (Exception e) 
	  {
	     System.out.println("isuue in read data"+e);
	  }
	 
	return null;
	*/
	   
   } 
	
	
   
   

