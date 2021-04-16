package helpfullMaths;
import java.util.Scanner;
public class MyClass {
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		String a=s.nextLine();
		
		int t=a.length();
		int s1=0,s2=0,s3=0;
		if(t==1) {
			System.out.println(a);
		}
		else {
			for(int i=0;i<t;i=i+2) {
				if(a.charAt(i)=='1') {
					s1++;
				}
				if(a.charAt(i)=='2') {
					s2++;
				}
				if(a.charAt(i)=='3') {
					s3++;
				}
			}
			int index=0;
			char ch1='1';
			char ch2='2';
			char ch3='3';
			StringBuilder string = new StringBuilder(a);
			for(int j=0;j<s1*2;j=j+2) {
				
		        string.setCharAt(index, ch1);
		        index=index+2;
			}
			
			for(int j=0;j<s2*2;j=j+2) {
				
		        string.setCharAt(index, ch2);
		        index=index+2;
			}
			
			for(int j=0;j<s3*2;j=j+2) {
				
		        string.setCharAt(index, ch3);
		        index=index+2;
			}
			
			System.out.println(string);
		}
		
	}
}
