package webdriver1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//to get all link names and select boxes in the page
public class SimilarElements {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		List<WebElement> elems=driver.findElements(By.tagName("a"));
		System.out.println("a tag elements:"+elems.size());
		//to display links starting with c
		for(int i=0;i<elems.size();i++) {
			String linkval=elems.get(i).getText();
			if(linkval.startsWith("C")==true) {
				System.out.println("link is:"+linkval);
			}
		}
		
		List<WebElement> selects=driver.findElements(By.tagName("select"));
		System.out.println("list elements:"+selects);
		//driver.close();

	}

}
