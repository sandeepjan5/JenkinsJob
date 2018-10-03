package webdriver1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//used to handle multiple windows,close each window
public class MultipleWindows1 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='privacy-link']")).click();
		//store all opened window objects in array list
		ArrayList a=new ArrayList(driver.getWindowHandles());
		System.out.println(a.size());
		//loop through each window, switch to that window n close it
		for(int i=0;i<a.size();i++) {
			driver.switchTo().window((String)a.get(i)).close();
		}

	}

}
