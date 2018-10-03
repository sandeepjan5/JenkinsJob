package webdriver1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//used to implement webdriverwait for synchronization point
public class WebDriverWait1 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//click on data policy link,it opens in another window
		driver.findElement(By.id("privacy-link")).click();
		
		//get the no. of windows opened
		ArrayList al=new ArrayList(driver.getWindowHandles());
		//switch to data policy window is at index 1 
		System.out.println(driver.switchTo().window((String)al.get(1)).getTitle());
		
		//webdriver wait does not wait till max time mentioned
		//will continue execution immediately after condition is satisfied
		WebDriverWait wd=new WebDriverWait(driver, 30);
		wd.until(ExpectedConditions.titleContains("Data Policy"));
		
		

	}

}
