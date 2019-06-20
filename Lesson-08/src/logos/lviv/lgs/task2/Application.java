package logos.lviv.lgs.task2;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		runScanner();
	}

	public static void runScanner() {
		
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
				
		if (sc.hasNextInt()) {
			int a = sc.nextInt();
			if (a%2 == 0) {
				System.out.println("parne");
			} else {
				System.out.println("ne parne");
			}
			
		} else {
			System.out.println("Error, number is not integer");
		}
		
	}
	
}
