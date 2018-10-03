package webdriver1;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

//this class is to get all rows n cols in excel with for loop
public class ExcelLoop1 {

	public static void main(String[] args) throws Exception{
		FileInputStream fi =new FileInputStream("C:\\Users\\sudha\\Desktop\\WebDriver\\testdata1.xls");
		Workbook wb=Workbook.getWorkbook(fi);
		Sheet s=wb.getSheet("Sheet1");
		//to print all rows in sheet,reads till EOF, even null printed
		int rc=s.getRows();
		for(int i=0;i<rc;i++) {
			//System.out.println(s.getCell(0, i).getContents());
		}
		
		//to get all columns data in a sheet
		int cc=s.getColumns();
		for(int j=0;j<cc;j++) {
			//System.out.println(s.getCell(j, 0).getContents());
		}
		
		//to get both rows n cols data
		for(int i=0;i<cc;i++) {
			for(int j=0;j<rc;j++) {
				//System.out.println(s.getCell(i, j).getContents());
			}
		}
		
		//if condn in for loop to print specific data only

		for(int i=0;i<cc;i++) {
			for(int j=0;j<rc;j++) {
				String val=s.getCell(i, j).getContents();
				if(val.equals("email"))
				System.out.println("val is available in sheet:"+val);
			}
		}
	}

}
