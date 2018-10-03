package webdriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//to get url and other properties of the element
public class url1 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String url=driver.getCurrentUrl();
		System.out.println("current url:"+url);
		String cl =driver.findElement(By.id("email")).getAttribute("class");
		System.out.println("class of email:"+cl);
		String tg=driver.findElement(By.id("email")).getTagName();
		System.out.println("tag name is:"+tg);
	
		System.out.println("size is:"+driver.findElement(By.id("email")).getSize());
		System.out.println("rect is:"+driver.findElement(By.id("email")).getRect());
		System.out.println("title is:"+driver.getTitle());
		//System.out.println("page source:"+driver.getPageSource());

	}

}
