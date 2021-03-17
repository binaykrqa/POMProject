package pages;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;
	
	public class PageFactoryClass_LoginPage {
	    WebDriver driver;
	    
//	   public void PageFactoryClass_LoginPage(WebDriver ldriver) 
//	   {
//		   this.driver=ldriver;
//		
//	   }
	   
	    WebElement user_id=driver.findElement(By.id("user_login"));
	    WebElement user_pass=driver.findElement(By.id("user_pass"));
	    WebElement user_LoginButton=driver.findElement(By.id("wp-submit"));
	   // user_LoginButton.click();
	    
	    
	    public void loginWordPress(String uid,String pass) {
	    	
//	    	user_id.sendKeys(uid);
//	    	user_pass.sendKeys(pass);
//	    	user_LoginButton.click();
	    	user_id.sendKeys("admin");
	    	user_pass.sendKeys("demo123");
	    	user_LoginButton.click();
	    	
	    	driver.quit();
	    	
			
		}
	    
	}
	    
	  