import java.util.Scanner;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int t=s.nextInt();
		int row=2*t-1;
		for(int i=1;i<=row;i++) {
			if(i<=t) {
				for(int j=1;j<=t-i;j++) {
					System.out.print(" ");
				}
									
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
				}
			}
			else {
				
				for(int j=1;j<=i-t;j++) {
					System.out.print(" ");
				}
					
					for(int j=1;j<=row-i+1;j++) {
						System.out.print("* ");
					}
			}
			System.out.println();
		}
	}

}
