package sitetesting;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.Base;

public class SearchFlight {
	

	
	@Test
	public void selectFromAndTo() throws IOException
	{
		System.out.println("Tested");
	}
	
	
	@BeforeTest
	public void StartBrowser() throws IOException
	{
		Base bopen=new Base();
		bopen.invokeBrowser();
		
	}
	
	/*@AfterTest
	/public void closeBrowser()
	{
		Base bclose=new Base();
		bclose.closeBrowserSession();
	}
	*/
}
