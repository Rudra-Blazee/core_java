package nestedForLoops;

import java.util.Scanner;

public class Pattern7Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		int a=1;
		for(int i=1;i<=t;i++)
		{
			for(int j=1;j<=t-i;j++)
			{
				System.out.print("  ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(a+"  ");
				a++;
			}
			System.out.println();
		}
	}

}
