import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		
		int t=s.nextInt();
			for(int i=1;i<=t;i++) {
				int a=1;
				for(int j=1;j<=t-i;j++) {
					System.out.print("  ");
				}
				for(int j=1;j<=i-1;j++) {
					System.out.print(a+" ");
					a++;
				}
				a--;
				for(int j=1;j<=i-2;j++) {
					a--;
					System.out.print(a+" ");	
				}	
				System.out.println();
		}
						
	}

}
