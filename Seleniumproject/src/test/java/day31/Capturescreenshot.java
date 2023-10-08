package day31;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Capturescreenshot 
{

	public static void main(String[] args) throws IOException 
	
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//capture fullpage screenshot 
		
	/*	TakesScreenshot ts= (TakesScreenshot)driver; // first to create var and assign driver into it 
	    File	src =ts.getScreenshotAs(OutputType.FILE); // cpature screwnshot 
		File trg= new File("R:\\newgitrepo\\Seleniumproject\\screenshot\\fullpage.png");
		FileUtils.copyFile(src, trg);
	*/	
		//capture specific are on webpage -- 
		
/*	WebElement	featureproducts =driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid'][1]"));
	File src =featureproducts.getScreenshotAs(OutputType.FILE);
	File trg= new File("R:\\newgitrepo\\Seleniumproject\\screenshot\\featureprouct.png");
	FileUtils.copyFile(src, trg);
	}
*/
	//cpature screenshot specific webl=elemnt 
	
WebElement	specificweb = driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
File src= specificweb.getScreenshotAs(OutputType.FILE);
File trg= new File("R:\\newgitrepo\\Seleniumproject\\screenshot\\specificele.png");
FileUtils.copyFile(src, trg);
	
	
	
	
	}	
}
