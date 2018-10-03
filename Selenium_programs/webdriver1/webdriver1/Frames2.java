package webdriver1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames2 {

	public static void main(String[] args) throws Exception{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		//switch to 2nd frame9contains java classes) and count no. of links in it
		WebElement frame2=driver.findElement(By.name("packageFrame"));
		
		//driver.switchTo().frame(frame2)---stmt used to switch to the frame
		//then find the elems in that frame
		List<WebElement> class_list=driver.switchTo().frame(frame2).findElements(By.tagName("a"));
		System.out.println(class_list.size());
		//System.out.println(class_list.get(0).getText());
		class_list.get(0).click();
		
		//switch to parent frame as direct switch from 1 frame to another is not possible
		driver.switchTo().parentFrame();
		
		//below code to switch to another frame
		WebElement frame3=driver.findElement(By.name("classFrame"));
		//driver.switchTo().frame(frame3);
		List<WebElement> class_links=driver.switchTo().frame(frame3).findElements(By.tagName("a"));
		for(int i=0;i<class_links.size();i++) {
			System.out.println(class_links.get(i).getText());
		}

	}

}
