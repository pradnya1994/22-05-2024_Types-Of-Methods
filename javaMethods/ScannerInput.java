package javaMethods;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	
		
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		scanner.close();
		
		System.out.println("My name is: "+name);
		
	}

}
