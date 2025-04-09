package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddEmployeePage extends Base {

@Test

public void CreateNewEmployee() throws Exception
{
	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	
	driver.findElement(By.name("firstName")).sendKeys("Ramya");
	System.out.println("FirstName entered");
	
	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	driver.findElement(By.name("middleName")).sendKeys("Krishna");
	
	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	driver.findElement(By.name("lastName")).sendKeys("M");
	
	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).click();
	
	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
	
	
	System.out.println("Clicked save Button");
	
	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	System.out.println("personal details page displayed");
	
	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);

}
}
