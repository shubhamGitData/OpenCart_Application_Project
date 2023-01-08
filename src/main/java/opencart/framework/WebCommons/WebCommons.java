package opencart.framework.WebCommons;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.relevantcodes.extentreports.LogStatus;

import opencart.framework.Extent_Reports.Extent_ReportClass;
import opencart.framework.WebDriver.WebdriverClass;

public class WebCommons {
	
	
	// This class will have all the common methods to perform actions on web application
	
	
		public  WebDriver driver = WebdriverClass.getDriver();
		
		// Method for Scroll to Element
		// Scroll into view / scroll on webelement using Java Script Executor
		
		public void scrolltoElement(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView()", element);
			
		}
		
		
		// Method to click
		
		public void clickElement(WebElement element) {
			scrolltoElement(element);
			element.click();
		}
		
		// Method To Enter Text in TextBox
		public void enterInfo(WebElement element, String value) {
			scrolltoElement(element);
			element.clear();
			element.sendKeys(value);
		}

		
		
		//Method to Select CheckBox
		
		public void selectCheckbox(WebElement element) {
			scrolltoElement(element);
			
			if(!element.isSelected())
				element.click();
		}
		
		
		
		// Method To Take Screenshots
		
		public  String takescreenshot(String screenshotName) {
			
			TakesScreenshot ts =(TakesScreenshot)driver;  //Take Screenshot
			
			File scr = ts.getScreenshotAs(OutputType.FILE);
			
			String path = (".\\Screenshots\\"+screenshotName+".png"); 
			
			try {
				FileUtils.copyFile(scr, new File(path));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return path;
			
			}
		
		
		
		
		// Method To Element Text
		
		
		public String getElementText(WebElement element) {
			scrolltoElement(element);
			return element.getText();
			
		}
		
		
		
		//Method to verify Enability of element
				public boolean checkEnability(WebElement element) {
					scrolltoElement(element);
					return element.isEnabled();
				}
		
		
		//Method to verify Selectibility of element
				public boolean checkSelectibility(WebElement element) {
					scrolltoElement(element);
					return element.isSelected();
				}
		
		
		
		//Method to verify availability of element
			public boolean checkAvailability(WebElement element) {
				scrolltoElement(element);
				return element.isDisplayed();
			}
		
		
		
		
		//Method to print custom messaged
			public void report(String message) {
				Extent_ReportClass.logger.log(LogStatus.INFO, message);
				
			}
		
		
		
		// Method for Taking Screenshot of WebElement
			
			
		
		public String elementScreenshot( WebElement ele, String screenshotName) {
			// TakesScreenshot ts= (TakesScreenshot)driver;
			
			
			
			File scr = ele.getScreenshotAs(OutputType.FILE);
			String path= (".\\Screenshots\\"+screenshotName+".png");
			
			try {
				FileUtils.copyFile(scr, new File(path));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return path;
		}
		
		
		
		// Method of Implicit Wait
		
		public void implicitWait(int timeInSecond) {
			driver.manage().timeouts().implicitlyWait(timeInSecond, TimeUnit.SECONDS);
		}
		

}
