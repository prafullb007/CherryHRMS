package PageObject;
import org.openqa.selenium.By;
//import org.testng.Reporter;
//import com.hrms.utility.BaseClass;
import TestRunner.BaseClass;
public class LoginPage extends BaseClass{
// OBJECTS
static By txt_loginname=By.name("txtUserName");
static By txt_password=By.name("txtPassword");
static By btn_login=By.name("Submit");
// FUNCTIONS
public static void login(String un,String pw) {
driver.findElement(txt_loginname).sendKeys(un);
driver.findElement(txt_password).sendKeys(pw);
driver.findElement(btn_login).click();
//Reporter.log("Login is completed");
}
	}


