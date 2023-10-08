package day32;

import java.io.FileInputStream;

import java.io.IOException;


// file-- workbook-- sheets-- rows-- Cellls

public class ReadingExcel 
{

	public static void main(String[] args) throws IOException
	{
		// this is give you current project path of file 
		FileInputStream file= new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
	//	XSSFWorkbook workbook= new XSSFWorkbook(file);
		
		// to get the sheet you have two ,mthode 
     //   XSSFSheet sheet =workbook.getSheet("Sheet1"); //  withshhet name 
	//	workbook.getSheetAt(0); //  or with sheet index
        
  /*    int  totalrows =sheet.getLastRowNum(); 
      
    int totalcells =sheet.getRow(1).getLastCellNum();
      
    System.out.println("number of rows:"+totalrows);
    System.out.println("number of columns:"+totalcells);
    
      for(int r=0;r<=totalrows;r++)
      {
    XSSFRow	 currentrow = sheet.getRow(r);
    	  
    	  for(int c=0;c<totalcells;c++)
    	  {
    	//	 XSSFCell cell= currentrow.getCell(c);
    		// String value  =cell.toString();  
    		 
    String	value	=  currentrow.getCell(c).toString();
    	 System.out.println(value+"   ");
    	  
    	  }
    	  System.out.println();
      }
      
      workbook.close();
      file.close();
      */
      }

}
