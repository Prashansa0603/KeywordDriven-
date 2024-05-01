package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class FillOutFormPg {

	public static void main(String[] args) {
		
		 @BeforeTest
		 public TestSetUp(){
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\PratikPatil\\Documents\\chromedriver\\chromedriver.exe");
		     WebDriver driver=new ChromeDriver();
		     driver.manage().window().maximize();
		     driver.get("https://ultimateqa.com/automation/");
		     
		    @AfterTest
		    
		 }		     
		    
		     
		 
	}

}
