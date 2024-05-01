package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class obj

{
	WebDriver driver;
	 // Constructor
	public void SignUpPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//page elements
	By Username= By.xpath("//*[@id='user[email]\']");
	By Password = By.xpath("//*[@id='user[password]\']");
	By submit= By.xpath("/html/body/main/div/div/article/form/div[6]/button");
	

// methods
	
	public void EnterUsername(String usnm)
	{
		driver.findElement(Username).sendKeys(usnm);
	}
	public void EnterPassword(String pswd)
	{
		driver.findElement(Password).sendKeys(pswd);
	}
	public void Submitbutton()
	{
		driver.findElement(submit).click();
	}
	public void login(String username, String password) {
        EnterUsername(username);
        EnterPassword(password);
        Submitbutton();
	
}
}
