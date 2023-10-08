package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Statictabledemo {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		//1 find total no of rows in atable 
		
    int	rows = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr")).size();
	System.out.println("no of rows:"+rows);	
	
	
		//2 find total no. of columns
	
int columns	=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("no. of columns:"+columns);
		// 3 read specific row nad column data
		
//String	text =driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr[5]/td[2]")).getText();
	//	System.out.println("value of 5 row and 2 col:"+text);
		
		// 4 read dat from all the rows and columns 
		
		for(int r=2;r<=rows;r++) //rpresnt row
		{
			for(int c=1;c<=columns;c++) /// represnt colunm
			{
				
				// concept pass the prametesr into xpath this is pagimentation 
				String	text =driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+r+"]/td["+c+"]")).getText();
			//	System.out.println(text);	
			// here is+c+ is syntax not cocantination 
			
			// if we print data in tabular form so 
				
				System.out.print(text+"\t");	
			}
			System.out.println();
		}
		
		
		// 5 print book names whose author is amit 
		
		for(int i=2;i<=rows;i++)
		{
			
	    String	author =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td[2]")).getText();
		//System.out.println(author); get all author name 
	    if(author.equals("Amit")) // change only col no. for book print by amit author 
		 {
		String	bookname =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td[1]")).getText();	 
		System.out.println(author+"    "+bookname);
		 }
		}
		
		
		// 6 find sum of prices for all the books 
		int sum=0;
		for(int p=2;p<=rows;p++)
		{
	String	price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+p+"]/td[4]")).getText();
		sum=sum+Integer.parseInt(price); // convert string into int 

		}
		System.out.println("total price of books:"+sum);
		
		
		//driver.quit();

	}

}
