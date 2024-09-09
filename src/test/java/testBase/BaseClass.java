package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager; //log4j
import org.apache.logging.log4j.Logger; //log4j
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pageObjects.HomePage;
import pageObjects.ProductListingPage;
import pageObjects.SigninPage;

public class BaseClass
{
	public static WebDriver driver;
	public Properties p;
	public Logger logger; // log4j

	@BeforeClass
	public void setup() throws IOException
	{
		p = new Properties();
		FileReader file = new FileReader("./src//test//resources//config.properties");
		p.load(file);

		logger = LogManager.getLogger(this.getClass()); // log4j2

//		if (br.equalsIgnoreCase("chrome"))
//		{
//			driver = new ChromeDriver();
//		}
//		else if (br.equalsIgnoreCase("edge"))
//		{
//			driver = new EdgeDriver();
//		}
//		else
//		{
//			System.out.println("No matching browser ");
//		}

		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("appurl"));
	}

	@BeforeMethod
	public void login() throws InterruptedException
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

		// product listing pg
		ProductListingPage mhp = new ProductListingPage(driver);
		mhp.clkCRM();
	}

	@AfterClass
	public void tearDown()
	{
		// driver.quit();
	}
}
