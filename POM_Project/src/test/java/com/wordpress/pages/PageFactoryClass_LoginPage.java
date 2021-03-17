package com.wordpress.pages;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;
	//public class PagefactoryClass {
	
	public class PageFactoryClass_LoginPage {
	    WebDriver driver;
	    
	   public void PageFactoryClass_LoginPage(WebDriver ldriver) 
	   {
		   this.driver=ldriver;
		
	   }
	    @CacheLookup
	    @FindBy(id="user_login") WebElement user_id;
	    @CacheLookup
	    @FindBy(id="user_pass") WebElement user_pass;
	    @CacheLookup
	    @FindBy(id="wp-submit") WebElement user_LoginButton;
	    
	    
	    public void loginWordPress(String uid,String pass) {
	    	
	    	user_id.sendKeys(uid);
	    	user_pass.sendKeys(pass);
	    	user_LoginButton.click();
	    	
	    	
			
		}
	    
	}
	    
	  