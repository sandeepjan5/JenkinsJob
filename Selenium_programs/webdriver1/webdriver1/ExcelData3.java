package webdriver1;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Sheet;
import jxl.Workbook;

//used to enter data in fb app with the xpath of elems in excel
public class ExcelData3 {

	public static void main(String[] args) throws Exception{
		FileInputStream fi =new FileInputStream("C:\\Users\\sudha\\Desktop\\WebDriver\\testdata1.xls");
		Workbook wb=Workbook.getWorkbook(fi);
		Sheet s=wb.getSheet("Sheet1");
		WebDriver driver=new FirefoxDriver();
		driver.get(s.getCell(0, 0).getContents());
		driver.manage().window().maximize();
		driver.findElement(By.xpath(s.getCell(0, 1).getContents())).sendKeys(s.getCell(1, 1).getContents());
		driver.findElement(By.xpath(s.getCell(2, 1).getContents())).sendKeys(s.getCell(3, 1).getContents());
	}

}
