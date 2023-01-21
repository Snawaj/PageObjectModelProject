package base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BrowserFactory.DriverFactory;
import Pages.HomePage;
import Pages.RegisterPage;
import Utils.GenericMethods;

public class BaseTest {
	WebDriver driver;
	
	protected DriverFactory df;
	protected Properties prop;
	protected GenericMethods gm;
	
	protected RegisterPage rg;
	protected HomePage hp;
	

	@BeforeTest
	public void Setup() {
		
		df = new DriverFactory();
		prop = df.init_prop();
		driver = df.init_driver(prop);
		
		hp = new HomePage(driver);
		rg = new RegisterPage(driver);
	}
	@Test
	public void test() {
		
	}
	
	
	
	
	
	
	

}
