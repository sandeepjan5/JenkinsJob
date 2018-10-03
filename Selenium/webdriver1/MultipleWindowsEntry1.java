package webdriver1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//to handle multiple windows opened and enter data in the window 
public class MultipleWindowsEntry1 {

	public static void main(String[] args) throws Exception{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//to click on data policy link in fb app
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/form/div[1]/div[8]/p/a[2]")).click();
		
		//to know all the windows opened
		ArrayList al=new ArrayList<>(driver.getWindowHandles());
		System.out.println(al.size());
		System.out.println(driver.switchTo().window((String)al.get(1)).getTitle());
		
		//to switch to 2nd window to eneter email n pass in data policy win
		WebDriver win=driver.switchTo().window((String)al.get(1));
		
		//explicit wait given bcoz time is taken to load the data policy window
		//if sleep is not given error is thrown as element will not be visible until win is loaded
		Thread.sleep(30000);
		win.findElement(By.id("email")).sendKeys("sudha");
		win.findElement(By.id("pass")).sendKeys("pass");
		

	}

}
