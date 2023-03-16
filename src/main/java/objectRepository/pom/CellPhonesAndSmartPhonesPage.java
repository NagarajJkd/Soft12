package objectRepository.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhonesAndSmartPhonesPage {
	
	@FindBy(xpath = "//span[text()='- Shop by Brand']//preceding-sibling::span")
	private WebElement seeAll;
	
	@FindBy(xpath = "//div[@id=\"c3-mainPanel-Screen%20Size\"]")
	private WebElement screenZize;
	
	@FindBy(xpath = "//fieldset[@class=\"x-overlay-sub-panel__aspect-fieldset\"]/descendant::span[text()='4.0 - 4.4 in']")
	private WebElement inch; 
	
	@FindBy(xpath = "//span[text()='Price']/parent::div")
	private WebElement price;
	
	@FindBy(xpath = "//input[@aria-label=\"Minimum Value, US Dollar\"]")
	private WebElement minimumValue;
	
	@FindBy(xpath = "//input[@aria-label=\"Maximum Value, US Dollar\"]")
	private WebElement maximumValue;
	
	@FindBy(xpath = "//span[text()='Item Location']")
	private WebElement itemLocation;
	
	@FindBy(xpath = "//input[@value=\"US Only\"]")
	private WebElement LocationRadioButton;
	
	@FindBy(xpath = "//span[@class=\"x-tray__count\"]")
	private WebElement filterSelected;
	
	@FindBy(xpath = "//button[text()='Apply']")
	private WebElement apply;
	
	public CellPhonesAndSmartPhonesPage(WebDriver driver) {

	PageFactory.initElements(driver, this);
		
	}

	public WebElement getSeeAll() {
		return seeAll;
	}

	public void setSeeAll(WebElement seeAll) {
		this.seeAll = seeAll;
	}

	public WebElement getScreenZize() {
		return screenZize;
	}

	public void setScreenZize(WebElement screenZize) {
		this.screenZize = screenZize;
	}

	public WebElement getInch() {
		return inch;
	}

	public void setInch(WebElement inch) {
		this.inch = inch;
	}

	public WebElement getPrice() {
		return price;
	}

	public void setPrice(WebElement price) {
		this.price = price;
	}

	public WebElement getMinimumValue() {
		return minimumValue;
	}

	public void setMinimumValue(WebElement minimumValue) {
		this.minimumValue = minimumValue;
	}

	public WebElement getMaximumValue() {
		return maximumValue;
	}

	public void setMaximumValue(WebElement maximumValue) {
		this.maximumValue = maximumValue;
	}

	public WebElement getItemLocation() {
		return itemLocation;
	}

	public void setItemLocation(WebElement itemLocation) {
		this.itemLocation = itemLocation;
	}

	public WebElement getLocationRadioButton() {
		return LocationRadioButton;
	}

	public void setLocationRadioButton(WebElement locationRadioButton) {
		LocationRadioButton = locationRadioButton;
	}

	public WebElement getFilterSelected() {
		return filterSelected;
	}

	public void setFilterSelected(WebElement filterSelected) {
		this.filterSelected = filterSelected;
	}

	public WebElement getApply() {
		return apply;
	}

	public void setApply(WebElement apply) {
		this.apply = apply;
	}
	/**
	 * This is business method for set the filter condition
	 * @param minValue
	 * @param maxValue
	 */
	public void setFiltrationCond(String minValue, String maxValue) {
		screenZize.click();
		inch.click();
		price.click();
		minimumValue.sendKeys(minValue);
		maximumValue.sendKeys(maxValue);
		itemLocation.click();
		LocationRadioButton.click();
	}
	

}
