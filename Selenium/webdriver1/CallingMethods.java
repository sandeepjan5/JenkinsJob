package webdriver1;

public class CallingMethods {

	public static void main(String[] args) {
		methods1.launchApp("https://www.facebook.com/");
		methods1.elementPresent("email", true);
		methods1.elementPresent("month", false);
		//methods1.closeApp();

	}

}
