package genericUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
/**
 * This is class which contains the configuration methods
 * @author JORAPUR
 *
 */
public class BaseClass {
	
	public WebDriver driver;
	/**
	 * This is a configuration method for open the browser
	 */
	@BeforeClass
	public void openBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.ebay.com/");
		
	}
	
	/**
	 * This is a configuration method for close the browser
	 */
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

}
