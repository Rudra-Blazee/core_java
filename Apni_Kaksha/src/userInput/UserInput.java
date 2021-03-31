package userInput;
import java.util.Scanner;


public class UserInput {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Find Principal");
		System.out.println("Principle : ");
		int p=s.nextInt();
		System.out.println("Time :");
		int t=s.nextInt();
		System.out.println("Rate Of Interest:");
		double r=s.nextDouble();
		double simpleInterest = p*t*r /100;
		System.out.println("Simple Interest Is : " + simpleInterest);
		
	}

}
