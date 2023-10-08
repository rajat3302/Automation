package excelutility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility
{
	
   public static String getReaddata( String path,int shetno, int rowno, int colno)
   {
	   
	   String value="";
	   try
	   {
		  FileInputStream fis= new FileInputStream(path);
		  XSSFWorkbook wb= new XSSFWorkbook(fis);
		  XSSFSheet sheetno =wb.getSheetAt(shetno);
		  value =sheetno.getRow(rowno).getCell(colno).getStringCellValue();	 
		} 
	   catch (Exception e)
	   {
	     System.out.println("issue in getreaddata"+e);
	   }
	   return value;
   }
	
	
	
}
