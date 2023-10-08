package day24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class HandleDropdownwithSelecttag 
{

	public static void main(String[] args)
	{
		
		WebDriverManager.chromedriver().setup();
	      WebDriver driver= new ChromeDriver();
	      
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      
	      driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
	      driver.manage().window().maximize();
	      
	      
	      
	   WebElement drpelecountry =driver.findElement(By.xpath("//select[@id=\"country-list\"]"));
	
	Select drpcountry= new Select(drpelecountry);
	
	//1) select an option from the dropdown
	
	//drpcountry.selectByVisibleText("Brazil"); or 
	
	drpcountry.selectByValue("2"); // use this if only value attribute is available in option tag
	
	//find total options in dropdown

List<WebElement> options =drpcountry.getOptions(); // all options return <list> of web element 
	System.out.println("total no of options:"+options.size());
	
	// print options oin console window 
	
	for(int i=0;i<options.size();i++)
	{
		System.out.println(options.get(i).getText()); // get index of option
	}
	
	//using enhanced loop
	
	for( WebElement  op:options)
	{
		System.out.println(op.getText());
	}
	
		}
	

}
