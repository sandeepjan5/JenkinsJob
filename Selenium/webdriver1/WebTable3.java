package webdriver1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//used to get no. of rows in table from 1st col,check for a company value,
//print % change
public class WebTable3 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://nseindia.com/");
		driver.manage().window().maximize();
		WebElement table=driver.findElement(By.xpath("//*[@id='losersDiv']/table/tbody/tr[3]/td[1]"));
		List<WebElement> rc=table.findElements(By.tagName("a"));
		for(int i=1;i<=rc.size();i++) {
			String val=driver.findElement(By.xpath("//*[@id='losersDiv']/table/tbody/tr[3]/td[1]/a["+i+"]")).getText();
			if(val.equals("IOC")) {
				System.out.println("IOC is avilable");
			}
			System.out.println(val);
		}
		

	}

}
