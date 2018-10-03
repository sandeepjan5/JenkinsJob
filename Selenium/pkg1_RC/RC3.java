package pkg1_RC;

import com.thoughtworks.selenium.DefaultSelenium;

public class RC3 {

	public static void main(String[] args) {
		DefaultSelenium o=new DefaultSelenium("localhost", 4444, "*firefox C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe","http://");
		o.start();
		o.open("https://www.facebook.com/");
		o.windowMaximize();
		o.type("id=email", "sudha");
		boolean a=o.isElementPresent("id=pass");
		if(a==true) {
			System.out.println("pass,password is available");
		}
		else {
			System.out.println("fail,password is not available");
		}
		if(o.isElementPresent("id=u_0_h")==true) {
			System.out.println("pass,first name is available");
		}
		else {
			System.out.println("fail,fname is not available");
		}
		o.type("id=pass", "1234");
		if(o.isTextPresent("account")==true) {
			System.out.println("pass,account text available");
		}
		else {
			System.out.println("acount text not available");
		}

	}

}
