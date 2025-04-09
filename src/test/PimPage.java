
package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class PimPage extends Base {
	
	@Test
	
	public void AddEmployee() throws Exception
	{
		System.out.println("waiting to click pim");
		
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);

		driver.findElement(By.linkText("PIM")).click();
		
		System.out.println("pim clicked");
		
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		
		System.out.println(" click on add employee");
		
		driver.findElement(By.linkText("Add Employee")).click();
		
		System.out.println(" clicked on add employee");
	}
	
	

}
