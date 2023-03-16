package seneriosPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.JavaUtility;
import objectRepository.pom.Electronics;
import objectRepository.pom.MackBookForSale;

public class Access_Product_via_Search extends BaseClass {

	@Test
	public void test() {
		
		//POM Classes
		Electronics ec=new Electronics(driver);
		MackBookForSale ms=new MackBookForSale(driver);
		
		//search string in the search bar and select category. For example: MacBook and Computers/Tablets & Networking.
		ec.search("MacBook", "Computers/Tablets & Networking");
		
		//Verifying that the page loads completely.
		String ExpectedTitle="MacBook in Computers/Tablets & Networking for sale | eBay";
		String Actualtitle = driver.getTitle();
		Assert.assertEquals(Actualtitle, ExpectedTitle);
		Reporter.log("Completely page is loaded", true);
		
		//Verifying that the first result name matches with the search string.
		String firstResult = ms.fetchTitle();
		String searchString="Macbook";
		boolean flag = false;
		if (firstResult.contains(searchString)) {
			flag=true;
		}
		Assert.assertTrue(flag);
		Reporter.log("first result name consists the search string", true);
	}
}
