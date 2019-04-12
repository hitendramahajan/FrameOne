package sitetesting;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
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
	
		pp.SelectCountry().sendKeys("Ind");
		Thread.sleep(3000);
		
		Actions a=new Actions(driver);
		a.sendKeys(Keys.ARROW_DOWN).perform();
		a.sendKeys(Keys.ARROW_DOWN).perform();
		a.sendKeys(Keys.ENTER).perform();
	}
	
	@AfterTest
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}
	
}
