package soldierAndBanana;
import java.util.Scanner;
public class MyClass {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		int k=s.nextInt();
		int n=s.nextInt();
		int w=s.nextInt();
		int x=0,y=0;
		for(int i=1;i<=w;i++) {
			x=k*i;
			y=y+x;
		}
		if(y>n) {
		k=y-n;
		System.out.println(k);
		}
		else
		System.out.println("0");
	}
}
