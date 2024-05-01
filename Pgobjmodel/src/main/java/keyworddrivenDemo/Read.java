package keyworddrivenDemo;


import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class Read {
	
	public static void Dataread(WebDriver driver) throws Throwable
	{
	
	File src= new File("C:\\Users\\PratikPatil\\Documents\\keyword.xlsx");
	FileInputStream fileip = new FileInputStream(src);
	
	Workbook wb=new XSSFWorkbook(fileip);
	
	XSSFSheet sheet1=(XSSFSheet)wb.getSheet("Sheet1");

	int rowcount=sheet1.getLastRowNum();
	System.out.println("Number of record in excel sheet"  +rowcount);
	
	for(int j=0;j<=rowcount;j++)
	{
	 String key=sheet1.getRow(j).getCell(0).toString();
	 System.out.println(key);
	 
	 if(key.equalsIgnoreCase("un"))
	 {
		Methods.un(driver);
	 }
	 else if(key.equalsIgnoreCase("pwd"))
	 {
		 Methods.pwd(driver);
	 }
	 else if(key.equalsIgnoreCase("login")) 
	 {
		 Methods.login(driver);
	 }
	 
	}
	}
	
}	
