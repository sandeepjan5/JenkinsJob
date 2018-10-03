package pkg1_RC;

import com.thoughtworks.selenium.DefaultSelenium;

public class RC4 {

	public static void main(String[] args) {
		DefaultSelenium o =new DefaultSelenium("localhost", 4444, "*firefox C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe","http://");
		o.start();
		o.open("https://www.facebook.com/");
		o.windowMaximize();
		String title=o.getTitle();
		System.out.println("title is"+title);
		if(title.startsWith("F")==true) {
			System.out.println("pass,title starts with F");
		}
		else {
			System.out.println("fail");
		}
		if(title.endsWith("m")==true) {
			System.out.println("pass,title ends with m");
		}
		else {
			System.out.println("fail");
		}
		if(title.length()==20) {
			System.out.println("pass,length is 20");
		}
		else {
			System.out.println("fail");
		}
		if(title.contains("k")==true) {
			System.out.println("pass,title contains k");
		}
		else {
			System.out.println("fail");
		}
		o.type("id=email", "sudharani.palla@gmail.com");
		if(o.isElementPresent("id=pass")&&o.isEditable("id=pass")) {
			System.out.println("pass,password field is available and editable");
		}
		else {
			System.out.println("fail");
		}
		o.type("id=pass", "1234");
		if(o.isElementPresent("id=u_0_h")) {
			System.out.println("pass,firstname is available");
		}
		else {
			System.out.println("fail");
		}
		if(o.isEditable("id=u_0_h")==false) {
			System.out.println("pass, fname is not editable");
		}
		else {
			System.out.println("fail");
		}
		if(o.isTextPresent("amount")) {
			System.out.println("amount text present");
		}
		else {
			System.out.println("fail");
		}
		o.type("id=u_0_h", "sudha");
		if(o.isTextPresent("amounts")==false) {
			System.out.println("pass,amounts text not available");
		}
		else {
			System.out.println("fail");
		}
		if(o.isElementPresent("id=day")) {
			System.out.println("pass,day elem is present");
		}
		else {
			System.out.println("fail");
		}
		o.select("id=day", "18");
		o.select("id=month", "May");
		if(o.isChecked("id=u_0_7")==false) {
			System.out.println("pass,female is not checked");
		}
		else {
			System.out.println("fail");
		}
		if(o.isChecked("id=u_0_8")==true) {
			System.out.println("pass,male is checked");
		}
		else {
			System.out.println("fail");
		}
		o.open("https://login.yahoo.com/config/login_verify2?rl=1");
		String yahootitle=o.getTitle();
		if(yahootitle.length()==10) {
			System.out.println("pass,yahoo title is 10");
		}
		else {
			System.out.println("fail");
		}
		if(yahootitle.length()<title.length()) {
			System.out.println("pass,yahoo title len less than fb title");
		}
		else {
			System.out.println("fail");
		}
		
	}

}
