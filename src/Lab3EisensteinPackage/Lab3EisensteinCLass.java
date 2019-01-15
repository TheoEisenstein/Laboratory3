package Lab3EisensteinPackage;

import java.util.Scanner;

public class Lab3EisensteinCLass {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter your name:");
		String name = scnr.next();
		
		
		boolean run = true;
		while (run) {
	
		
		
		System.out.println("Please enter an integer between 1 and 100 being designated: " + name );
		int numb = scnr.nextInt();
		while (numb <= 0 || numb > 100) {
			System.err.println("Error, enter a number between 1 and 100. Don't be silly" + name);
			numb = scnr.nextInt();
		}
		
		
		
		if (numb%2 == 1 && numb< 60 ) {
			System.out.println("The number is Odd. " + numb);
		}
		
		else if (numb%2 == 0 && numb >= 2 && numb <=25) {
			System.out.println("The number is even and less than 25. " + name + "entered the number " + numb);
			
		}
		
		else if (numb%2 == 0 && numb >= 26 && numb <=60) {
				System.out.println("The number is even." + numb + " and the number is between 26 and 60.");
			}
		else if (numb%2 == 0 && numb >= 60) {
			System.out.println("The number entered is even. " +numb);
		}
		else if (numb%2 != 0 && numb >60) {
			System.out.println("The number is odd and over 60." +numb);
		}
		
		System.out.println("Would you like to continue entering numbers " + name + "? y/n");
		
		String getUserChoice1 = scnr.next() ;
		if (getUserChoice1.equals("n"))
			run = false;
		
		if (getUserChoice1.equals("n")) {
		System.out.println("Thank you for using this program " + name + ".");
		}
		else  {
			System.out.println("\n");
		}
		
		
		}	
	}}


