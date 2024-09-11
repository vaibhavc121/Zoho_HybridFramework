package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
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

	@FindBy(css = "button[aria-label='Create Lead']")
	WebElement createLead;

	@FindBy(xpath = "//div[@aria-label='Salutation']//lyte-drop-button")
	WebElement None;
	@FindBy(xpath = "//input[@id='Crm_Leads_FIRSTNAME_LInput']")
	WebElement crmLeadsFIRSTNAMELInput;
	@FindBy(xpath = "//input[@id='Crm_Leads_EMAIL_LInput']")
	WebElement crmLeadsEMAILLInput;
	@FindBy(xpath = "//input[@id='Crm_Leads_FAX_LInput']")
	WebElement crmLeadsFAXLInput;
	@FindBy(xpath = "//input[@id='Crm_Leads_WEBSITE_LInput']")
	WebElement crmLeadsWEBSITELInput;
	@FindBy(xpath = "//lyte-dropdown[@id='Crm_Leads_STATUS']//lyte-drop-button")
	WebElement leads;
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
	@FindBy(xpath = "//lyte-dropdown[@id='Crm_Leads_LEADSOURCE']//lyte-icon[@class='dropdown']")
	WebElement leadsource;
	@FindBy(xpath = "//lyte-dropdown[@id='Crm_Leads_INDUSTRY']//lyte-icon[@class='dropdown']")
	WebElement industry;
	@FindBy(xpath = "//lyte-dropdown[@id='Crm_Leads_RATING']//lyte-icon[@class='dropdown']")
	WebElement rating;
	@FindBy(xpath = "//input[@id='Crm_Leads_ADDN_EMAIL_LInput']")
	WebElement crmLeadsADDNEMAILLInput;
	@FindBy(xpath = "//input[@id='Crm_Leads_CITY_LInput']")
	WebElement crmLeadsCITYLInput;
	@FindBy(xpath = "//input[@id='Crm_Leads_CODE_LInput']")
	WebElement crmLeadsCODELInput;

	@FindBy(xpath = "//span[@id='headervalue_EMAIL']")
	WebElement email;

	@FindBy(xpath = "//lyte-button[@id='crm_create_savebutnLeads']//lyte-yield[1]")
	WebElement save;

	public void clkCreateLeadBtn()
	{
		createLead.click();
	}

	public void clkSalutation()
	{
		None.click();
	}

	public void slctSalutation(String sltn)
	{
		List<WebElement> ele = driver
				.findElements(By.xpath("//lyte-drop-item[@role='option' and @aria-selected='false']"));
		System.out.println(ele.size());

		// ele.get(1).click();
		for (int i = 0; i < ele.size(); i++)
		{
			ele.get(i).getText();
			if (ele.get(i).getText().equalsIgnoreCase(sltn))
			{
				ele.get(i).click();
				break;
			}
		}
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

	public void clkLeadStatus()
	{
		leads.click();
	}

	public void slctLeadStatus(String lstatus)
	{
		List<WebElement> ele = driver.findElements(By.xpath("//lyte-drop-item[contains(@id,'Lyte_Drop_Item_')]"));
		System.out.println(ele.size());

		// ele.get(1).click();
		for (int i = 0; i < ele.size(); i++)
		{
			ele.get(i).getText();
			if (ele.get(i).getText().equalsIgnoreCase(lstatus))
			{
				ele.get(i).click();
				break;
			}
		}
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

	public void setState(String state)
	{
		crmLeadsSTATELInput.sendKeys(state);
	}

	public void setCountry(String country)
	{
		inputId.sendKeys(country);
	}

	public void setDesc(String desc)
	{
		cruxTextArea.sendKeys(desc);
	}

	public void setTitle(String title)
	{
		crmLeadsDESIGNATIONLInput.sendKeys(title);
	}

	public void setPhone(String ph)
	{
		crmLeadsPHONELInput.sendKeys(ph);
	}

	public void setMbl(String mbl)
	{
		crmLeadsMOBILELInput.sendKeys(mbl);
	}

	public void clkLeadSrc()
	{
		leadsource.click();
	}

	public void slctLeadSrc(String lsrc)
	{
		List<WebElement> ele = driver.findElements(By.xpath("//lyte-drop-item[contains(@id,'Lyte_Drop_Item_')]"));
		System.out.println(ele.size());

		// ele.get(1).click();
		for (int i = 0; i < ele.size(); i++)
		{
			ele.get(i).getText();
			if (ele.get(i).getText().equalsIgnoreCase(lsrc))
			{
				ele.get(i).click();
				break;
			}
		}
	}

	public void clkIndustry()
	{
		industry.click();
	}

	public void slctIndustry(String industry)
	{
		List<WebElement> ele = driver.findElements(By.xpath("//lyte-drop-item[contains(@id,'Lyte_Drop_Item_')]"));
		System.out.println(ele.size());

		// ele.get(1).click();
		for (int i = 0; i < ele.size(); i++)
		{
			ele.get(i).getText();
			if (ele.get(i).getText().equalsIgnoreCase(industry))
			{
				ele.get(i).click();
				break;
			}
		}
	}

	public void clkRating()
	{
		rating.click();
	}

	public void slctRating(String rating)
	{
		List<WebElement> ele = driver.findElements(By.xpath("//lyte-drop-item[contains(@id,'Lyte_Drop_Item_')]"));
		System.out.println(ele.size());

		// ele.get(1).click();
		for (int i = 0; i < ele.size(); i++)
		{
			ele.get(i).getText();
			if (ele.get(i).getText().equalsIgnoreCase(rating))
			{
				ele.get(i).click();
				break;
			}
		}
	}

	public void setSemail(String semail)
	{
		crmLeadsADDNEMAILLInput.sendKeys(semail);
	}

	public void setCity(String city)
	{
		crmLeadsCITYLInput.sendKeys(city);
	}

	public void setZip(String zip)
	{
		crmLeadsCODELInput.sendKeys(zip);
	}

	public void clkSave()
	{
		save.click();
	}

	/* Verification/Assertion method starts */
	public String getEmail()
	{
		return email.getText();
	}

}
