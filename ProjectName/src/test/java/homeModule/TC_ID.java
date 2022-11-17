package homeModule;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.JavaScriptExecutorUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.UtilityMethods;

public class TC_ID extends BaseClass {
	@Test
	public void TestCaseDescription() throws IOException {
		WebElement email = driver.findElement(By.id("Email"));
		WebElement password = driver.findElement(By.id("Password"));
		WebElement login = driver.findElement(By.xpath("//input[@value='Log in']"));
		/*String username = PropertyFileUtility.PropertyReader("username");
		email.sendKeys(username);
		password.sendKeys(PropertyFileUtility.PropertyReader("password"));
		login.click();*/
		
		//JavaScriptExecutorUtility.EnteringDataToELementsUsingJavaScript(email,"hcsm166");
		 //JavaScriptExecutorUtility.EnteringDataToELementsUsingJavaScript(password,"demo1223234");
		 //JavaScriptExecutorUtility.clickingOnELementUsingJavaScript(login);
		 UtilityMethods.ActionsUtility(driver).sendKeys(email, "hello").perform();
			UtilityMethods.ActionsUtility(driver).sendKeys(password,"password").perform();
			UtilityMethods.ActionsUtility(driver).click(login).perform();
		
		 	}
	

}
