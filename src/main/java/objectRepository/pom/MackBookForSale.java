package objectRepository.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MackBookForSale {
	
	@FindBy(xpath = "(//div[@class=\"s-item__title\"]/descendant::span/child::span)[1]")
	private WebElement firstResult;

	public MackBookForSale(WebDriver driver) {

	PageFactory.initElements(driver, this);
		
	}
	
	/**
	 * This is business logic for fetch the first result text of the particular element
	 * @return
	 */
	public String fetchTitle() {
		String text = firstResult.getText();
		return text;
	}

}
