package webdriver1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//to get url,email and pswd loc and value and enter in fb app 
public class ConsoleForApp {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter url");
		String url=s.next();
		System.out.println("Enter email locator");
		String emailloc=s.next();
		System.out.println("enter email value");
		String emailval=s.next();
		System.out.println("enter pswd locator");
		String pswdloc=s.next();
		System.out.println("enter pswd value");
		String pval=s.next();
		
		WebDriver driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.id(emailloc)).sendKeys(emailval);
		driver.findElement(By.id(pswdloc)).sendKeys(pval);
		
				

	}

}
