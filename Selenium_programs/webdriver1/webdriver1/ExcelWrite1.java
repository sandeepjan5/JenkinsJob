package webdriver1;

import java.io.FileOutputStream;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

//used to write data to excel
public class ExcelWrite1 {

	public static void main(String[] args) throws Exception {
	FileOutputStream fo=new FileOutputStream("C:\\Users\\sudha\\Desktop\\WebDriver\\output.xls");
	WritableWorkbook wwb=Workbook.createWorkbook(fo);
	WritableSheet ws=wwb.createSheet("Result1", 1);
	//creating cells with label
	Label l1=new Label(0, 0, "cr1");
	Label l2=new Label(0, 1, "cr2");
	ws.addCell(l1);
	ws.addCell(l2);
	//whole excel saved with write
	wwb.write();
	wwb.close();
}

}
