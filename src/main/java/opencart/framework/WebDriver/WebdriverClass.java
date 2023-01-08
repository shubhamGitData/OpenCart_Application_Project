package opencart.framework.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import opencart.framework.Extent_Reports.Extent_ReportClass;
import opencart.framework.Utility.Read_Property_File;

public class WebdriverClass extends Extent_ReportClass{

	
	// This class will have all the methods related  Browser

	
	
		public static WebDriver driver;
		
		
	 
		@BeforeMethod (alwaysRun=true)
		@Parameters(value="Browser")
		public static void launchBrowser(String Browser) {
			
			if(Browser.equalsIgnoreCase("Chrome")) 
			{
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				
			} else if(Browser.equalsIgnoreCase("Edge")) 
			{
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			} else if(Browser.equalsIgnoreCase("Firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
			
			
			
			driver.manage().window().maximize();
			
			driver.manage().deleteAllCookies();
			
			driver.get(Read_Property_File.readData("Configuration_File.properties").getProperty("url"));
		}

		
		
		// This method will be used to close Browser window

		@AfterMethod
		public static void tearDownBrowser() {
			driver.quit();
		}
		
		
		
		// This method will be used to Get WebDriver

		public static WebDriver getDriver() {
			return driver;
		}
		
		
		
		
		
		
}
