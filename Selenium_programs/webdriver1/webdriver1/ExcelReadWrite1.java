package webdriver1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.eclipse.jdt.internal.compiler.ast.LabeledStatement;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

//class to read data from 2 files,concatnate and write to another file 
public class ExcelReadWrite1 {

	public static void main(String[] args) throws Exception{
		
		//read data in cell of first input file 
		FileInputStream fi1=new FileInputStream("C:\\Users\\sudha\\Desktop\\WebDriver\\abc.xls");
		Workbook wb1=Workbook.getWorkbook(fi1);
		Sheet s1=wb1.getSheet("Sheet7");
		String st1=s1.getCell(7, 8).getContents();
		System.out.println(st1);
		
		//read data in cell of 2nd input file
		FileInputStream fi2=new FileInputStream("C:\\Users\\sudha\\Desktop\\WebDriver\\xyz.xls");
		Workbook wb2=Workbook.getWorkbook(fi2);
		Sheet s2=wb2.getSheet("Sheet6");
		String st2=s2.getCell(9,10).getContents();
		System.out.println(st2);
		
		//write the concatenated string read from above 2 files into new file
		FileOutputStream fo=new FileOutputStream("C:\\Users\\sudha\\Desktop\\WebDriver\\result.xls");
		WritableWorkbook wwb=Workbook.createWorkbook(fo);
		WritableSheet ws=wwb.createSheet("Result", 1);
		Label l1=new Label(6, 7, st1+st2);
		ws.addCell(l1);
		wwb.write();
		wwb.close();
		

	}

}
