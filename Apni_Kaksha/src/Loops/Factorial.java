package Loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int fact=1;
//		for(int i=1;i<=n;i++) {
//			fact=fact*i;
//		}
		for(int i=n;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
