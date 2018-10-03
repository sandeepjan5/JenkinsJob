package webdriver1;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Sheet;
import jxl.Workbook;

//this class is used to enter data in fb app by reading cell contents from excel
//find element by ID's which are in sheet1 contents
public class ExcelData2 {

	public static void main(String[] args) throws Exception{
	FileInputStream fi =new FileInputStream("C:\\Users\\sudha\\Desktop\\WebDriver\\testdata1.xls");	
	Workbook wb=Workbook.getWorkbook(fi);
	Sheet s=wb.getSheet("Sheet1");
	WebDriver driver=new FirefoxDriver();
	driver.get(s.getCell(0, 0).getContents());
	driver.manage().window().maximize();
	//by.id("email")-email string is in excel,so cell contents are taken.
	//similarly value for email--sendKeys("sudha")
	driver.findElement(By.id(s.getCell(1, 0).getContents())).sendKeys(s.getCell(2, 0).getContents());
	driver.findElement(By.id(s.getCell(3, 0).getContents())).sendKeys(s.getCell(4, 0).getContents());
	
	
	}

}
