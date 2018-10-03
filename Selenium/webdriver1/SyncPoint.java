package webdriver1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//to show explicit and implicit wait
public class SyncPoint {

	public static void main(String[] args) throws Exception{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//explicit wait,will wait irrespective of conditions
		//explicit wait refers to a element in particular 
		driver.findElement(By.id("email")).sendKeys("sudha");
		Thread.sleep(30000);//wait for 30 secs after entering email
		driver.findElement(By.id("pass")).sendKeys("123");
		
		//implicit wait, will wait for given time only if condition is not satisfied
		//will not wait if condn is satisfied like page loading or element available
		//implicit wait is not related to any element
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/div[1]/input")).sendKeys("sudhapalla");
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input")).sendKeys("1234567");
		
		
		
		
		

	}

}
