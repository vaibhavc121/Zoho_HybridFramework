package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductListingPage extends BasePage
{

	public ProductListingPage(WebDriver driver)
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(css = "._logo-crm._logo-x96.zod-app-logo")
	WebElement logoIcon;

	public void clkCRM()
	{
		logoIcon.click();
	}

}
