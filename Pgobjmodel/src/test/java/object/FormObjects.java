package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormObjects
{
	WebDriver driver;
	 // Constructor
	
	
	//page elements
	By name = By.id("et_pb_contact_name_0");
	By message =By.id("et_pb_contact_message_0");
	By submitbutn = By.xpath("/html/body/div[1]/div/div/div/article/div/div[1]/div/div/div[2]/div[1]/div/div[2]/form/div/button");
	
	By name1 =By.id("et_pb_contact_name_1");
	By message1= By.id("et_pb_contact_message_1");
	
	//methods
	public void Entername(String nm)
	{
		driver.findElement(name).sendKeys(nm);
	}
	public void Entermessage(String msg)
	{
		driver.findElement(message).sendKeys(msg);
	}
	public void Clicksubmit()
	{
		driver.findElement(submitbutn).click();
	}
	
	public void Entername1(String nm1)
	{
		driver.findElement(name1).sendKeys(nm1);
	}	
	public void Entermessage1(String msg1)
	{
		driver.findElement(message1).sendKeys(msg1);
	}
	
	
	

	
}