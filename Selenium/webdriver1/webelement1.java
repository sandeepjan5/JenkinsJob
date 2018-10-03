package webdriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//to create webelement obj for an element
public class webelement1 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email=driver.findElement(By.id("email"));
		System.out.println("email webelemnt obj:"+email);
		email.sendKeys("sudha");
	    System.out.println("email is available:"+email.isDisplayed());
	    System.out.println("email is enabled:"+email.isEnabled());
	    System.out.println("email is selected:"+email.isSelected());
	    email.clear();
		//driver.close();

	}

}
