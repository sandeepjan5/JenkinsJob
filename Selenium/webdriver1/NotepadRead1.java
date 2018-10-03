package webdriver1;

import java.io.BufferedReader;
import java.io.FileReader;

//class used to read data from notepad
public class NotepadRead1 {

	public static void main(String[] args) throws Exception{
		FileReader fr=new FileReader("C:\\Users\\sudha\\Desktop\\WebDriver\\driver1.txt");
		BufferedReader bf=new BufferedReader(fr);
		//this stmt reads only first line from notepad
		//System.out.println(bf.readLine());
		//read all lines in notepad
		String s;
		while((s=bf.readLine())!=null) {
			System.out.println(s);
		}
	}

}
