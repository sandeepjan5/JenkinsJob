package webdriver1;

import java.util.Scanner;

//used to enter n read data from console
public class ConsoleRead1 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter A value:");
		int a=s.nextInt();
		System.out.println("Enter B value");
		int b=s.nextInt();
		System.out.println(a*b);
	}

}
