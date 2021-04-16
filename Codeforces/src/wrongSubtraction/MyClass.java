package wrongSubtraction;
import java.util.Scanner;
public class MyClass {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int t=0;
		for(int i=0;i<k;i++) {
			t=n%10;
			if(t==0) {
				n=n/10;
			}
			else {
				n=n-1;
			}
		}
		System.out.println(n);
	}
}
