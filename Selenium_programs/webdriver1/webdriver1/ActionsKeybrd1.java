package webdriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

//class to perform actons with keyboard
public class ActionsKeybrd1 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		//to find ele forgot acc and click on the ele
		WebElement we1=driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a"));
		a.moveToElement(we1).click().build().perform();
		//to referesh the page
		a.sendKeys(Keys.F5).build().perform();
		//new tab with keyboard
		a.sendKeys(Keys.CONTROL+"t").build().perform();
		
		
		
		
		
		

	}

}
