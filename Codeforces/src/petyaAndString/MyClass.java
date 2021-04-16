package petyaAndString;

import java.util.Scanner;

public class MyClass {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String x=s.nextLine();
		String y=s.nextLine();
		
		String str1=x.toLowerCase();
		String str2=y.toLowerCase();
		String str3="abcdefghijklmnopqrstuvwxyz";
		int sum1=0 , sum2=0;
			for(int i=0;i<str1.length();i++) {
				if(str1.charAt(i)==str2.charAt(i)) {
					
				}
				else {
					for(int j=0;j<str3.length();j++) {
						if(str3.charAt(j)==str1.charAt(i)) {
							sum1+=j;
						}
					}
					
					for(int j=0;j<str3.length();j++) {
						if(str3.charAt(j)==str2.charAt(i)) {
							sum2+=j;
						}
					}
					break;
				}
			}
		if(sum1<sum2) {
			System.out.println("-1");
		}
		else if(sum1==sum2) {
			System.out.println("0");
		}
		else if(sum1>sum2) {
			System.out.println("1");
		}
		
	}
}
