package webdriver1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//used to count no.of rows and no. of cols in web table
public class WebTable1 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://nseindia.com/");
		driver.manage().window().maximize();
		
		//below step is o find only the web table location
		WebElement table1=driver.findElement(By.xpath("//*[@id='gainersDiv']/table/tbody"));
		
		//table.findelems is mentioned instead of driver obj bcoz rows shuld
		//be searched in particular area i.e; table n not in whole page 
		List<WebElement> rc=table1.findElements(By.tagName("tr"));
		System.out.println(rc.size());
		
		//consider webele till 2nd row to get the table headers
		WebElement table2=driver.findElement(By.xpath("//*[@id='gainersDiv']/table/tbody/tr[2]"));
		//gives the column count
		List<WebElement> hc=table2.findElements(By.tagName("td"));
		System.out.println(hc.size());
		
		//other way of getting text by concatenating xpath
		
		String xpath1="//*[@id='gainersDiv']/table/tbody/tr[3]";
		String xpath2="/td[1]/a[1]";
		System.out.println(driver.findElement(By.xpath(xpath1+xpath2)).getText());
		
		

	}

}
