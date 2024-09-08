package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeCRMPage extends BasePage
{

	public HomeCRMPage(WebDriver driver)
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//span[@class='accessibility-route-elem'][normalize-space()='Leads']")
	WebElement leads;

	public void clkLeadsTab()
	{
		leads.click();
	}

}
