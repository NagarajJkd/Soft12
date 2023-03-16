package objectRepository.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhonesSmartPhonesForSalePage {

	@FindBy(xpath = "//span[contains(text(),'filters applied')]")
	private WebElement filterApplied;

	public CellPhonesSmartPhonesForSalePage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	
	}

	public WebElement getFilterApplied() {
		return filterApplied;
	}

	public void setFilterApplied(WebElement filterApplied) {
		this.filterApplied = filterApplied;
	}
	
	
	
}
