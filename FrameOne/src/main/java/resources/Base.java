package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public WebDriver driver;
	
	public WebDriver invokeBrowser() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\hitendram\\FrameOne\\src\\main\\java\\resources\\dataone.properties");
		prop.load(fis);
		
		String browsername =prop.getProperty("browser");
		
		if(browsername.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\My_Data\\Learn\\Learning Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
				
		else if(browsername.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\My_Data\\Learn\\Learning Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}		
		
		driver.manage().window().maximize();
	
		String site=prop.getProperty("url");
		driver.get(site);
		
		return driver;
	}
	
	public void closeBrowserSession() throws IOException
	{
		 driver=invokeBrowser();
		 driver.close();
	}
	
}
