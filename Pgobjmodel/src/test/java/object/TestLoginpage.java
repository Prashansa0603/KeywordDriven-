package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestLoginpage {

	 String driverpath="C:\\Users\\PratikPatil\\Documents\\chromedriver\\chromedriver.exe";
	 WebDriver driver;
 
 @BeforeTest
	 public void setup(){
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\PratikPatil\\Documents\\chromedriver\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://ultimateqa.com/automation/");
 }
 @Test
 public void login() {
	  // enter username
     WebElement Username = driver.findElement(By.xpath("//*[@id=\'user[email]\']"));
     Username.sendKeys("tt@gmail.com");

        // enter password
        WebElement Password = driver.findElement(By.xpath("//*[@id='user[password]\']"));
        Password.sendKeys("Test@1234");
   // click on sign in button
        WebElement Submitbutton = driver.findElement(By.xpath("/html/body/main/div/div/article/form/div[6]/button"));
        Submitbutton.click(); 
 }
    @AfterTest
    public void end() {
    	driver.quit();
   }
	     	 
     
	 }

	


