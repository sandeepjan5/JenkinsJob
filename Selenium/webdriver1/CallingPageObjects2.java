package webdriver1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class CallingPageObjects2 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		PageObjects2 po2=PageFactory.initElements(driver, PageObjects2.class);
		po2.uid1.sendKeys("sudha");
		po2.pswd1.sendKeys("123");

	}

}
