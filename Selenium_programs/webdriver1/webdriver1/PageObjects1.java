package webdriver1;

import org.openqa.selenium.By;

//page object model(POM) is 
//used to create objects for identified elements with respective locators
//these objects are not within main
//they r called in callingpageobjects class
public class PageObjects1 {

	//first method for creating page objects
	By uid=By.id("email");
	By pwd=By.id("pass");
	

}
