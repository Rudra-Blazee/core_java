package UserInput;

import java.util.Scanner;

public class Repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
	 	Scanner scan = new Scanner (System.in);
		System.out.println("Enter some number");
		int user_input_number =  scan.nextInt();
		
		System.out.println("The entered number is ");
		System.out.print(user_input_number); 
		
	2.	Scanner scan1 = new Scanner (System.in);
		System.out.println("Enter some decimal value");
		double user_input_decimal =  scan1.nextDouble();
		
		System.out.println("The entered decimal is ");
		System.out.print(user_input_decimal);*/
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter some string : ");
		String user_input_string = scan2.nextLine();
		
		System.out.println("The entered string is :");
		System.out.print(user_input_string);
		
	}

}
