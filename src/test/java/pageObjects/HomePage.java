package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{

	public HomePage(WebDriver driver)
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[@class='zgh-login'][normalize-space()='Sign In']")
	WebElement signIn;

	public void clkSignin()
	{
		signIn.click();
	}

}
