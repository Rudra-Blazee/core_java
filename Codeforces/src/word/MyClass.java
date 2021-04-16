package word;
import java.util.Scanner;
public class MyClass {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in); 
		String st1=s.nextLine();
		
		int up=0,low=0;
		String st2="";
		
		for(int i=0;i<st1.length();i++) {
			char ch=st1.charAt(i);
			if(ch >='A' && ch<='Z') {
				up++;
			}
			else if(ch >= 'a' && ch <= 'z') {
				low++;
			}
		}
		if(up>low) {
			 st2=st1.toUpperCase();
		}
		else {
			st2=st1.toLowerCase();
		}
		
		System.out.println(st2);
		
	}
}

