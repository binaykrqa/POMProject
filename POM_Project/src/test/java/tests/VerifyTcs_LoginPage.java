package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.wordpress.pages.PageFactoryClass_LoginPage;

@Test
public class VerifyTcs_LoginPage

{
	
	public static void checkValidUser()
	{
		WebDriver driver=Helper.BrowserFactory.StartBrowser("chrome", "http://demosite.center/wordpress/wp-login.php");
//		PageFactoryClass_LoginPage loginPage=PageFactory.initElements(driver,PageFactoryClass_LoginPage.class );
//		loginPage.loginWordPress("admin", "demo123");
		
	}
	
	@Test
	public static void Quiit()
	{
//		WebDriver driver = null;
//		driver.quit();
	}
	
	
}
    