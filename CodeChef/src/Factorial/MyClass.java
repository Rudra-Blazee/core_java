package Factorial;

import java.util.Scanner;

public class MyClass 
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		long t = scan.nextInt();
		for(long i=0;i<t;i++)
		{
			long k=1;
			long a = scan.nextInt();
			for(long j=1;j<=a;j++)
			{
				k=k*j;
				
			}
			System.out.println(k);
		}

	}

}
