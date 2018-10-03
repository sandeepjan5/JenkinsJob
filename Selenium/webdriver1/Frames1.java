package webdriver1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//used to switch to a frame and work on links in frame in java api
public class Frames1 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		
		//switch to 1st frame(contains java pkgs) and count no.of links in it
		WebElement frame1=driver.findElement(By.name("packageListFrame"));
		//driver.switchTo().frame(frame1)---switch to the frame1
		//then find elems in frame1
		List<WebElement> pkg_list=driver.switchTo().frame(frame1).findElements(By.tagName("a"));
		//System.out.println(pkg_list.size());
		System.out.println(pkg_list.get(0).getText());
		
		
		

	}

}
