package training.selenium.genesis.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import training.selenium.DriverFactory;
import training.selenium.DriverFactory.DriverTypes;

public class BaseTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void initDriver(){
		driver = DriverFactory.GetDriver(DriverTypes.FIREFOX);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterClass
	public void close(){
		driver.close();
	}
}
