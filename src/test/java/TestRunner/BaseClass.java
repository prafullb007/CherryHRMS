package TestRunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Reporter;

public class BaseClass {
public static WebDriver driver;
	public static void openapplication() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/raayan/eclipse-workspace/BDD_CucumberFraimworkDemo/src/test/java/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		
//		Reporter.log("Application is opened");
	}
	public static void enterurl(String hrmsurl) {
		driver.navigate().to(hrmsurl);

	}
	public static void closeapplication() {
		driver.quit();
//		Reporter.log("Application is closed");
	}
	
}
 