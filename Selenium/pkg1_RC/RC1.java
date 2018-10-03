package pkg1_RC;

import com.thoughtworks.selenium.DefaultSelenium;

public class RC1 {

	public static void main(String[] args) {
		
		DefaultSelenium s=new DefaultSelenium("localhost", 4444, 
		"*firefox C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe", "http://");
		//Other browsers are not used usually in RC, but specified below only for reference purpouse
		//DefaultSelenium s=new DefaultSelenium("localhost", 4444, 
				//"*chrome C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe","http://");
		//DefaultSelenium s=new DefaultSelenium("localhost", 4444, 
				//"*iexplore C:\\Program Files (x86)\\Internet Explorer\\iexplore.exe","http://");
s.start();
s.open("https://www.facebook.com/login.php");
s.windowMaximize();
s.stop();

	}

}
