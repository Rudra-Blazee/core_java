package team;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		int ps=0;
		for(int i=0;i<t;i++) {
			
			int a=s.nextInt();
			int b=s.nextInt();
			int c=s.nextInt();
			int sum=0;
			sum=a+b+c;
			if(sum>=2) {
				ps++;
			}
		}
		System.out.println(ps);
	}

}
