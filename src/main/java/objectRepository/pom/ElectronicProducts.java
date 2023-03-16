package objectRepository.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicProducts {
	
	@FindBy(xpath = "//span[text()='Cell Phones & Accessories']")
	private WebElement cellPhonesAndAccesories;
	
	@FindBy(xpath = "//a[text()='Cell Phones & Smartphones']")
	private WebElement cellPhonesAndSmartPhones;

	public ElectronicProducts(WebDriver driver) {

		PageFactory.initElements(driver, this);
	
	}

	public WebElement getCellPhonesAndAccesories() {
		return cellPhonesAndAccesories;
	}

	public void setCellPhonesAndAccesories(WebElement cellPhonesAndAccesories) {
		this.cellPhonesAndAccesories = cellPhonesAndAccesories;
	}

	public WebElement getCellPhonesAndSmartPhones() {
		return cellPhonesAndSmartPhones;
	}

	public void setCellPhonesAndSmartPhones(WebElement cellPhonesAndSmartPhones) {
		this.cellPhonesAndSmartPhones = cellPhonesAndSmartPhones;
	}
	
	

}
