package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactDetailsPage extends Base
{
@Test
public void AddContactDetails() throws Exception
{
	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/a")).click();
	
	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	
	String x = driver.getCurrentUrl();
	  System.out.println("current url: "+x);
	  Assert.assertTrue(x.contains("contactDetails"));

}
}
