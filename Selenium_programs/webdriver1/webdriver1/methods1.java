package webdriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//commonly used methods which can be invoked in another classes
//these methods called in calling methods
public class methods1 {
	static WebDriver driver;
	
	public static void launchApp(String url) {
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
	} 
	public static void elementPresent(String locator,boolean exp) {
		boolean a=driver.findElement(By.id(locator)).isDisplayed();
		if(a==exp) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
	}
	public static void closeApp() {
		driver.close();
	}

	public static void main(String[] args) {
		

	}

}
