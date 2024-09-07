package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SigninPage extends BasePage
{

	public SigninPage(WebDriver driver)
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@id='login_id']")
	WebElement emailAdd;

	@FindBy(xpath = "//input[@id='password']")
	WebElement enterPassword;

	@FindBy(xpath = "//button[@id='nextbtn']")
	WebElement next;

	@FindBy(xpath = "//button[@id='nextbtn']//span[contains(text(),'Sign in')]")
	WebElement signIn;

	@FindBy(xpath = "//button[normalize-space()='Remind me later']")
	WebElement remindMeLater;

	public void setEmail(String email)
	{
		emailAdd.sendKeys(email);
	}

	public void setPwd(String pwd)
	{
		enterPassword.sendKeys(pwd);
	}

	public void clkNextBtn()
	{
		next.click();
	}

	public void clkSigninBtn()
	{
		signIn.click();
	}

	public void remindMe()
	{
		remindMeLater.click();
	}

}
