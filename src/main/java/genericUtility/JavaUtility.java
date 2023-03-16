package genericUtility;
/**
 * This is class for java based utilities
 * @author JORAPUR
 */
public class JavaUtility {

	/**
	 * This is a method for to verify the actual string contains the expected string
	 * @param expected
	 * @param actual 
	 * @param actual
	 * @return
	 */
	public boolean containsString(String expected, CharSequence actual) {
		if (expected.contains(actual)) {
			return true;
		}
			return false;
	}
}
