package nestedForLoops;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		
		System.out.println("*");
		
		for(int i=2;i<=t-1;i++)
		{
			
			System.out.print("* ");
			
			for(int j=1;j<=i-2;j++)
			{
				System.out.print("  ");
			}
			System.out.println("*");
		}
		
		for(int i=1;i<=t;i++)
		{
			System.out.print("* ");
		}
	}

}
