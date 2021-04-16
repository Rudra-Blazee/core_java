package elephant;
import java.util.Scanner;
public class MyClass {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		
		int sum=0;
		int x=0;
		for(int i=5;i>0;i--) {
			
			x=t/i;
			t=t%i;
			
			sum=sum+x;
			
			if(t==0) {
				System.out.println(sum);
				break;
			}
		}
		
	}
}
