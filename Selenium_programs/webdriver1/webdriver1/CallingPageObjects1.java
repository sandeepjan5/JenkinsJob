package webdriver1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//class used to call the pageobjects class objects
public class CallingPageObjects1 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		PageObjects1 po1=new PageObjects1();
		//elements are identified in pageobjects are used here 
		driver.findElement(po1.uid).sendKeys("sudha");
		driver.findElement(po1.pwd).sendKeys("123");

	}

}
