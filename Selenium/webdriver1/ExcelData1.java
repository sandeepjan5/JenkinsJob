package webdriver1;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

//Read data from excel sheet 
public class ExcelData1 {

	public static void main(String[] args) throws Exception {
		FileInputStream fi=new FileInputStream("C:\\Users\\sudha\\Desktop\\WebDriver\\testdata1.xls");
		Workbook wb=Workbook.getWorkbook(fi);
		Sheet s=wb.getSheet("Sheet1");//sheet name is case sensitive
		System.out.println(s.getColumns());
		System.out.println(s.getCell(0,0).getContents());
		System.out.println(s.getCell(2, 0).getContents());
		System.out.println(s.getCell(3, 0).getContents());
		System.out.println(s.getCell(4, 0).getContents());

	}

}
