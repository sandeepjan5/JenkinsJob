package webdriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class wd2 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("sudha");
		driver.findElement(By.id("day")).sendKeys("24");
		driver.findElement(By.id("u_0_8")).click();
		driver.findElement(By.id("email")).clear();
		//driver.close();

	}

}
