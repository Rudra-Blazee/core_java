package bearAndBigBrother;
import java.util.Scanner;
public class MyClass {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int i=0;
		while(a<=b) {
			a=a*3;
			b=b*2;
			i++;
		}
		System.out.println(i);
	}
}
