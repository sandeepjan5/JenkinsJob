package webdriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//to verify status of the elements
public class displayed1 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		boolean a=driver.findElement(By.id("pass")).isDisplayed();
		if(a==true) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}

	}

}
