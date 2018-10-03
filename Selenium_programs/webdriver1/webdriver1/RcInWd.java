package webdriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;
//class to use RC in WebDriver
public class RcInWd {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebDriverBackedSelenium back=new WebDriverBackedSelenium(driver, "http://");
		back.type("id=email", "sudha");
		back.type("id=pass", "123");
		driver.findElement(By.id("day")).sendKeys("18");
		driver.findElement(By.id("month")).sendKeys("May");
		back.select("id=year", "1982");
		

	}

}
