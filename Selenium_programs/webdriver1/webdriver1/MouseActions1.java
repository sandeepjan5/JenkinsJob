package webdriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

//used to implement mouse actions
public class MouseActions1 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://nseindia.com/");
		driver.manage().window().maximize();
		
		//with actions object mouse cursor is moved to a menu and an item from it is clicked
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("html/body/div[2]/div[1]/div[4]/ul/li[4]/a"))).build().perform();
		driver.findElement(By.xpath("html/body/div[2]/div[1]/div[4]/ul/li[4]/div/ul/li[1]/ul/li[1]/a")).click();

	}

}
