package PageObject;

//import org.testng.Reporter;
import TestRunner.BaseClass;

public class VerifyPage extends BaseClass {

	public static void verifytitle(String title) {
		if(driver.getTitle().equals(title)) {
//			Reporter.log("Title is matched");
		}
		else {
//			Reporter.log("Title is not matched");
//			Reporter.log(driver.getTitle());
		} 
		}
	}

