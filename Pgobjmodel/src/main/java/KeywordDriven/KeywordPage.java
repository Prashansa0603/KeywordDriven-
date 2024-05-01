package KeywordDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import keyworddrivenDemo.Read;

public class KeywordPage {
	public static void main(String[] args) throws Throwable {	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PratikPatil\\Documents\\chromedriver\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://ultimateqa.com/automation/");
     driver.findElement(By.xpath("/html/body/div[1]/div/div/div/article/div/div[1]/div/div[2]/div/div[1]/div/div/div/div/ul/li[6]/a")).click();
     
		Thread.sleep(2000);
	
	}
}
