package stoneOnTheTable;
import java.util.Scanner;
public class MyClass {
	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		int t=s.nextInt();
		s.nextLine();
		String st=s.nextLine();
		
		int sum=0;
		for(int i=0;i<t-1;i++) {
			if(st.charAt(i)==st.charAt(i+1)) {
				sum++;
			}
		}
		System.out.println(sum);
	}
}
