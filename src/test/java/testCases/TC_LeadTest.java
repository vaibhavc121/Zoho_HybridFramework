package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomeCRMPage;
import pageObjects.LeadsPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_LeadTest extends BaseClass
{
	@Test(dataProvider = "LeadData", dataProviderClass = DataProviders.class)
	public void verifyLeadCreate(String fname, String email, String fax, String web, String noofemp, String skype,
			String street, String state, String country, String desc, String comp, String lname, String title,
			String ph, String mbl, String semail, String city, String zip) throws InterruptedException
	{
		logger.info("test case started..");

//		// home pg
//		HomePage hp = new HomePage(driver);
//		hp.clkSignin();
//
//		// signin pg
//		SigninPage sp = new SigninPage(driver);
//		sp.setEmail(p.getProperty("email"));
//		sp.clkNextBtn();
//		Thread.sleep(4000);
//		sp.setPwd(p.getProperty("pwd"));
//		sp.clkSigninBtn();
//
//		// product listing pg
//		ProductListingPage mhp = new ProductListingPage(driver);
//		mhp.clkCRM();

		// crm home pg
		HomeCRMPage crm = new HomeCRMPage(driver);
		crm.clkLeadsTab();

		// leads pg
		LeadsPage lp = new LeadsPage(driver);
		lp.clkCreateLeadBtn();
		lp.clkSalutation();
		lp.slctSalutation();
		Thread.sleep(5000);
		lp.setFname(fname);
		lp.setEmail(email);
		lp.setFax(fax);
		lp.setWebsite(web);
		lp.setNoOfEmp(noofemp);
		lp.setSkype(skype);
		lp.setStreet(street);
		lp.setCompany(comp);
		lp.setLname(lname);
		lp.setState(state);
		lp.setCountry(country);
		lp.setDesc(desc);
		lp.setTitle(title);
		lp.setPhone(ph);
		lp.setMbl(mbl);
		lp.setSemail(semail);
		lp.setCity(city);
		lp.setZip(zip);

		lp.clkSave();

		String act = lp.getEmail();

		Assert.assertEquals(act, email);

		logger.info("test case finished..");

	}
}
