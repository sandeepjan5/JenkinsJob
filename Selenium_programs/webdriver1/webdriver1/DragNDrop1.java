package webdriver1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

//used to implement drag n drop action
public class DragNDrop1 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		
		List<WebElement> imgs=driver.findElements(By.tagName("img"));
		
		for(int i=0;i<imgs.size();i++) {
			System.out.println("i val:"+i+imgs.get(i).getClass());
		}
		//drag n drop action
		a.dragAndDrop(imgs.get(0), imgs.get(1)).build().perform();

	}

}
