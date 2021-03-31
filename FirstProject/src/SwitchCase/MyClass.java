package SwitchCase;

import java.util.Scanner;

public class MyClass 
{

	public static void main(String[] args) 
	{
	System.out.println("Enter a number");
	Scanner scan = new Scanner (System.in);
	int t = scan.nextInt();
	scan.close();
	int score = t;
	switch (score)
	{
	case 90 :
		System.out.println("very good");
		break;
	
	case 50 :
		System.out.println("good");
		break;
		
	case 33 :
		System.out.println("pass");
		break;
		
	default :
		System.out.println("input is not valid");
		break;
		
	
	}

	}

}
