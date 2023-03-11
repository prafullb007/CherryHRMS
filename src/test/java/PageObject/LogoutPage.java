package PageObject;

import org.openqa.selenium.By;
//import org.testng.Reporter;
import TestRunner.BaseClass;

public class LogoutPage extends BaseClass {
//	objects
static By link_logout=By.linkText("Logout");
// functions
public static void logout() {
	driver.findElement(link_logout).click();
//	Reporter.log("Logout completed");
}
}
