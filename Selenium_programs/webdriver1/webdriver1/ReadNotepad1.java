package webdriver1;

import java.io.BufferedReader;
import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//class used to read data from notepad and enter in fb app
public class ReadNotepad1 {

	public static void main(String[] args) throws Exception{
		FileReader fr=new FileReader("C:\\Users\\sudha\\Desktop\\WebDriver\\driver1.txt");
		BufferedReader bf=new BufferedReader(fr);
		String s=bf.readLine();
		//split read line with space
		String[] val=s.split(" ");
		WebDriver driver=new FirefoxDriver();
		driver.get(val[0]);
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys(val[1]);
		driver.findElement(By.id("pass")).sendKeys(val[2]);

	}

}
