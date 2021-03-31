package nestedForLoops;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		
		for(int i=1;i<=t;i++)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print("  ");
			}
			
			for(int j=1;j<=t-i+1;j++)	
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
