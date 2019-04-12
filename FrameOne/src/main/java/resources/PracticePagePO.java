package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticePagePO extends Base  {
	

	
	By Radio2=By.xpath("//input[@value='radio2']");
	By Country=By.cssSelector("input[placeholder='Select Countries']");
	
	
	public PracticePagePO(WebDriver driver)
	{
		this.driver=driver;
	}
	

	public WebElement SelectRadio()
	{
		return driver.findElement(Radio2);
	}
	
	
	public WebElement SelectCountry()
	{
		return driver.findElement(Country);
	}

	

	
}
