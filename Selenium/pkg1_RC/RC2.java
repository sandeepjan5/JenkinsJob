package pkg1_RC;

import com.thoughtworks.selenium.DefaultSelenium;

public class RC2 {

	public static void main(String[] args) {
		DefaultSelenium o=new DefaultSelenium("localhost", 4444, "*firefox C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe","http://");
		o.start();
		o.open("https://www.facebook.com/");
		o.windowMaximize();
		o.type("id=email", "sudha");
		o.type("id=pass", "1234");
		o.select("id=day", "18");
		o.select("id=month", "May");
		o.check("id=u_0_8");
		o.click("id=u_0_z");

	}

}
