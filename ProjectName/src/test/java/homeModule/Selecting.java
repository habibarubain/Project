package homeModule;

import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtility.BaseClass;
import genericUtility.UtilityMethods;

public class Selecting extends BaseClass{
	@Test
	public void demo12154545() throws InterruptedException, IOException {
	WebElement elem = driver.findElement(By.name("checkBoxOption1"));
	//elem.click();
	Assert.assertEquals(elem.isSelected(),true);
	logger.log(Status.PASS, "passed");

	
	}
}
