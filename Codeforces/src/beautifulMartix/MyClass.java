package beautifulMartix;
import java.util.Scanner;
public class MyClass {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int m[][]=new int[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				m[i][j]=s.nextInt();
			}
		}
		int sum1=0,sum2=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(m[i][j]==1) {
					
					if(i<=2) {
						sum1=2-i;
					}
					if(i>2) {
						sum1=i-2;
					}
					if(j<=2) {
						sum2=2-j;
					}
					if(j>2) {
						sum2=j-2;
					}
				}
				
			}
			
		}
		sum1=sum1+sum2;
		System.out.println(sum1);
	}
}
