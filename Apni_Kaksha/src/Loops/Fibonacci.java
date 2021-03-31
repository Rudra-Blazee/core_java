package Loops;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		int a=0 , b=1, sum=0;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=0;i<t-2;i++)
		{
			
			sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
			
		}
	}

}
