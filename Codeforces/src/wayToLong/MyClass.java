package wayToLong;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		s.nextLine();
		for(int i=0;i<t;i++) {
			
			String st=s.nextLine();
			
			Integer n=st.length();
			if(n<=10) {
				System.out.println(st);
			}
			else {
				n=n-2;
				System.out.println(st.charAt(0)+n.toString()+st.charAt(n+1));
			}
		}
	}

}
