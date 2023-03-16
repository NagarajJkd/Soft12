package objectRepository.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.WebDriverUtility;

public class Electronics {
	
	@FindBy(xpath = "//button[text()='Shop by category']")
	private WebElement shopByCategory;
	
	@FindBy(xpath = "//a[text()='Electronics']/parent::h3/child::a")
	private WebElement electronics;
	
	@FindBy(xpath = "//input[@placeholder=\"Search for anything\"]")
	private WebElement searchBar;
	
	@FindBy(id = "gh-cat")
	private WebElement categories;
	
	@FindBy(id = "gh-btn")
	private WebElement searchBtn;

	public Electronics(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public WebElement getShopByCategory() {
		return shopByCategory;
	}

	public void setShopByCategory(WebElement shopByCategory) {
		this.shopByCategory = shopByCategory;
	}

	public WebElement getElectronics() {
		return electronics;
	}

	public void setElectronics(WebElement electronics) {
		this.electronics = electronics;
	}
	
	/**
	 * This is a method which contains business logic to search the particular Product
	 * @param value
	 * @param text
	 */
	public void search(String value, String text) {
		searchBar.sendKeys(value);
		WebDriverUtility wdu=new WebDriverUtility();
		wdu.select(text, categories);
		searchBtn.click();
	}

}
