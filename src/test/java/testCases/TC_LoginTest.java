package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SigninPage;
import testBase.BaseClass;

public class TC_LoginTest extends BaseClass
{
	@Test
	public void verify_login()
	{
		logger.info("login test started..");

		try
		{
			// home pg
			HomePage hp = new HomePage(driver);
			hp.clkSignin();

			// signin pg
			SigninPage sp = new SigninPage(driver);
			sp.setEmail(p.getProperty("email"));
			sp.clkNextBtn();
			Thread.sleep(4000);
			sp.setPwd(p.getProperty("pwd"));
			sp.clkSigninBtn();
			Thread.sleep(10000);
			// sp.remindMe();
			// Assert.assertTrue(true);
			String exp = "Zoho Home";
			Assert.assertEquals(driver.getTitle(), exp);

		}
		catch (Exception e)
		{
			Assert.fail();
		}
		logger.info("test case finished");
	}
}
