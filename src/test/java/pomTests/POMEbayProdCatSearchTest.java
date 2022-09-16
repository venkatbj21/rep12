package pomTests;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pomPages.BrowserFactory;
import pomPages.ClsEbay;

public class POMEbayProdCatSearchTest
{
	@Test
	  public void catSearch() 
	  {
			WebDriver driver=BrowserFactory.startBrowser("Chrome", "http://ebay.com");

			ClsEbay obj=new ClsEbay(driver);
			obj.fnCatSearch("Books", "Selenium WebDriver");

			Reporter.log("Ebay Product Search in a category Test is Successful...",true);
	  }
}
