package KeywordDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Methods {
	
static WebDriver driver;
	
	public static void un(WebDriver w)
	{
		w.findElement(By.xpath("//*[@id='user[email]\']")).sendKeys("tt@gmail.com");
	}
	public static void pwd(WebDriver w)
	{
		w.findElement(By.xpath("//*[@id='user[password]\']")).sendKeys("Test@1234");
	}
	
	public static void login(WebDriver w)
	{
		w.findElement(By.xpath("/html/body/main/div/div/article/form/div[6]/button")).click();
		w.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
}



