package boyOrGirl;
import java.util.Scanner;
public class MyClass {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		String st=s.nextLine();
		String al="abcdefghijklmnopqrstuvwxyz";
		int sum=0,x=0;
		for(int i=0;i<st.length();i++) {
			for(int j=0;j<al.length();j++) {
				if(st.charAt(i)==al.charAt(j) && i!=j) {
					x=1;
					System.out.println(al.charAt(j));
				}
			}
			sum=sum+x;
		}
		if(sum%2==0) {
			System.out.println("CHAT WITH HER!");
		}
		else {
			System.out.println("IGNORE HIM!");
		}
	}
}