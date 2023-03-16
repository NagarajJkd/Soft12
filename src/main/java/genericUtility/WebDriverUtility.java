package genericUtility;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * This is a class which includes the methods for handing web driver actions
 * @author JORAPUR
 *
 */
public class WebDriverUtility {
	
	/**
	 * This method is used select the dropdown list content by using index
	 * @param element
	 * @param index
	 */
	public void select(WebElement element, int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
	}

	/**
	 * This method is used select the dropdown list content by using attribute value
	 * @param element
	 * @param index
	 */
	public void select(WebElement element, String value) {
		Select s=new Select(element);
		s.selectByValue(value);
	}
	
	/**
	 * This method is used select the dropdown list content by using visible text
	 * @param element
	 * @param index
	 */
	public void select(String text, WebElement element) {
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
	

}
