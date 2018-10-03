package webdriver1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//class used to implement 2nd method in pageobjectmodel(POM)
//objects should not be within main method
public class PageObjects2 {
	@FindBy(id="email") WebElement uid1;
	@FindBy(id="pass") WebElement pswd1;
	

}
