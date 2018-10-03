package webdriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpath1 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sudha");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("1234");
		WebElement fn=driver.findElement(By.xpath("//*[@id='u_0_h']"));
		fn.sendKeys("sudha");
		//fn.clear();
		WebElement sn=driver.findElement(By.xpath("//*[@id='u_0_j']"));
		sn.sendKeys("palla");
		//driver.findElement(By.xpath("//*[@id='js_6']/ul/li[7]/a")).click();
		driver.findElement(By.xpath("//*[@id='reg_pages_msg']/a")).click();
		

	}

}
