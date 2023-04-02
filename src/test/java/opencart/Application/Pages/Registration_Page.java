package opencart.Application.Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import opencart.framework.WebCommons.WebCommons;
import opencart.framework.WebDriver.WebdriverClass;

public class Registration_Page extends WebCommons {

	//Registration Page Web Element
 	
	@FindBy (xpath="//span[text()='My Account']")
	private WebElement myAcc ;
	
	  @FindBy (xpath="//a[text()='Register']")
	private WebElement registrationLink  ;
	
	@FindBy (xpath="//h1[text()='Register Account']")
	private WebElement registration_Page_Header ;
	
	
	@FindBy (xpath="//fieldset[@id='account']/legend")
	private WebElement  registration_Page_Header2;
	
	@FindBy (xpath="//input[@id='input-firstname']")
	private WebElement firstname_Textbox ;
	
	
	@FindBy (xpath="//input[@id='input-lastname']")
	private WebElement lastname_Textbox  ;
	
	@FindBy (xpath="//input[@id='input-email']")
	private WebElement email_Textbox ;
	
	
	@FindBy (xpath="//input[@id='input-password']")
	private WebElement pass_Textbox ;
	
	@FindBy (xpath="//legend[text()='Your Password']")
	private WebElement password_Header  ;
	
	

	
	@FindBy (xpath="//legend[text()='Newsletter']")
	private WebElement newsletter_Header ;
	
	@FindBy (xpath="//input[@id='input-newsletter-yes']")
	private WebElement  radio_Button_Yes ;
	
	
	@FindBy (xpath="//input[@id='input-newsletter-no']")
	private WebElement radio_Button_No ;
	
	@FindBy (xpath="//input[@name='agree']")
	private WebElement checkbox_Agree ;
	
	
	@FindBy (xpath="//a[@class='modal-link']")
	private WebElement privacy_Policy_Link  ;
	
	@FindBy (xpath="//button[text()='Continue']")
	private WebElement Continue_Button ;
	
	
	
	/*

	@FindBy (xpath="")
	private WebElement  ;
	
	@FindBy (xpath="")
	private WebElement  ;
	@FindBy (xpath="")
	private WebElement  ;
	
	@FindBy (xpath="")
	private WebElement  ;
	@FindBy (xpath="")
	private WebElement  ;
	
	@FindBy (xpath="")
	private WebElement  ;
	
	

	@FindBy (xpath="")
	private WebElement  ;
	
	

	@FindBy (xpath="")
	private WebElement  ;
	
	@FindBy (xpath="")
	private WebElement  ;
	@FindBy (xpath="")
	private WebElement  ;
	
	@FindBy (xpath="")
	private WebElement  ;
	@FindBy (xpath="")
	private WebElement  ;
	
	@FindBy (xpath="")
	private WebElement  ;
	
	
	*/
	//==========================================================================
	
	
	
	
	
	public void verifyMyAccountButton() {
		implicitWait(3);
		Assert.assertTrue(checkAvailability(myAcc));
		Assert.assertTrue(checkEnability(myAcc));
		elementScreenshot(myAcc, "My Account Button ");
		report("My Account Button is Displayed & Enabled");
		
	}
	
	
	
	
	
	public void verifyRegiLink() {
		implicitWait(3);
		myAcc.click();
		Assert.assertTrue(checkAvailability(registrationLink));
		Assert.assertTrue(checkEnability(registrationLink));
		elementScreenshot(registrationLink, "Registration Link");
		report("Registration Link is Displayed & Enabled");
		
	}
	
	
	public void Registration_Page_Landing() {
		implicitWait(3);
		myAcc.click();
		
		registrationLink.click();
		implicitWait(3);
	}
	
	
	
	
	public void verifyregistration_Page_Header() {
		implicitWait(3);
		Assert.assertTrue(checkAvailability(registration_Page_Header));
		Assert.assertEquals("Register Account", "Register Account");
		report("Header Is Matched : "+registration_Page_Header.getText());
		elementScreenshot(registration_Page_Header, "Regitrstion Page Header ");
		report("Regitrstion Page Header  is Displayed ");
		
	}
	
	
	public void verifyregistration_Page_Header2() {
		implicitWait(3);
		Assert.assertTrue(checkAvailability(registration_Page_Header2));
		Assert.assertEquals("Your Personal Details", "Your Personal Details");
		report("Header Is Matched : "+registration_Page_Header2.getText());

		elementScreenshot(registration_Page_Header2, "Regitrstion Page Header 2 ");
		report("Regitrstion Page Header 2 is Displayed ");
		
	}
	
	
	
	
	
	
	public void verifyFirstnameTextbox() {
		implicitWait(3);
		Assert.assertTrue(checkAvailability(firstname_Textbox));
		Assert.assertTrue(checkEnability(firstname_Textbox));
		elementScreenshot(firstname_Textbox, "Firstname Textbox");
		report("Firstname TextBox is Displayed & Enabled");
		
	}
	
	
	
	public void verifyLastnameTextbox() {
		implicitWait(3);
		Assert.assertTrue(checkAvailability(lastname_Textbox));
		Assert.assertTrue(checkEnability(lastname_Textbox));
		elementScreenshot(lastname_Textbox, "Lastname Textbox ");
		report("Lastname TextBox is Displayed & Enabled");
		
	}
	
	
	public void verifyEmailTextbox() {
		implicitWait(3);
		Assert.assertTrue(checkAvailability(email_Textbox));
		Assert.assertTrue(checkEnability(email_Textbox));
		elementScreenshot(email_Textbox, "Email Textbox ");
		report("Email Textbox  is Displayed & Enabled");
		
	}
	

	
	public void verifypasswordTextboxHeader() {
		implicitWait(3);
		Assert.assertTrue(checkAvailability(password_Header));
		Assert.assertEquals("Your Password", "Your Password");
		report("Header Is Matched : "+password_Header.getText());

		elementScreenshot(password_Header, "Password Textbox Header ");
		report("Password TextBox Header is Displayed ");
		
	}
	
	
	public void verifynewsletterHeader() {
		implicitWait(3);
		Assert.assertTrue(checkAvailability(newsletter_Header));
		Assert.assertEquals("Newsletter", "Newsletter");
		report("Header Is Matched : "+password_Header.getText());

		elementScreenshot(newsletter_Header, "News Letter Header ");
		report("News Letter Header   is Displayed ");
		
	}
	

	
	
	
	
	
	public void verifyRadio_Button_Yes() {
		implicitWait(3);
		Assert.assertTrue(checkAvailability(radio_Button_Yes));
		Assert.assertTrue(checkEnability(radio_Button_Yes));
		elementScreenshot(radio_Button_Yes, "Radio Button Yes");
		report("Radio Button Yes is Displayed & Enabled");
		
	}
	
	public void verifyRadio_Button_No() {
		implicitWait(3);
		Assert.assertTrue(checkAvailability(radio_Button_No));
		Assert.assertTrue(checkEnability(radio_Button_No));
		elementScreenshot(radio_Button_No, "Radio Button No");
		report("Radio Button No is Displayed & Enabled");
		
	}
	
	
	
	public void verifyAgreeCheckBox() {
		implicitWait(3);
		Assert.assertTrue(checkAvailability(checkbox_Agree));
		Assert.assertTrue(checkEnability(checkbox_Agree));
		elementScreenshot(checkbox_Agree, "Agree Check Box");
		report("Agree Check Box  is Displayed & Enabled");
		
	}
	
	
	public void verifyPrivacyPolicy() {
		implicitWait(3);
		Assert.assertTrue(checkAvailability(privacy_Policy_Link));
		Assert.assertTrue(checkEnability(privacy_Policy_Link));
		elementScreenshot(privacy_Policy_Link, "Privacy Policy Link");
		report("Privacy Policy Link is Displayed & Enabled");
		
	}
	
	
	public void verifyContinueButton() {
		implicitWait(3);
		Assert.assertTrue(checkAvailability(Continue_Button));
		Assert.assertTrue(checkEnability(Continue_Button));
		elementScreenshot(Continue_Button, "Continue Button");
		report("Continue Button is Displayed & Enabled");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static Registration_Page getRegistration_Page() {
		return PageFactory.initElements(WebdriverClass.getDriver(), Registration_Page.class);
	}
	
}
