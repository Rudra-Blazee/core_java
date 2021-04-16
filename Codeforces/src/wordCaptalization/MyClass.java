package wordCaptalization;
import java.util.Scanner;
public class MyClass {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		int index=0;
		char x=a.charAt(index);
		char md=Character.toUpperCase(x);
		
		StringBuilder string = new StringBuilder(a);
        string.setCharAt(index,md);
        
        System.out.println(string);
	}
}
