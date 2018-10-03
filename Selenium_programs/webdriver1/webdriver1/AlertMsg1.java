package webdriver1;

//used to close the Alert msg dispalyed in rediffmail
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertMsg1 {

	public static void main(String[] args) throws Exception{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.rediff.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='homewrapper']/div[5]/a[1]/div/u")).click();
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click();
		Alert a=driver.switchTo().alert();
		Thread.sleep(5000);
		a.dismiss();

	}

}
