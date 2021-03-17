package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import pages.Guru99HomePage;

import pages.Guru99Login;

public class Test99GuruLogin {

    String driverPath = "D:\\NewDownloads\\chromedriver_win32 (1)87\\chromedriver.exe";
    
    WebDriver driver;
    Guru99Login objLogin;
    Guru99HomePage objHomePage;

    @BeforeTest
    public void setup(){
	System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/V4/");
    }

    /* This test case will login in http://demo.guru99.com/V4/ Verify login page title as guru99 bank Login to application Verify the home page using Dashboard message

     */

    @Test(priority=0)
    public void test_Home_Page_Appear_Correct(){
        //Create Login Page object
    objLogin = new Guru99Login(driver);
    //Verify login page title
    String loginPageTitle = objLogin.getLoginTitle();
    Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
    //login to application
    objLogin.loginToGuru99("mgr123", "mgr!23");
    // go the next page
    objHomePage = new Guru99HomePage(driver);
    //Verify home page
    Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));
    }
    
    //---------------------------------------------------
    @Test(priority=1,enabled=true)

    public void test_Home_Page_newAccount() throws InterruptedException
    {
    //Assert.assertEquals(false, false);
    //new Account
    driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[5]/a")).click();
    driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1234");
    WebElement optionsElement=driver.findElement(By.xpath("//select[@name='selaccount']"));
    Select option=new Select(optionsElement);
    option.selectByVisibleText("Current");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@name='inideposit']")).sendKeys("5000");
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    Thread.sleep(1000);
    }
    @Test(priority=2,enabled=false)

    public void test_Home_Page_Logout() throws InterruptedException
    {
    JavascriptExecutor js=((JavascriptExecutor)driver);
    js.executeScript("window.scrollBy(0,300)");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
    Thread.sleep(3000);
    Alert alert=driver.switchTo().alert();
    alert.accept();
    Thread.sleep(4000);
    }
    }
