package com.wordpress.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.json.StaticInitializerCoercer;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.wordpress.pages.PageFactoryClass_LoginPage;

import Helper.BrowserFactory;

@Test
public class VerifyTcs_LoginPage

{
	
	public static void checkValidUser()
	{
		//WebDriver driver=BrowserFactory.StartBrowser("chrome", "http://demosite.center/wordpress/wp-login.php");
		WebDriver driver=com.wordpress.Helper.BrowserFactory.StartBrowser("chrome", "http://demosite.center/wordpress/wp-login.php");
		PageFactoryClass_LoginPage loginPage=PageFactory.initElements(driver,PageFactoryClass_LoginPage.class );
		loginPage.loginWordPress("admin", "demo123");
		
		
	}
	
}
    