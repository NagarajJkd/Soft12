package seneriosPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepository.pom.CellPhonesAndSmartPhonesPage;
import objectRepository.pom.CellPhonesSmartPhonesForSalePage;
import objectRepository.pom.ElectronicProducts;
import objectRepository.pom.Electronics;

public class Acess_Product_Via_Category_Test extends BaseClass{
	
	
	@Test
	public void acessProduct() {
		
		//POM Classes
		Electronics el=new Electronics(driver);
		ElectronicProducts ep=new ElectronicProducts(driver);
		CellPhonesAndSmartPhonesPage cs=new CellPhonesAndSmartPhonesPage(driver);
		CellPhonesSmartPhonesForSalePage cssp=new CellPhonesSmartPhonesForSalePage(driver);
		
		//Navigate to Search by category > Electronics 
		el.getShopByCategory().click();
		el.getElectronics().click();
		
		//click Cell Phones & Smartphones in the left hand side navigation section.
		ep.getCellPhonesAndAccesories().click();
		ep.getCellPhonesAndSmartPhones().click();
		
		//click – See All (appears under “Shop by brand”).
		cs.getSeeAll().click();
		
		//Add 3 filters - screen size, Price and Item location appearing in the pop-up and click apply.
		cs.setFiltrationCond("250", "300");
		
		//Verify that the filter tags are applied.
		String actualtext = cs.getFilterSelected().getText();
		String expectedtext="(3) Filter(s) selected";
		Assert.assertEquals(actualtext, expectedtext);
		cs.getApply().click();
		
		//Verify that the filter tags are applied.
		String actualResult = cssp.getFilterApplied().getText();
		String expectedResult = "3 filters applied";
		Assert.assertEquals(actualResult, expectedResult);
		Reporter.log("Filter conditions are verfied and Testcase is pass", true);
	}

}
