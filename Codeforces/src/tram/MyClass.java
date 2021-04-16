package tram;
import java.util.Scanner;
public class MyClass {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		int sum=0, j=0;
		for(int i=0;i<t;i++) {
			
			int a=s.nextInt();
			int b=s.nextInt();
			
			sum=sum-a;
			sum=sum+b;
			if(sum>j) {
				j=sum;
			}	
		}
		System.out.println(j);
	}
}
