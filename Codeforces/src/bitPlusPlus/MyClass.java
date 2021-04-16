package bitPlusPlus;

import java.util.Scanner;

public class MyClass {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		s.nextLine();
		int sum=0;
		for(int i=0;i<t;i++) {
			
			String a=s.nextLine();
			
			if(a.charAt(1)=='+') {
				sum++;
			}
			else if(a.charAt(1)=='-') {
				sum--;
			}
		}
		System.out.println(sum);
	}
}
