package webdriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//used to get data from a cell in web table using xpath 
public class WebTableData1 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://nseindia.com/");
		driver.manage().window().maximize();
		String val=driver.findElement(By.xpath("//*[@id='gainersDiv']/table/tbody/tr[3]/td[1]/a[2]")).getText();
		System.out.println(val);
		

	}

}
