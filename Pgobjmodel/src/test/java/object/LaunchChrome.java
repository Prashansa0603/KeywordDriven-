package object;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class LaunchChrome<SignUpPage> {
	
	WebDriver driver;
	public SignUpPage signuppg;
		
	public static void main(String[] args) {
//		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PratikPatil\\Documents\\chromedriver\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://ultimateqa.com/automation/");
//	     
	   driver.findElement(By.xpath("/html/body/div[1]/div/div/div/article/div/div[1]/div/div[2]/div/div[1]/div/div/div/div/ul/li[6]/a")).click();
//	
//	   public void loginTest() {
//	        // Perform login
//		   signuppg.login("tt@gmail.com", "Test@1234");
//		  
//		     // enter username
		     WebElement usnm = driver.findElement(By.xpath("//*[@id='user[email]\']"));
		     usnm.sendKeys("tt@gmail.com");
//
//		        // enter password
		        WebElement Password = driver.findElement(By.xpath("//*[@id='user[password]\']"));
		        Password.sendKeys("Test@1234");

//		        // click on sign in button
		        WebElement Submitbutton = driver.findElement(By.xpath("/html/body/main/div/div/article/form/div[5]/button"));
		        Submitbutton.click();   	 
		     
	}
	
}
