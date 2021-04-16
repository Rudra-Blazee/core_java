package nextRound;
import java.util.Scanner;

public class MyClass {

		public static void main(String[] args) {
			
			Scanner s=new Scanner(System.in);
			int x=s.nextInt();
			int y=s.nextInt();
			int sum=0;
			int[] a=new int[x];
			for(int i=0;i<x;i++) {
				a[i]=s.nextInt();
			}
			{
			for(int i=0;i<x;i++) {
				if(a[i]>=a[y-1] && a[i]>0) {
					sum++;
				}
			}
			}
			
			System.out.println(sum);
			
	}
}
