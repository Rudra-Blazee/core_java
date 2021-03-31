package Code;

import java.util.*;

public class Divisible {
	
	public void Check(int num) {
		for(int i=1;i<=num;i++) {
			if(i%3==0 && i%5==0)
			{
				System.out.println(i +" = Fizz");
			}
			else if(i%3==0)
			{
			System.out.println(i +" = Buzz");
			}
			else if(i%5==0) {
				System.out.println(i +" = Fuzz");
			}
			else if(i%3!=0 && i%5!=0)
			{
				System.out.println(i + " = Ruzz");
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter A number");
		Scanner s = new Scanner(System.in);
		int num=s.nextInt();
		Divisible postDivisible = new Divisible();
		postDivisible.Check(num);
	}

}
