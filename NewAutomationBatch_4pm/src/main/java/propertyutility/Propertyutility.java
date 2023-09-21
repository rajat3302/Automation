package propertyutility;

import java.io.FileInputStream;
import java.util.Properties;

public class Propertyutility
{
	static String path="C:\\Users\\rshro\\eclipse-workspace\\NewAutomationBatch_4pm\\testdata\\config.properties";
	
	public static String getproperty(String key)
	{
		String value="";
		try
		{
			FileInputStream fis= new FileInputStream(path);
			Properties prop= new Properties();
			prop.load(fis);
			value =prop.getProperty(key);
			
			
			
			
		} 
		catch (Exception e)
		{
			System.out.println("issue in get readdata"+e);
		}
		return value;
	}
	
	

}
