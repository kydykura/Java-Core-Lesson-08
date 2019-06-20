package logos.lviv.lgs.task3;

import java.util.Scanner;

public class Application {

	private static Scanner sc;

	public static void main(String[] args) {

		sum();
		
	}
	
	public static void sum() {
					
		sc = new Scanner(System.in);
		System.out.println("Enter first number");
	while(!sc.hasNextInt()) {
		String a = sc.next();
		System.out.println("Error, first number is not integer. Enter integer number");
	}
	int x = sc.nextInt();
	System.out.println("Enter second number");
	while(!sc.hasNextInt()) {
		String b = sc.next();
		System.out.println("Error, second number is not integer. Enter integer number");
	}
	int y = sc.nextInt();
	 System.out.println(x+y);
	}
}
	

