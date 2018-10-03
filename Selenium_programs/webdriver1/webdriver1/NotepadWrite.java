package webdriver1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

//class used to write data to notepad 
public class NotepadWrite {

	public static void main(String[] args) throws Exception{
		FileWriter r=new FileWriter("C:\\Users\\sudha\\Desktop\\WebDriver\\wdwrite");
		BufferedWriter bw=new BufferedWriter(r);
		bw.write("this is the first line");
		bw.close();

	}

}
