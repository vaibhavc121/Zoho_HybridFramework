package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadsPage extends BasePage
{

	public LeadsPage(WebDriver driver)
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//button[normalize-space()='Create Lead']")
	WebElement createLead;

	@FindBy(xpath = "//input[@id='Crm_Leads_FIRSTNAME_LInput']")
	WebElement crmLeadsFIRSTNAMELInput;
	@FindBy(xpath = "//input[@id='Crm_Leads_EMAIL_LInput']")
	WebElement crmLeadsEMAILLInput;
	@FindBy(xpath = "//input[@id='Crm_Leads_FAX_LInput']")
	WebElement crmLeadsFAXLInput;
	@FindBy(xpath = "//input[@id='Crm_Leads_WEBSITE_LInput']")
	WebElement crmLeadsWEBSITELInput;
	@FindBy(xpath = "//input[@id='Crm_Leads_EMPCT_LInput']")
	WebElement crmLeadsEMPCTLInput;
	@FindBy(xpath = "//input[@id='Crm_Leads_SKYPEIDENTITY_LInput']")
	WebElement crmLeadsSKYPEIDENTITYLInput;
	@FindBy(xpath = "//input[@id='Crm_Leads_LANE_LInput']")
	WebElement crmLeadsLANELInput;
	@FindBy(xpath = "//input[@id='Crm_Leads_STATE_LInput']")
	WebElement crmLeadsSTATELInput;
	@FindBy(xpath = "//crm-create-fields[@id='Leads_fldRow_COUNTRY']//input[1]")
	WebElement inputId;
	@FindBy(xpath = "//textarea[@autocomplete='off']")
	WebElement cruxTextArea;
	@FindBy(xpath = "//crm-create-fields[@id='Leads_fldRow_COMPANY']//input[1]")
	WebElement ipId;
	@FindBy(xpath = "//input[@id='Crm_Leads_LASTNAME_LInput']")
	WebElement crmLeadsLASTNAMELInput;
	@FindBy(xpath = "//input[@id='Crm_Leads_DESIGNATION_LInput']")
	WebElement crmLeadsDESIGNATIONLInput;
	@FindBy(xpath = "//input[@id='Crm_Leads_PHONE_LInput']")
	WebElement crmLeadsPHONELInput;
	@FindBy(xpath = "//input[@id='Crm_Leads_MOBILE_LInput']")
	WebElement crmLeadsMOBILELInput;
	@FindBy(xpath = "//input[@id='Crm_Leads_ADDN_EMAIL_LInput']")
	WebElement crmLeadsADDNEMAILLInput;
	@FindBy(xpath = "//input[@id='Crm_Leads_CITY_LInput']")
	WebElement crmLeadsCITYLInput;
	@FindBy(xpath = "//input[@id='Crm_Leads_CODE_LInput']")
	WebElement crmLeadsCODELInput;
	
	@FindBy(xpath="//span[@id='headervalue_EMAIL']") WebElement email;

	@FindBy(xpath = "//lyte-button[@id='crm_create_savebutnLeads']//lyte-yield[1]")
	WebElement save;

	public void clkCreateLeadBtn()
	{
		createLead.click();
	}

	public void setFname(String fname)
	{
		crmLeadsFIRSTNAMELInput.sendKeys(fname);
	}

	public void setEmail(String email)
	{
		crmLeadsEMAILLInput.sendKeys(email);
	}

	public void setFax(String fax)
	{
		crmLeadsFAXLInput.sendKeys(fax);
	}

	public void setWebsite(String web)
	{
		crmLeadsWEBSITELInput.sendKeys(web);
	}

	public void setNoOfEmp(String noofemp)
	{
		crmLeadsEMPCTLInput.sendKeys(noofemp);
	}

	public void setSkype(String skype)
	{
		crmLeadsSKYPEIDENTITYLInput.sendKeys(skype);
	}

	public void setStreet(String street)
	{
		crmLeadsLANELInput.sendKeys(street);
	}

	public void setCompany(String comp)
	{
		ipId.sendKeys(comp);
	}

	public void setLname(String lname)
	{
		crmLeadsLASTNAMELInput.sendKeys(lname);
	}

	public void clkSave()
	{
		save.click();
	}
	
	public String getEmail()
	{
		return email.getText();
	}

//	public void ()
//	{
//		
//	}
//	
//	public void ()
//	{
//		
//	}
//	
//	public void ()
//	{
//		
//	}
//	
//	public void ()
//	{
//		
//	}
//	
//	public void ()
//	{
//		
//	}
//	
//	public void ()
//	{
//		
//	}
//	
//	public void ()
//	{
//		
//	}
//	
//	public void ()
//	{
//		
//	}
//	
//	public void ()
//	{
//		
//	}
//	
//	public void ()
//	{
//		
//	}
//	
//	public void ()
//	{
//		
//	}
//	
//	public void ()
//	{
//		
//	}

}
