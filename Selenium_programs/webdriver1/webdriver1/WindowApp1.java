package webdriver1;

//used to work on window app(File upload window) in wetransfer site with AutoIT
//import org.omg.SendingContext.RunTime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowApp1 {

	public static void main(String[] args) throws Exception{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://wetransfer.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("html/body/div/div/div[5]/div/div[2]/div/div/button")).click();
		driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div/div[2]/button")).click();
		driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div[1]/div[1]/div[1]/div[1]/div/h2")).click();
		//Till above step navigated till opening
		//File Upload window
		//Below command executes the AutoIt script 
		Runtime.getRuntime().exec("C:\\Users\\sudha\\Desktop\\autoit_1.exe");
	}

}
