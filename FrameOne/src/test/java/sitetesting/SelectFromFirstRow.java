package sitetesting;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.Base;
import resources.PracticePagePO;

public class SelectFromFirstRow {
	
	public WebDriver driver;
	
	@BeforeTest
	public WebDriver StartBrowser() throws IOException
	{
		Base driver=new Base();
		return this.driver=driver.invokeBrowser();		
	}
	
	
	
	@Test
	public void SelectionfromRows() throws InterruptedException
	{
		PracticePagePO pp= new PracticePagePO(driver);
		pp.SelectRadio().click();
		Thread.sleep(2000);		
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
	
}
