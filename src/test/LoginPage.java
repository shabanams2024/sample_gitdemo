package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginPage extends Base
{
	@Test
	
	public void Launch() throws Exception
	{
driver.get("http://localhost/orangehrm/orangehrm-5.7/orangehrm-5.7/web/index.php/auth/login");
System.out.println("OrangeHrm launched");

	}
@Test
public void Login() throws Exception
{
	
	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	
	driver.findElement(By.name("username")).sendKeys("ramya23");
	
	driver.findElement(By.name("password")).sendKeys("Ramyakrishna23@");
	
	driver.findElement(By.xpath("//html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	
System.out.println("Successsfully loggedIn");

driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);

driver.findElement(By.linkText("Dashboard"));

System.out.println("Dashboard displayed");
}

}
